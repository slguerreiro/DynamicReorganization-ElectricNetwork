//Source file: C:/Meic/Tese/VigilanciaRoboticoCaseStudy/Codigo/Simulator/PluginProcess.java

package Simulator;
import java.lang.*;
import java.io.*;
import java.util.*;
import RENContext.*;
import DataRepository.*;
import SimulatorPlatform.*;
import Interface.*;

/**
 * @author
 * @version
 */
public class PluginProcess
{
EnvironmentDefinition m_ambienteREN;
private GraphicalViewer m_graphical_animation;


   public PluginProcess()
   {
    System.out.println("Plugin Process created...");
    WriteFile.Writeln("Plugin Process created...",Constants.pathOutputFile,Constants.OutputFile);
    m_ambienteREN = new EnvironmentDefinition();
    m_graphical_animation = new GraphicalViewer (m_ambienteREN);
   }

//////////////////////////////////////////////////////////////////////////////
// Testa se est� em estado final
//////////////////////////////////////////////////////////////////////////////
    public boolean IsFinalState()
    {
      if ((Constants.NumMaxDays-1) > m_ambienteREN.Get_Time())
        return (false);
      else
        return (true);
    }


//////////////////////////////////////////////////////////////////////////////
// Executa o plugin process
//     (Vai implementar o funcionamento espec�fico de um processo rob�tico)
//////////////////////////////////////////////////////////////////////////////
   public ActualEnvironment execute(RENGoal m_goal)
   {
      OrderCircuitBreaker REN_tmp;
      m_ambienteREN.Inc_Time();

      if (m_goal!= null)
      {
          for (int h=0; h < m_goal.GetSize() ; h++)
          {
            REN_tmp = m_goal.GetGoal(h);
            System.out.println(REN_tmp.toString());
            WriteFile.Writeln(REN_tmp.toString(),Constants.pathOutputFile,Constants.OutputFile);
            m_ambienteREN.Set_CircuitBreaker(REN_tmp.GetName(), REN_tmp.GetIndex(), REN_tmp.GetStateREL(), REN_tmp.GetStateABS() , REN_tmp.GetRelacaoLink());
          }
      }

      ActualEnvironment devolver = m_ambienteREN.CreateActualEnvironment();

      m_graphical_animation.SetTime(m_ambienteREN.Get_Time());
      m_graphical_animation.Draw(m_ambienteREN);

     // cria��o do environment para devolver
      return (devolver);
   }



//////////////////////////////////////////////////////////////////////////////
// Invoca a disponibiliza��o do ambiente para o formato da reorganiza��o
//////////////////////////////////////////////////////////////////////////////
   public ActualEnvironment Actual_Environment()
   {
     // cria��o do environment para devolver
      return (m_ambienteREN.CreateActualEnvironment());
   }

}
