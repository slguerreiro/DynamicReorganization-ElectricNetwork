//Source file: C:/Meic/Tese/VigilanciaRoboticoCaseStudy/Codigo/Simulator/ProcessModule.java

package Simulator;
import java.lang.*;
import java.io.*;
import java.util.*;
import RENContext.*;
import SimulatorPlatform.*;


/**
 * @author
 * @version
 */
public class ProcessModule
{
  ActualEnvironment m_actualEnvironment;
  Methodology m_Methodology;
  PluginProcess m_PluginProcess;


  ////////////////////////////////////////////////////
  //  Cria o Process Module
  ////////////////////////////////////////////////////
   public ProcessModule()
   {
      m_actualEnvironment=new ActualEnvironment();
      m_Methodology = new Methodology();
      m_PluginProcess = new  PluginProcess();
      System.out.println("2:Process Module created...");
      WriteFile.Writeln("2:Process Module created...",Constants.pathOutputFile,Constants.OutputFile);
   }


   public boolean  TerminalTest()
   {
      if (m_PluginProcess.IsFinalState())  return (true);
      else return (false);

   }

  ////////////////////////////////////////////////////
  //  Executa o Process Module
  ////////////////////////////////////////////////////
   public ActualEnvironment execute(CorrectiveAction m_action)
   {
      RENGoal tmpGoal;

      System.out.println("\tP: Process Module invoked...");
      WriteFile.Writeln("\tP: Process Module invoked...",Constants.pathOutputFile,Constants.OutputFile);

      tmpGoal = m_Methodology.execute(m_action);
      m_actualEnvironment = m_PluginProcess.execute(tmpGoal);

      return (m_actualEnvironment);
   }

}
