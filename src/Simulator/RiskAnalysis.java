//Source file: C:/Meic/Tese/VigilanciaRoboticoCaseStudy/Codigo/Simulator/RiskAnalysis.java

package Simulator;
import SimulatorPlatform.*;
import DataRepository.*;
import java.lang.*;
import java.io.*;
import java.util.*;


/**
 * @author
 * @version
 */
public class RiskAnalysis
{
   DataAcessor m_AcessoRsks;
   Expression m_exp;
   ArrayList pilha;

   public RiskAnalysis()
   {
     System.out.println("\t1.2: Risk Analysis created...");
     WriteFile.Writeln("\t1.2: Risk Analysis created...",Constants.pathOutputFile,Constants.OutputFile);
     m_AcessoRsks=new DataAcessor(new RiskMappings());
     pilha = new ArrayList();
   }


   public String VerificaLigacao (String link1, String link2, ArrayList m_vars_list)
   {
     if  (CheckVariableValue(link1, m_vars_list) != 0)
     return ("3");
     else if (CheckVariableValue(link2, m_vars_list) != 0)
     return ("2");
     else return("1");
   }


   ///////////////////////////////////////////////////////////
   //  Cria a lista de riscos violados
   ///////////////////////////////////////////////////////////
   public ArrayList execute(ArrayList m_vars_list)
   {
      System.out.println( m_vars_list.toString());
      WriteFile.Writeln( m_vars_list.toString(),Constants.pathOutputFile,Constants.OutputFile);

      String Ligacao_Gerador_No1 = VerificaLigacao (Constants.link0CircuitBreaker,Constants.link5CircuitBreaker, m_vars_list);
      String Ligacao_Gerador_No2 = VerificaLigacao (Constants.link1CircuitBreaker,Constants.link6CircuitBreaker, m_vars_list);
      String Ligacao_Gerador_No3 = VerificaLigacao (Constants.link2CircuitBreaker,Constants.link7CircuitBreaker, m_vars_list);
      String Ligacao_Gerador_No4 = VerificaLigacao (Constants.link3CircuitBreaker,Constants.link8CircuitBreaker, m_vars_list);
      String Ligacao_Gerador_No5 = VerificaLigacao (Constants.link4CircuitBreaker,Constants.link9CircuitBreaker, m_vars_list);

     //      Integer total_1 = new Integer();
      double total_1 = 0;
//      Integer total_2 = new Integer();
      double total_2 = 0;

      if (Ligacao_Gerador_No1.compareTo("3") == 0)   total_1 += CheckVariableValue(Constants.Node1PowerNeed, m_vars_list);
      else if (Ligacao_Gerador_No1.compareTo("2") == 0) total_2 += CheckVariableValue(Constants.Node1PowerNeed, m_vars_list);

      if (Ligacao_Gerador_No2.compareTo("3") == 0)   total_1 += CheckVariableValue(Constants.Node2PowerNeed, m_vars_list);
      else if (Ligacao_Gerador_No2.compareTo("2") == 0) total_2 += CheckVariableValue(Constants.Node2PowerNeed, m_vars_list);

      if (Ligacao_Gerador_No3.compareTo("3") == 0)   total_1 += CheckVariableValue(Constants.Node3PowerNeed, m_vars_list);
      else if (Ligacao_Gerador_No2.compareTo("2") == 0) total_2 += CheckVariableValue(Constants.Node3PowerNeed, m_vars_list);

      if (Ligacao_Gerador_No4.compareTo("3") == 0)   total_1 += CheckVariableValue(Constants.Node4PowerNeed, m_vars_list);
      else if (Ligacao_Gerador_No2.compareTo("2") == 0) total_2 += CheckVariableValue(Constants.Node4PowerNeed, m_vars_list);

      if (Ligacao_Gerador_No5.compareTo("3") == 0)   total_1 += CheckVariableValue(Constants.Node5PowerNeed, m_vars_list);
      else if (Ligacao_Gerador_No2.compareTo("2") == 0) total_2 += CheckVariableValue(Constants.Node5PowerNeed, m_vars_list);


      String Total_no1 = new String(String.valueOf(total_1));
      String Total_no2 = new String(String.valueOf(total_2));


      // Escreve tempo actual para reorganização
      WriteFile.Write ( "w" + CheckVariableValue(Constants.Time, m_vars_list)
                        + "\t" + CheckVariableValue(Constants.Node0PowerNeed, m_vars_list)
                        + "\t" + CheckVariableValue(Constants.Node1PowerNeed, m_vars_list)
                        + "\t" + CheckVariableValue(Constants.Node2PowerNeed, m_vars_list)
                        + "\t" + CheckVariableValue(Constants.Node3PowerNeed, m_vars_list)
                        + "\t" + CheckVariableValue(Constants.Node4PowerNeed, m_vars_list)
                        + "\t" + CheckVariableValue(Constants.Node5PowerNeed, m_vars_list)
                        + "\t" + Ligacao_Gerador_No1
                        + "\t" + Ligacao_Gerador_No2
                        + "\t" + Ligacao_Gerador_No3
                        + "\t" + Ligacao_Gerador_No4
                        + "\t" + Ligacao_Gerador_No5
                        + "\t" + Total_no1
                        + "\t" + Total_no2
                        , Constants.pathOutputGraphFile,Constants.OutputGraphFile);
////////////////////////////////////////////////////////////////////////////////////////


      ArrayList m_Risks = m_AcessoRsks.SelectAllData();
      ArrayList Violated_Risks = new ArrayList();

      for (int r=0 ; r < m_Risks.size(); r++)
      {
        m_exp = null;
        m_exp = new Expression();

        // limpa pilha
        pilha.clear();
        // Carrega pilha de prioridades a partir de uma String
        CheckRiskExpression(((RskData) m_Risks.get(r)).Get_TriggerRule() );


        // Mapea com as variaveis filtradas (m_vars_list) - Só se conseguir fazer o mapeamento
        if (ValuesVariablesUpdate(m_vars_list))
        {
          //  Mapea para árvore de expression
          m_exp =  GetExpression(pilha,0);

          // Limpa pilha de prioridades
          pilha.clear();

          // Calcula resultado final da árvore de expression
          m_exp.Calculate();

         System.out.println("\n"+m_exp + "\n Resultado =" + m_exp.Get_Result_Log());
         WriteFile.Writeln("\n"+m_exp + "\n Resultado =" + m_exp.Get_Result_Log(),Constants.pathOutputFile,Constants.OutputFile);

          if (m_exp.Get_Result_Log() == true) Violated_Risks.add(m_Risks.get(r));

        }

      }
    return (Violated_Risks);
   }


