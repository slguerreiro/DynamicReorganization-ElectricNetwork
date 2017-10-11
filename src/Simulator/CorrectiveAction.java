package Simulator;

/**
 * Title:        Plataforma de simula�ao gen�rica
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      MEIC, 2002
 * @author S�rgio Guerreiro
 * @version 1.0
 */

public class CorrectiveAction {
private String m_Action;



  public CorrectiveAction() {
    // tudo a null para que o CEO Methodology se aperceba que n�o h� corrective action
      m_Action = new String("");
  }

  public CorrectiveAction(String accao) // por exemplo
  {
      // carrega a acc��o correctiva
      m_Action = accao;
  }

  public String Get_CorrectiveAction()
  {
      return (m_Action);
  }

}