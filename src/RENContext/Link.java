
//Title:        Plataforma Simulacao REN
//Version:      
//Copyright:    Copyright (c) 1999
//Author:       Sergio Guerreiro
//Company:      IST, MEIC 2002
//Description:  Your description
package RENContext;

public class Link {

private String m_Name;
private String m_Name_ID;
private double m_MaximumCapacity;
private double m_Capacity;
private boolean m_CircuitBreaker;

  public Link() {
  }

  public Link(String Name, String NameID, double MaximumCapacity, double Capacity, boolean CircuitBreaker) {
    SetName(Name);
    SetNameID(NameID);
    SetMaximumCapacity(MaximumCapacity);
    SetCapacity(Capacity);
    SetCircuitBreaker(CircuitBreaker);
  }

  public void SetName( String tmp ) { m_Name = tmp; }
  public String GetName() {return (m_Name);}
  public void SetNameID( String tmp ) { m_Name_ID = tmp; }
  public String GetNameID() {return (m_Name_ID);}
  public void SetMaximumCapacity( double tmp ) { m_MaximumCapacity = tmp; }
  public double GetMaximumCapacity() {return (m_MaximumCapacity);}
  public String GetMaximumCapacity_S() {return (String.valueOf(m_MaximumCapacity));}
  public void SetCapacity( double tmp ) { m_Capacity = tmp; }
  public double GetCapacity() {return (m_Capacity);}
  public String GetCapacity_S() {return (String.valueOf(m_Capacity));}
  public void SetCircuitBreaker( boolean tmp ) { m_CircuitBreaker = tmp; }
  public boolean GetCircuitBreaker() {return (m_CircuitBreaker);}
  public String GetCircuitBreaker_S()
  {
      if (m_CircuitBreaker) return ("0");
      else return ("1");

//      return (String.valueOf(m_CircuitBreaker));
  }

  public String toString()
  {
    return ( "NameID ="   +  GetNameID() +
             "\tName ="   +  GetName() +
             "\tMaximumCapacity =" + GetMaximumCapacity() +
             "\tCapacity =" + GetCapacity() +
             "\tCircuitBreaker =" + GetCircuitBreaker()
            );
  }
}
