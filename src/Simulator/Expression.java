
//Title:        Plataforma Simulacao
//Version:
//Copyright:    Copyright (c) 1999
//Author:       Sergio Guerreiro
//Company:      IST, MEIC 2002
//Description:  Your description
package Simulator;
import SimulatorPlatform.*;


public class Expression {

// TERMOS TERMINAIS
private double m_Termo1;
private double m_Termo2;
private boolean m_Termo1_log;
private boolean m_Termo2_log;

// TERMOS NÃO TERMINAIS
private Expression m_Termo1_Exp;
private Expression m_Termo2_Exp;

// Classe

private String m_Classe;
// Tipo de operação
private Operation m_Op;

// Resultado Boleano
private boolean m_result_boolean;
// Resultado double
private double m_result_double;


  public Expression()
  {

  }

  public Expression(double x, double y, String OP) {
    m_Termo1 = x;
    m_Termo2 = y;
    m_Op = new Operation(OP);
    m_Classe = m_Op.GetClasse();
    m_Termo1_Exp = null;
    m_Termo2_Exp = null;
  }


  public Expression(boolean x, boolean y, String OP) {
    m_Termo1_log = x;
    m_Termo2_log = y;
    m_Op = new Operation(OP);
    m_Classe = m_Op.GetClasse();
    m_Termo1_Exp = null;
    m_Termo2_Exp = null;
  }

  public Expression(Expression x, Expression y, String OP) {
    m_Termo1_Exp = x;
    m_Termo2_Exp = y;
    m_Op = new Operation(OP);
    m_Classe = m_Op.GetClasse();
  }


  public Expression(String OP) {
     m_Op = new Operation(OP);
     m_Classe = m_Op.GetClasse();
     m_Termo1_Exp = null;
     m_Termo2_Exp = null;
  }

// Sets e Gets à classe
  public void Set_Termo1(Expression Termo)  { m_Termo1_Exp = Termo; }
  public void Set_Termo2(Expression Termo)  { m_Termo2_Exp = Termo; }
  public void Set_Termo1(double Termo)  { m_Termo1 = Termo; }
  public void Set_Termo2(double Termo)  { m_Termo2 = Termo; }
  public void Set_Operation(String Cl)
  {
    m_Op = new Operation(Cl);
    m_Classe = m_Op.GetClasse();
  }



  public double Get_Termo1() {return (m_Termo1);};
  public double Get_Termo2() {return (m_Termo2);};
  public boolean Get_Termo_Log1() {return (m_Termo1_log);};
  public boolean Get_Termo_Log2() {return (m_Termo2_log);};
  public Expression Get_Exp1() {return (m_Termo1_Exp);};
  public Expression Get_Exp2() {return (m_Termo2_Exp);};
  public double Get_Result() { return (m_result_double);};
  public boolean Get_Result_Log() { return (m_result_boolean);};
  public String Get_Classe() {return (m_Classe);};
  public String Get_Op() {return (m_Op.GetOperation());};





  public int NumOperacoes()
  {
    int con=0;

    if (m_Termo1_Exp == null ) con++;
    if (m_Termo2_Exp == null ) con++;
    if (m_Termo1_Exp != null ) con += m_Termo1_Exp.NumOperacoes();
    if (m_Termo2_Exp != null ) con += m_Termo2_Exp.NumOperacoes();



    return (con);
  }




  private String N_TABS(Expression tmp_tab)
  {
    String tabs=new String("");
    for (int g=0;g<tmp_tab.NumOperacoes();g++) tabs+="\t";

    return (tabs);
  }




  public String toString()
  {
   String devolve = "\n" + N_TABS(this) + Get_Op() +" " + Get_Classe();

   if (m_Termo1_Exp == null) devolve+=" " + String.valueOf(m_Termo1);
   else devolve += m_Termo1_Exp.toString();

   if (m_Termo2_Exp == null) devolve+=" " + String.valueOf(m_Termo2);
   else devolve += m_Termo2_Exp.toString();

   return (devolve);
  }





  public void Calculate()
  {

  // Calcula termo não terminal
    if (m_Termo1_Exp != null)
    {
      if ( m_Termo1_Exp.Get_Classe().compareTo(Constants.ClasseC) == 0)
      {
        m_Termo1_Exp.Calculate();
        m_Termo1 = m_Termo1_Exp.Get_Result();
      }
      else
      {
        m_Termo1_Exp.Calculate();
        m_Termo1_log = m_Termo1_Exp.Get_Result_Log();
      }
    };

    if (m_Termo2_Exp != null)
    {
      if ( m_Termo2_Exp.Get_Classe().compareTo(Constants.ClasseC) == 0)
      {
        m_Termo2_Exp.Calculate();
        m_Termo2 = m_Termo2_Exp.Get_Result();
      }
      else
      {
        m_Termo2_Exp.Calculate();
        m_Termo2_log = m_Termo2_Exp.Get_Result_Log();
      }
    };



  // Calcula termo terminal
    if (m_Classe.compareTo(Constants.ClasseC) == 0)
    {
       m_result_double = Calculate_C();
    }
    else if (m_Classe.compareTo(Constants.ClasseB) == 0)
    {
       m_result_boolean = Calculate_B();
    }
    else
    {
       m_result_boolean = Calculate_A();
    }


  }




  // Recebe 2 doubles e devolve um double - Classe C
  private double Calculate_C()
  {
   return (m_Op.calculate_C(m_Termo1 , m_Termo2));
  }


  // Recebe 2 doubles e devolve um boolean - Classe B
  private boolean Calculate_B()
  {
   return (m_Op.calculate_B(m_Termo1 , m_Termo2));

  }


 // Recebe 2 boolean e devolve um boolean - Classe A
  private boolean Calculate_A()
  {
   return (m_Op.calculate_A(m_Termo1_log , m_Termo2_log));
  }



}