//Source file: C:/Meic/Tese/VigilanciaRoboticoCaseStudy/Codigo/Simulator/Engine.java

package Simulator;

import java.sql.Time;
import java.lang.*;
import java.io.*;
import java.util.*;
// Código dummy
import SimulatorPlatform.*;


/**
 * @author
 * @version
 */
public class Engine
{
   private Time Time;
   public ReorganizationModule m_ReorganizationModule;
   public ProcessModule m_ProcessModule;
   public ActualEnvironment ambiente;
   public CorrectiveAction correccao;
   int n_interpolacoes = -1;
   Time n_time=null;
   int n_precision = -1;



  ////////////////////////////////////////////////////
  //  Cria o Engine no modo interpolacao
  ////////////////////////////////////////////////////
   public Engine(int n_newinterpolacoes)
   {
       System.out.println("Simulation engine created ... (interpolation mode)...");
       WriteFile.Writeln("Simulation engine created ... (interpolation mode)...",Constants.pathOutputFile,Constants.OutputFile);
       n_interpolacoes = n_newinterpolacoes;
   }


  ////////////////////////////////////////////////////
  //  Cria o Engine no modo tempo
  ////////////////////////////////////////////////////
    public Engine(Time n_newtime, int n_new_precision)
   {
       System.out.println("Simulation engine created ... (Time mode)...");
       WriteFile.Writeln("Simulation engine created ... (Time mode)...",Constants.pathOutputFile,Constants.OutputFile);
       n_time = n_newtime;
       n_new_precision  = n_precision;
   }


  ////////////////////////////////////////////////////
  //  Inicia a simulação com o parâmetros definidos
  ////////////////////////////////////////////////////
   public boolean Start() throws Exception
   {
     try
     {
        m_ReorganizationModule = new ReorganizationModule();
        m_ProcessModule = new ProcessModule();
        ambiente = m_ProcessModule.m_PluginProcess.Actual_Environment();
        correccao=new CorrectiveAction();

        correccao = null;
        ///////////////////////////////////////////////

        // Pelo numero de interpolacoes pretendido - sem utilidade senão teste.......
        if (n_interpolacoes != -1)
        {
          System.out.println("Initial Environment do Process Module:\n" + ambiente.toString());
          WriteFile.Writeln("Initial Environment do Process Module:\n" + ambiente.toString(),Constants.pathOutputFile,Constants.OutputFile);

          while (m_ProcessModule.TerminalTest() != true)
          {
             ambiente = m_ProcessModule.execute(correccao);
             System.out.println("Actual Environment do Process Module:\n" + ambiente.toString());
             WriteFile.Writeln("Actual Environment do Process Module:\n" + ambiente.toString(),Constants.pathOutputFile,Constants.OutputFile);

          // PARTE QUE INVOCA O REORGANIZATION MODULE EM COMENTARIO PARA CODIGO DUMMY
              if (ambiente != null) correccao = m_ReorganizationModule.execute(ambiente);
              else
              {
                 System.out.println("\tR: No environment to feed Reorganization module...");
                 WriteFile.Writeln("\tR: No environment to feed Reorganization module...",Constants.pathOutputFile,Constants.OutputFile);
              }

          //  CODIGO DUMMY
          //   correccao = new CorrectiveAction(Constants.Order_GO_REVERSE);

   //              int a=System.in.read();
          }
        }
        // .........por tempo de simulacao.......
        else if (n_time != null)
        {
           System.out.println("Tempo" + n_time);
           WriteFile.Writeln("Tempo" + n_time,Constants.pathOutputFile,Constants.OutputFile);
        }
        // por eventos despoletados pelo processo (a implementar o + importante!!!)
        else return (false);



        // Garante o fecho dos ficheiros antes do garbage collector
        m_ReorganizationModule.m_ProcessPerformanceMeasureMediation.m_AcessoPPMMs.finalize();
        m_ReorganizationModule.m_RiskAnalysis.m_AcessoRsks.finalize();
        m_ReorganizationModule.m_Reorganization.m_AcessoRls.finalize();


     }
     catch (Exception exc)
     {
        System.out.println(exc);
        WriteFile.Writeln("Exception no engine:" + exc,Constants.pathOutputFile,Constants.OutputFile);
        throw exc;
     }
    return(true);
   }


  ////////////////////////////////////////////////////
  //  Finaliza o Engine
  ////////////////////////////////////////////////////
   public boolean Stop()
   {
    return(true);
   }
}
