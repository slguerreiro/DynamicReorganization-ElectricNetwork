//Source file: C:/Meic/Tese/VigilanciaRoboticoCaseStudy/Codigo/Simulator/DataAcessor.java
package Simulator;
import DataRepository.*;
import java.lang.*;
import java.io.*;
import java.util.*;
import SimulatorPlatform.*;


/**
 * @author
 * @version
 */

 ////////////////////////////////////////////////////
 //  Acessor generico para aceder aos diversos repositórios de dados
 ////////////////////////////////////////////////////
public class DataAcessor
{
   private Repository Data;

   public DataAcessor(Repository Rep)
   {
      Data = Rep;

   }


  ////////////////////////////////////////////////////
  //  Finaliza o acesso ao repositorio
  ////////////////////////////////////////////////////
   public void finalize()
   {
     Data.close();
     System.out.println("finalize invocado: " + Data.getClass());
     WriteFile.Writeln("finalize invocado: " + Data.getClass().toString(),Constants.pathOutputFile,Constants.OutputFile);
   }


  ////////////////////////////////////////////////////
  //  Insere dados de uma lista num repositorio
  ////////////////////////////////////////////////////
   public boolean InsertData(ArrayList Datalist)
   {
    for (int i=0;i<Datalist.size();i++)
    {
      DataType abc = (DataType) Datalist.get(i);
      System.out.println(abc.getClass());
      WriteFile.Writeln(abc.getClass().toString(),Constants.pathOutputFile,Constants.OutputFile);
      Data.Write(abc);
    }
     return(true);
   }


  ////////////////////////////////////////////////////
  //  Lê toda a informação contida no repositório sob a forma de uma lista
  ////////////////////////////////////////////////////
   public ArrayList SelectAllData()
   {
      Data.startAgain();

      ArrayList lista=new ArrayList();

      DataType dt = Data.Read();

      while (dt != null)
      {
        lista.add((DataType)dt);
        dt = Data.Read();
      }

      Data.startAgain();
    return(lista);
   }


   ////////////////////////////////////////////////////
   //  Limpa todo o repositório de dados
   ////////////////////////////////////////////////////
    public void ClearData()
   {

   }


}
