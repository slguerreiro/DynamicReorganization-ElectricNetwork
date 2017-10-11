
//Title:        Plataforma de simula\u00e7ao gen\u00e9rica
//Version:      1.0
//Copyright:    Copyright (c) 2002
//Author:
//Company:      MEIC, 2002
//Description:
package DataRepository;


   ////////////////////////////////////////////
   //  Tipo de dados: Risks
   ////////////////////////////////////////////
public class RskData extends DataType{

private String TriggerRule;
private int Risk_ID;
private int Priority;
private String Description;



  public RskData() {
    TriggerRule = new String("");
    Description = new String("");
    Priority = -1;
    Risk_ID = -1;
  }

  public RskData(String TR, int RID, int P , String D) {
    TriggerRule = TR;
    Description = D;
    Risk_ID = RID;
    Priority = P;
  }

  public RskData(String TR, String RID , String P , String D) {
    TriggerRule = TR;
    Description = D;
    Priority = Integer.parseInt(P);
    Risk_ID = Integer.parseInt(RID);

  }

  ////////////////////////////////////////////
   //  Get e Sets do Tipo de dados
   ////////////////////////////////////////////
  public String Get_TriggerRule()  {  return(TriggerRule); }
  public void set_TriggerRule(String tmp)  {   TriggerRule=tmp;}
  public String Get_Description()  {  return(Description); }
  public void set_Description(String tmp)  {   Description=tmp;}
  public String Get_Priority_S()  {  return(String.valueOf(Priority)); }
  public int Get_Priority_I() {  return(Priority);};
  public void set_Priority(int tmp)  {   Priority=tmp;}

  public int Get_RiskID_I()  {  return(Risk_ID); }
  public String Get_RiskID_S() {return (String.valueOf(Risk_ID));};
  public void Set_RiskID(int tmp)  {   Risk_ID=tmp;}
  public void Set_RiskID(String tmp) { Risk_ID = Integer.parseInt(tmp);};

  public String toString()
  {
    return (Get_Description() + "," + Get_Priority_S() + "\n");
  }



}