
//Title:        Plataforma Simulacao REN
//Version:      
//Copyright:    Copyright (c) 1999
//Author:       Sergio Guerreiro
//Company:      IST, MEIC 2002
//Description:  Your description
package RENContext;

public class OrderCircuitBreaker {

private String m_Name_link;
private boolean m_toogle; // mudança de estado relativo
private int m_index_link;
private boolean m_new_state; // mudança de estado absoluto
private String m_relacao_link;

  public OrderCircuitBreaker(String Name, boolean state, int index, boolean state_abs)
  {
    SetName(Name);
    SetStateREL(state);
    SetIndex(index);
    SetStateABS(state_abs);
  }

   public OrderCircuitBreaker(String Name, boolean state, int index, boolean state_abs,String relacao_link)
  {
    SetName(Name);
    SetStateREL(state);
    SetIndex(index);
    SetStateABS(state_abs);
    SetRelacaoLink(relacao_link);
  }


  public void SetName(String tmp) {m_Name_link = tmp;}
  public String GetName() {return (m_Name_link);}

  public void SetStateREL(boolean tmp) {m_toogle = tmp;}
  public boolean GetStateREL() { return (m_toogle);}

  public void SetIndex(int tmp) {m_index_link = tmp;}
  public int GetIndex() {return (m_index_link);}

  public void SetStateABS(boolean tmp) {m_new_state = tmp;}
  public boolean GetStateABS() { return (m_new_state);}

  public void SetRelacaoLink(String tmp) {m_relacao_link = tmp;}
  public String GetRelacaoLink() { return (m_relacao_link);}

  public String toString()
  {
    return ("Name =" + GetName() +
            "\tStateREL =" + GetStateREL() +
            "\tIndex =" + GetIndex() +
            "\tStateABS =" + GetStateABS() );
  }

}