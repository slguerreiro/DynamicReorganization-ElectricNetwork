//Source file: C:/Meic/Tese/VigilanciaRoboticoCaseStudy/Codigo/Simulator/Reorganization.java

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
public class Reorganization
{
   DataAcessor m_AcessoRls;
   ArrayList m_Rules;


   public Reorganization()
   {
     System.out.println("\t1.1: Reorganization created...");
     WriteFile.Writeln("\t1.1: Reorganization created...",Constants.pathOutputFile,Constants.OutputFile);
     m_AcessoRls=new DataAcessor(new RulesMappings());

     // Le todos os riscos em repositorio
     m_Rules = m_AcessoRls.SelectAllData();
   }



////////////////////////////////////////////////////////////
// Verifica comando de reorganizacao com prioridade + alta
////////////////////////////////////////////////////////////
  public String CheckPossibleReorganization(ArrayList m_rsks_list)
  {
    RskData risco;
    RlsData regra;
    String devolve = null;
    int prioridade = -1;
    String Cause = null;
    String Description = null;

    // filtra riscos sem accao correctiva mapeada
    for (int i = 0 ; i < m_rsks_list.size() ; i++)
    {
      risco = (RskData) m_rsks_list.get(i);
      for (int j = 0 ; j < m_Rules.size(); j++)
      {
          regra = (RlsData) m_Rules.get(j);
          if (risco.Get_RiskID_I() == regra.Get_RiskID_I())
          {
            if (risco.Get_Priority_I() > prioridade)
            {
              prioridade = risco.Get_Priority_I();
              devolve = regra.Get_CorrectiveAction();
              Cause = regra.Get_Cause();
              Description = regra.Get_Description();
            }
          }
      }
    }

    if (devolve != null)
    {
       System.out.println("Causa :" + Cause);
       System.out.println("Corrective Action :" + devolve);
       System.out.println("Prioridade :" + prioridade);
       System.out.println("Descrição :" + Description);
       WriteFile.Writeln("Causa :" + Cause,Constants.pathOutputFile,Constants.OutputFile);
       WriteFile.Writeln("Corrective Action :" + devolve,Constants.pathOutputFile,Constants.OutputFile);
       WriteFile.Writeln("Prioridade :" + prioridade,Constants.pathOutputFile,Constants.OutputFile);
       WriteFile.Writeln("Descrição :" + Description,Constants.pathOutputFile,Constants.OutputFile);
/*       WriteFile.Write( "Causa:" + Cause +
                        "  Corrective Action: " + devolve +
                        "  Prioridade: " + prioridade +
                        "  Descrição: " + Description,
                        Constants.pathOutputGraphFile,Constants.OutputGraphFile);*/
        WriteFile.Write("\t"+devolve, Constants.pathOutputGraphFile,Constants.OutputGraphFile);

    }

    return (devolve);
  }




  public CorrectiveAction execute(ArrayList m_rsks_list)
  {
    System.out.println ("Recebi para reorganização: " + m_rsks_list);
    WriteFile.Writeln ("Recebi para reorganização: " + m_rsks_list,Constants.pathOutputFile,Constants.OutputFile);

     // Verifica comando de reorganizacao
     String AccaoCorrectiva = CheckPossibleReorganization(m_rsks_list);
     if (AccaoCorrectiva != null)
     {
        return  (new CorrectiveAction(AccaoCorrectiva));
     }
     return (null);
  }


}
