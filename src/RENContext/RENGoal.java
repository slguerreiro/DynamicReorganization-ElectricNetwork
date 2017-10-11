
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


public class RENGoal {

private ArrayList m_orders;


  public RENGoal()
  {
    m_orders = new ArrayList();
  }


  public void AddGoal(String Name, boolean state_rel, int index, boolean state_abs)
  {
    OrderCircuitBreaker CB_tmp = new OrderCircuitBreaker(Name, state_rel, index, state_abs);
    m_orders.add(CB_tmp);
  }


  public void AddGoal(String Name, boolean state_rel, int index, boolean state_abs, String Name_other_link)
  {
    OrderCircuitBreaker CB_tmp = new OrderCircuitBreaker(Name, state_rel, index, state_abs, Name_other_link);
    m_orders.add(CB_tmp);
  }


  public OrderCircuitBreaker GetGoal(int idx)
  {
    return ((OrderCircuitBreaker) m_orders.get(idx));
  }


  public void ClearGoals()
  {
    m_orders.clear();
  }


  public int GetSize()
  {
   return (m_orders.size());
  }


}