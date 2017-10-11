//Source file: C:/Meic/Tese/VigilanciaRoboticoCaseStudy/Codigo/Simulator/ReorganizationModule.java

package Simulator;
import SimulatorPlatform.*;
import java.lang.*;
import java.io.*;
import java.util.*;


/**
 * @author
 * @version
 */
public class ReorganizationModule
{
   Reorganization m_Reorganization;
   RiskAnalysis m_RiskAnalysis;
   ProcessPerformanceMeasureMediation m_ProcessPerformanceMeasureMediation;
   CorrectiveAction m_CorrectiveAction=null;


  ////////////////////////////////////////////////////
  //  Cria o Reorganization Module
  ////////////////////////////////////////////////////
   public ReorganizationModule()
   {
      System.out.println("1: Reorganization Module created...");
      WriteFile.Writeln("1: Reorganization Module created...",Constants.pathOutputFile,Constants.OutputFile);
      m_Reorganization=new Reorganization();
      m_RiskAnalysis=new RiskAnalysis();
      m_ProcessPerformanceMeasureMediation=new ProcessPerformanceMeasureMediation();
   }


  ////////////////////////////////////////////////////
  //  Implementa o sequenciamento do Reorganization Module
  ////////////////////////////////////////////////////
   public CorrectiveAction execute(ActualEnvironment m_ActualEnvironment)
   {

      System.out.println("\tR: Reorganization Module invoked...");
      WriteFile.Writeln("\tR: Reorganization Module invoked...",Constants.pathOutputFile,Constants.OutputFile);

      try{

        ArrayList m_VariableList = m_ProcessPerformanceMeasureMediation.CheckPPMV(m_ActualEnvironment);


        ArrayList Triggers = m_RiskAnalysis.execute(m_VariableList);
        if (Triggers != null)
        {
         // Trigger
         System.out.println("\t\t\tReorganization triggered....");
         WriteFile.Writeln("\t\t\tReorganization triggered....",Constants.pathOutputFile,Constants.OutputFile);
         m_CorrectiveAction = m_Reorganization.execute(Triggers);
        }
        else
        {
         // No trigger
         m_CorrectiveAction= new CorrectiveAction();
        }
       // WriteFile.Writeln( "-------------------------------------------------------------------",
         //                Constants.pathOutputGraphFile,Constants.OutputGraphFile);
         WriteFile.Writeln( "",
                           Constants.pathOutputGraphFile,Constants.OutputGraphFile);
      }
      catch (Exception exc)
      {
        System.out.println(exc);
        WriteFile.Writeln(exc.toString(),Constants.pathOutputFile,Constants.OutputFile);

      }

      return (m_CorrectiveAction);
   }





}
