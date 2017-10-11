
//Title:        Plataforma Simulacao REN
//Version:
//Copyright:    Copyright (c) 1999
//Author:       Sergio Guerreiro
//Company:      IST, MEIC 2002
//Description:  Your description
package RENContext;
import java.lang.*;
import java.io.*;
import java.util.*;

import SimulatorPlatform.*;


public class Node {

  private String m_Name;
  private String m_Name_ID;
  private int m_Priority;
  private boolean m_ConsumptionNode;
  private boolean m_GeneratorNode;
  private ArrayList m_ConsumptionList;
  private double m_GeneratorValue;

  public Node()
  {
    m_ConsumptionList = new ArrayList();
  }

  public Node(String Name, String Name_ID, int Priority, boolean ConsumptionNode, boolean GeneratorNode, double GeneratorValue)
  {
    m_ConsumptionList = new ArrayList();
    SetName           (Name);
    SetNameID           (Name_ID);
    SetPriority       (Priority);
    SetConsumptionNode    (ConsumptionNode);
    SetGeneratorNode  (GeneratorNode);
    SetGeneratorValue (GeneratorValue);
  }

  public void SetName(String tmp)           { m_Name = tmp; }
  public String GetName()                   { return (m_Name); }
  public void SetNameID(String tmp)           { m_Name_ID = tmp; }
  public String GetNameID()                   { return (m_Name_ID); }
  public void SetPriority(int tmp)          { m_Priority = tmp; }
  public int GetPriority()                  { return (m_Priority); }
  public String GetPriority_S()                  { return (String.valueOf(m_Priority)); }
  public void SetConsumptionNode(boolean tmp)   { m_ConsumptionNode = tmp; }
  public boolean GetConsumptionNode()           { return (m_ConsumptionNode); }
  public String GetConsumptionNode_S()
  {
      if (m_ConsumptionNode) return ("0");
      else return ("1");
//      return (String.valueOf(m_ConsumptionNode));
  }

  public void SetGeneratorNode(boolean tmp) { m_GeneratorNode = tmp; }
  public boolean GetGeneratorNode()         { return (m_GeneratorNode); }
  public String GetGeneratorNode_S()
  {
      if (m_GeneratorNode) return ("0");
      else return ("1");

//    return (String.valueOf( m_GeneratorNode));
  }
  public void SetGeneratorValue(double tmp)    { m_GeneratorValue = tmp; }
  public double GetGeneratorValue()            { return (m_GeneratorValue); }
  public String GetGeneratorValue_S()            { return (String.valueOf(m_GeneratorValue)); }

  public void AddConsumptionList(double tmp)
  {
    Double a= new Double (tmp);
    m_ConsumptionList.add(a);
  }

  public void AddConsumptionList(String tmp)
  {
    Double a = new Double(tmp);
    m_ConsumptionList.add(a);
  }

  public ArrayList GetConsumptionArrayList()
  {
    return (m_ConsumptionList);
  }

  public double GetConsumptionList (int idx)
  {
    try
    {
        Double a = (Double) m_ConsumptionList.get(idx);
        return (a.intValue());
    }
    catch (IndexOutOfBoundsException exc)
    {
     return (0);
    }
   }

  public String GetConsumptionList_S (int idx)
  {
    try
    {
        Double a = (Double) m_ConsumptionList.get(idx);
        return (String.valueOf(a));
    }
    catch (IndexOutOfBoundsException exc)
    {
     return (String.valueOf(0));
    }
  }


  public void UpdateConsumptionList (int Time, double cons_tmp)
  {
    try
    {
        Double a = new Double (cons_tmp);
        m_ConsumptionList.set(Time,a);
    }
    catch (IndexOutOfBoundsException exc)
    {
        WriteFile.Writeln("UpdateConsumptionList exception:",Constants.pathOutputFile,Constants.OutputFile);
    }
  }


  public String toString()
  {
    return ( "NameID ="   +  GetNameID() +
             "\tName ="   +  GetName() +
             "\tPriority =" + GetPriority() +
             "\tConsumption =" + GetConsumptionNode() +
             "\tGenerator =" + GetGeneratorNode() +
             "\tGeneratorValue =" + GetGeneratorValue()
            );
  }

}
