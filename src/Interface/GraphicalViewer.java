
//Title:        Plataforma Simulacao
//Version:
//Copyright:    Copyright (c) 1999
//Author:       Sergio Guerreiro
//Company:      IST, MEIC 2002
//Description:  Your description
package Interface;
import Simulator.*;
import SimulatorPlatform.*;
import DataRepository.*;
import RENContext.*;
import java.util.*;

public class GraphicalViewer {

WindowUtilities tmp;
SimulationAnimation tmp2;


  public GraphicalViewer(EnvironmentDefinition ambiente)
  {
      System.out.println ("Graphical Simulation Created..........");
      WriteFile.Writeln ("Graphical Simulation Created..........",Constants.pathOutputFile,Constants.OutputFile);

     tmp = new WindowUtilities();

     // Cria animacao
     tmp2 = new SimulationAnimation();


       tmp.openInJFrame(tmp2, (int) Constants.LimitXEcra,
                              (int) Constants.LimitYEcra);

   }



   public void Draw(EnvironmentDefinition ambiente)
   {
      tmp2.SetEnvironment (ambiente);
      tmp2.updateUI();
   }

   public void SetTime(int time)
   {
    tmp2.setTime(time);
   }                  

}