//Source file: C:/Meic/Tese/VigilanciaRoboticoCaseStudy/Codigo/Simulator/ProcessPerformanceMeasureMappings.java

package DataRepository;
import java.net.*;
import java.util.*;
import java.lang.*;
import SimulatorPlatform.*;
import java.io.*;



public class ProcessPerformanceMeasureMappings extends Repository
{

   ////////////////////////////////////////////////////
   /*
    abre canal de entrada e saída para ficheiro, caso contrário abre um novo ficheiro no caminho definido
   */
   ////////////////////////////////////////////////////
   public ProcessPerformanceMeasureMappings()
   {
         // A definir para cada subclasse
      Ficheiro = new String(Constants.pathInputFile + Constants.PPerfMMs);

      System.out.println("\t\tProcessPerformanceMappings created...(DATA)");
      WriteFile.Writeln("\t\tProcessPerformanceMappings created...(DATA)",Constants.pathOutputFile,Constants.OutputFile);

      try
      {
        in   = new BufferedReader (new FileReader(Ficheiro));
        out  = new PrintWriter(new FileOutputStream (Ficheiro,true));
        System.out.println("File Mapped: "+Ficheiro);
        WriteFile.Writeln("File Mapped: "+Ficheiro,Constants.pathOutputFile,Constants.OutputFile);
      }
      catch (FileNotFoundException exc)
      {
        // create ficheiro
        try
        {
            PrintWriter tmp = new PrintWriter(new FileWriter (Ficheiro));
            tmp.close();
            System.out.println("File Not found - Created new File: "+Ficheiro);
            WriteFile.Writeln("File Not found - Created new File: "+Ficheiro,Constants.pathOutputFile,Constants.OutputFile);
        }
        catch (IOException exc2)
        {
         // não consegue criar o ficheiro
         System.out.println ("Cannot create mapping file: " + exc2);
         WriteFile.Writeln("Cannot create mapping file: " + exc2,Constants.pathOutputFile,Constants.OutputFile);
        }
      }
      catch(IOException exc3)
      {
         System.out.println ("Problem with writer pointer: " + exc3);
         WriteFile.Writeln ("Problem with writer pointer: " + exc3,Constants.pathOutputFile,Constants.OutputFile);
      }
   }


   ////////////////////////////////////////////////////
   /*
    Escreve uma entidade de dados para o ficheiro
   */
   ////////////////////////////////////////////////////
   public synchronized boolean Write(DataType info)
   {
        PPMData abc=(PPMData) info;
        System.out.println(abc.getClass());
        WriteFile.Writeln(abc.getClass().toString(),Constants.pathOutputFile,Constants.OutputFile);

        out.println(  abc.Get_RoboticModule() +
                      Constants.SeparatorFile +
                      abc.Get_ProcessMeasureVariable() +
                      Constants.SeparatorFile +
                      abc.Get_Description()
                   );

        out.flush();
        return (true);
   }


   ////////////////////////////////////////////////////
   /*
    Inicializa ponteiro de leitura
   */
   ////////////////////////////////////////////////////
   public void startAgain()
   {
      try
      {
        in.close();
        in   = new BufferedReader (new FileReader(Ficheiro));
      }
      catch (IOException exc)
      {
        System.out.println (exc);
        WriteFile.Writeln (exc.toString(),Constants.pathOutputFile,Constants.OutputFile);
      }
   }

   ////////////////////////////////////////////////////
   /*
    Lê uma entidade de dados do ficheiro
   */
   ////////////////////////////////////////////////////
   public DataType Read()
   {
    try
    {
      line = in.readLine();
      if (line==null) return(null);
      else
      {
        int a=line.indexOf(Constants.SeparatorFile);
        int b=line.indexOf(Constants.SeparatorFile,a+1);
        int c=line.indexOf(Constants.SeparatorFile,b+1);

        return  ( new PPMData( line.substring(0,a) ,
                               line.substring(a+1,b),
                               line.substring(b+1,c),
                               line.substring(c+1,line.length())
                            )
                );
      }
    }
    catch (Exception exc)
    {
     System.out.println("File: " + Ficheiro + " invalid.\n" + exc);
     WriteFile.Writeln("File: " + Ficheiro + " invalid.\n" + exc,Constants.pathOutputFile,Constants.OutputFile);
    }
      return(null);
   }


   ////////////////////////////////////////////////////
   /*
    Fecha canais de entrada e saída
   */
   ////////////////////////////////////////////////////
     public void close()
     {
        try
        {
          in.close();
          out.close();
        }
        catch (IOException exc)
        {
         System.out.println("Error closing pointers to files: "+exc);
         WriteFile.Writeln("Error closing pointers to files: "+exc,Constants.pathOutputFile,Constants.OutputFile);
        }
     }

}
