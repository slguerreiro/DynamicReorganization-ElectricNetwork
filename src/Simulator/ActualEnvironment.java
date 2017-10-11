

package Simulator;
import DataRepository.*;
import java.lang.*;
import java.io.*;
import java.util.*;


/**
 * Title:        Plataforma de simulaçao genérica
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      MEIC, 2002
 * @author Sérgio Guerreiro
 * @version 1.0
 */

public class ActualEnvironment {
ArrayList m_state;   // array de PPMData ( o que vai ser lido pelo process performancemeasure)

  public ActualEnvironment() {
    m_state =new ArrayList();

  }


  ////////////////////////////////////////////////////
  //  Verifica se uma variável está contida no ambiente total e devolve
  ////////////////////////////////////////////////////
  public PPMData CheckVariable(PPMData m_PPMV)
  {
    PPMData m_PPMV_tmp;

   for (int j=0;j<m_state.size();j++)
     {
       m_PPMV_tmp=(PPMData) m_state.get(j);
       if (m_PPMV_tmp.Get_ProcessMeasureVariable().compareTo(m_PPMV.Get_ProcessMeasureVariable()) == 0) return (m_PPMV_tmp);
      }
      return(null);
  }




  public int Size()
  {
    return (m_state.size());
  }

  public PPMData Get_Element(int n)
  {
   return ((PPMData) m_state.get(n));
  }



  ////////////////////////////////////////////////////
  //  Adiciona uma variável ao ambiente total
  ////////////////////////////////////////////////////
  public boolean AddVariable(PPMData m_PPMV)
  {
    if (m_state.add(m_PPMV) != true)
    {
     return (false);
    }
    else return (true);
  }


  ////////////////////////////////////////////////////
  //  Devolve todas as variáveis do ambiente sobre a forma de uma String
  ////////////////////////////////////////////////////
  public String toString()
  {
      PPMData m_PPMV_tmp;
      String m_return=new String("");

      for (int j=0;j<m_state.size();j++)
      {
        m_PPMV_tmp=(PPMData) m_state.get(j);
        m_return += m_PPMV_tmp.Get_RoboticModule() + "-" + m_PPMV_tmp.Get_ProcessMeasureVariable() + "-" + m_PPMV_tmp.Get_Value() + "-" +m_PPMV_tmp.Get_Description() + "\n";
      }

      return (m_return);
  }




}