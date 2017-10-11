package Simulator;

/**
 * Title:        Plataforma de simulaçao genérica
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      MEIC, 2002
 * @author Sérgio Guerreiro
 * @version 1.0
 */

public class CorrectiveAction {
private String m_Action;



  public CorrectiveAction() {
    // tudo a null para que o CEO Methodology se aperceba que não há corrective action
      m_Action = new String("");
  }

  public CorrectiveAction(String accao) // por exemplo
  {
      // carrega a accção correctiva
      m_Action = accao;
  }

  public String Get_CorrectiveAction()
  {
      return (m_Action);
  }

}