
//Title:        Plataforma de simula\u00e7ao gen\u00e9rica
//Version:      1.0
//Copyright:    Copyright (c) 2002
//Author:       
//Company:      MEIC, 2002
//Description:  
package DataRepository;

   ////////////////////////////////////////////
   //  Tipo de dados: Rules
   ////////////////////////////////////////////
public class RlsData extends DataType{

  private String Deviation;
  private String Cause;
  private String CorrectiveAction;
  private int Risk_ID;
  private String Description;


  public RlsData() {
    Deviation = new String("");
    Cause = new String("");
    CorrectiveAction = new String("");
    Risk_ID = -1;
    Description = new String("");

  }

  public RlsData(String DV, String CS, String CA, String RID, String D) {
    Deviation = DV;
    Cause = CS;
    CorrectiveAction = CA;
    Risk_ID = Integer.parseInt(RID);
    Description = D;
  }

   ////////////////////////////////////////////
   //  Get e Sets do Tipo de dados
   ////////////////////////////////////////////
  public String Get_Cause()  {  return(Cause); }
  public void set_Cause(String tmp)  {   Cause=tmp;}

  public String Get_Deviation()  {  return(Deviation); }
  public void set_Deviation(String tmp)  {   Deviation=tmp;}

  public String Get_CorrectiveAction()  {  return(CorrectiveAction); }
  public void set_CorrectiveAction(String tmp)  {   CorrectiveAction=tmp;}

  public String Get_Description()  {  return(Description); }
  public void set_Description(String tmp)  {   Description=tmp;}

  public int Get_RiskID_I()  {  return(Risk_ID); }
  public String Get_RiskID_S() {return (String.valueOf(Risk_ID));};
  public void Set_RiskID(int tmp)  {   Risk_ID=tmp;}
  public void Set_RiskID(String tmp) { Risk_ID = Integer.parseInt(tmp);};



 
}