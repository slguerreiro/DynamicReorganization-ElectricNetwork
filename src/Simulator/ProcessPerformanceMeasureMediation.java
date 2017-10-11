//Source file: C:/Meic/Tese/VigilanciaRoboticoCaseStudy/Codigo/Simulator/ProcessPerformanceMeasureMediation.java

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
public class ProcessPerformanceMeasureMediation
{
   DataAcessor m_AcessoPPMMs;


  ////////////////////////////////////////////////////
  //  Cria o Process Performance Mediation
  ////////////////////////////////////////////////////
   public ProcessPerformanceMeasureMediation()
   {
     System.out.println("\t1.3: Process Performance Mediation device created...");
     WriteFile.Writeln("\t1.3: Process Performance Mediation device created...",Constants.pathOutputFile,Constants.OutputFile);
     m_AcessoPPMMs=new DataAcessor(new ProcessPerformanceMeasureMappings());
   }



   ////////////////////////////////////////////////////////////
   /*
    Faz a mediação entre as variaveis recebidas e as que se pretende estudar
   */
   ////////////////////////////////////////////////////////////
   public ArrayList CheckPPMV(ActualEnvironment m_ambiente)
   {

      ArrayList m_variablelist=new ArrayList();
      ArrayList PPMV=m_AcessoPPMMs.SelectAllData();
      PPMData PPMVtmp;
      PPMData PPMVtmp_final;

     for (int j=0;j<PPMV.size();j++)
     {
        PPMVtmp =(PPMData) PPMV.get(j);
        PPMVtmp_final = m_ambiente.CheckVariable(PPMVtmp);

        if (PPMVtmp_final != null)
        {
          m_variablelist.add(PPMVtmp_final);
        }

     }
      return (m_variablelist);
   }
}
