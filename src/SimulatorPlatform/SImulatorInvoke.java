
package SimulatorPlatform;

/**
 * Title:        Plataforma de simulaçao genérica
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      MEIC, 2002
 * @author Sérgio Guerreiro
 * @version 1.0
 */

import Simulator.*;
import java.util.*;

public class SImulatorInvoke {

  public SImulatorInvoke() {
  }

  public static void main(String[] args) {
    SImulatorInvoke SImulatorInvoke1 = new SImulatorInvoke();

    Engine motor=new Engine(20);

 //   try{ int teste = System.in.read();}
 //   catch (Exception exc) {}

    try
    {
       int yryr = System.in.read();

      WriteFile.Write("--------------------------------SIMULATION START--------------------------------",Constants.pathOutputFile,Constants.OutputFile);
      WriteFile.Write("--------------------------------SIMULATION START--------------------------------",Constants.pathOutputGraphFile,Constants.OutputGraphFile);
      Calendar calendar = new GregorianCalendar();
      Date trialTime = new Date();
      calendar.setTime(trialTime);
      WriteFile.Write(    calendar.get(Calendar.YEAR) + "/"
                          + (calendar.get(Calendar.MONTH)+1) + "/"
                          + calendar.get(Calendar.DATE) + " "
                          +  calendar.get(Calendar.HOUR_OF_DAY) + ":"
                          + calendar.get(Calendar.MINUTE) + ":"
                          + calendar.get(Calendar.SECOND) + ":"
                          + calendar.get(Calendar.MILLISECOND),Constants.pathOutputFile,Constants.OutputFile);
     WriteFile.Write(    calendar.get(Calendar.YEAR) + "/"
                          + (calendar.get(Calendar.MONTH)+1) + "/"
                          + calendar.get(Calendar.DATE) + " "
                          +  calendar.get(Calendar.HOUR_OF_DAY) + ":"
                          + calendar.get(Calendar.MINUTE) + ":"
                          + calendar.get(Calendar.SECOND) + ":"
                          + calendar.get(Calendar.MILLISECOND),Constants.pathOutputGraphFile,Constants.OutputGraphFile);
      motor.Start();
      WriteFile.Write("--------------------------------SIMULATION STOP--------------------------------",Constants.pathOutputFile,Constants.OutputFile);
      WriteFile.Write("--------------------------------SIMULATION STOP--------------------------------",Constants.pathOutputGraphFile,Constants.OutputGraphFile);
    }
    catch (Exception exc)
    {
      System.out.println(exc);
      WriteFile.Writeln(exc.toString(),Constants.pathOutputFile,Constants.OutputFile);
    }




  }
}