   ///////////////////////////////////////////////////////////
   //  Substitui expressoes pelo valores recebidos do processo
   ///////////////////////////////////////////////////////////
   private boolean ValuesVariablesUpdate(ArrayList m_vars_list)
   {
      String elemento_pilha=new String("");
      double novo_elemento;
      double teste_novo_elemento;

      for (int i=0;i<pilha.size();i++)
      {
        if (i % 3 != 0)  // Não olhar para as operações
        {
          elemento_pilha = (String) pilha.get(i);
          try
          {
            teste_novo_elemento = Double.parseDouble(elemento_pilha);
          }
          catch (NumberFormatException exc)
          {
              if (IsTerminal(elemento_pilha))
              {
                 novo_elemento = CheckVariableValue(elemento_pilha,m_vars_list);
                 if (Double.isNaN(novo_elemento) == false ) pilha.set(i,String.valueOf(novo_elemento));
                 else
                 {
                    System.out.println ("Elemento: <" +elemento_pilha+"> não é variável filtrada");
                    WriteFile.Writeln ("Elemento: <" +elemento_pilha+"> não é variável filtrada",Constants.pathOutputFile,Constants.OutputFile);
                    return (false);
                 }
              }
          }
        }
      }

      return (true);
   }



  ///////////////////////////////////////////////////////////
  //  Recebe pilha de termos e devolve Expressao
  ///////////////////////////////////////////////////////////
   public Expression GetExpression (ArrayList pilha, int indice)
   {
       Expression no = new Expression();

       String op_no = (String) pilha.get(indice);
       String termo1_no = (String) pilha.get(indice+1);
       String termo2_no = (String) pilha.get(indice+2);
       no.Set_Operation(op_no);

       if (IsTerminal(termo1_no))  no.Set_Termo1(Double.parseDouble(termo1_no));
        else  no.Set_Termo1(GetExpression(pilha,indice+3));
       if (IsTerminal(termo2_no))  no.Set_Termo2(Double.parseDouble(termo2_no));
        else
        {
          if (no.Get_Exp1() != null)
            no.Set_Termo2(GetExpression(pilha,indice + (3*no.Get_Exp1().NumOperacoes())));
          else
            no.Set_Termo2(GetExpression(pilha,indice + 3));
        }
       return (no);
   }


