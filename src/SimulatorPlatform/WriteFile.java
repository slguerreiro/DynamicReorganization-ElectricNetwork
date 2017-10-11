
//Title:        Plataforma Simulacao
//Version:      
//Copyright:    Copyright (c) 1999
//Author:       Sergio Guerreiro
//Company:      IST, MEIC 2002
//Description:  Your description
package SimulatorPlatform;
import java.io.*;
import java.net.*;
import java.util.*;
import java.lang.*;



public class WriteFile {

  private static PrintWriter out;


  public WriteFile()
  {
  }


  public static void Writeln(String output_to_file, String PathOutputFileID, String OutputFileID)
  {
     try
     {
      if (Constants.WriteToFile == 1)
      {
        Calendar calendar = new GregorianCalendar();
        Date trialTime = new Date();
        calendar.setTime(trialTime);

        String ficheiro = PathOutputFileID +
                          OutputFileID +
                          calendar.get(Calendar.YEAR) + "_" +
                          (calendar.get(Calendar.MONTH)+1) + "_" +
                          calendar.get(Calendar.DATE) + ".txt";

         out  = new PrintWriter(new FileOutputStream (ficheiro,true));
         out.println(output_to_file);
         out.close();
      }
     }
     catch (Exception exc)
     {
        System.out.println(exc);
     }
  }

  public static void Write(String output_to_file, String PathOutputFileID, String OutputFileID)
  {
     try
     {
      if (Constants.WriteToFile == 1)
      {
        Calendar calendar = new GregorianCalendar();
        Date trialTime = new Date();
        calendar.setTime(trialTime);

        String ficheiro = PathOutputFileID +
                          OutputFileID +
                          calendar.get(Calendar.YEAR) + "_" +
                          (calendar.get(Calendar.MONTH)+1) + "_" +
                          calendar.get(Calendar.DATE) + ".txt";

         out  = new PrintWriter(new FileOutputStream (ficheiro,true));
         out.print(output_to_file);
         out.close();
      }
     }
     catch (Exception exc)
     {
        System.out.println(exc);
     }
  }

}