  ///////////////////////////////////////////////////////////
  // Decompoe uma expressao nos seus dois termos (2 Strings)
  ///////////////////////////////////////////////////////////
   public ArrayList decompoe(String expressao)
   {

      int begin = 0;
      int end = expressao.length();
      int begintermo1;
      String SubExpressao = expressao;
      String operacao;

        String Termo1=new String("");
        String Termo2=new String("");

        // detecta operação
        begin = SubExpressao.indexOf("(");
        end = SubExpressao.lastIndexOf(")");
        operacao =SubExpressao.substring(0,begin);

        // detecta termos
        SubExpressao = SubExpressao.substring(begin+1, end);

        int parm1=0;
        begintermo1= 0;


        for (int par = 0; par < SubExpressao.length() ; par ++)
        {
          if (SubExpressao.substring(par,par+1).compareTo("(") ==0 ) parm1++;
          else if (SubExpressao.substring(par,par+1).compareTo(")") ==0 ) parm1--;

          if ( (SubExpressao.substring(par,par+1).compareTo(",") == 0) &&
               (parm1==0)
             )        begintermo1=par;
         }
        Termo1 = SubExpressao.substring(0,begintermo1);
        Termo2 = SubExpressao.substring(begintermo1+1,SubExpressao.length());

        SubExpressao = Termo1;

        ArrayList m_return=new ArrayList();
        m_return.add(Termo1);
        m_return.add(Termo2);
        m_return.add(operacao);

        return (m_return);
   }



   ///////////////////////////////////////////////////////////
   //  Termo é Terminal?
   ///////////////////////////////////////////////////////////
    public boolean IsTerminal(String a)
    {
     if (a.indexOf("(") == -1) return (true);
     else return (false);
    }



   ///////////////////////////////////////////////////////////
   //  Carrega pilha de expressoes com a String recebida
   ///////////////////////////////////////////////////////////
   public void CheckRiskExpression(String expressao)
   {
        ArrayList tmp;

        if (IsTerminal(expressao) == false)
        {
          tmp = decompoe(expressao);
          pilha.add((String) tmp.get(2));
          pilha.add((String) tmp.get(0));
          pilha.add((String) tmp.get(1));
          CheckRiskExpression((String) tmp.get(0));
          CheckRiskExpression((String) tmp.get(1));
       }

   }



   ///////////////////////////////////////////////////////////
   //  Devolve o valor de uma variável que foi filtrada do processo
   ///////////////////////////////////////////////////////////
   private double CheckVariableValue(String valor , ArrayList tmp)
   {
      PPMData data;

      for (int h=0 ; h < tmp.size() ; h++)
      {
          data = (PPMData) tmp.get(h);
          if (data.Get_ProcessMeasureVariable().compareTo(valor) == 0)
            return (Double.parseDouble(data.Get_Value()));
      }
      return (Double.NaN);
   }


}
