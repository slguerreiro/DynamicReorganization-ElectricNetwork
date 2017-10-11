
//Title:        Plataforma de simula\u00e7ao gen\u00e9rica
//Version:      1.0
//Copyright:    Copyright (c) 2002
//Author:
//Company:      MEIC, 2002
//Description:
package DataRepository;


   ////////////////////////////////////////////
   //  Tipo de dados: Process Performance Measure
   ////////////////////////////////////////////
public class PPMData  extends DataType{
private String RoboticModule;
private String ProcessMeasureVariable;
private String Value;
private String Description;



  public PPMData() {
    RoboticModule = new String("");
    ProcessMeasureVariable = new String("");
    Value = new String("");
    Description = new String("");
  }

  public PPMData(String RM, String PMV, String V, String D) {
    RoboticModule = RM;
    ProcessMeasureVariable = PMV;
    Value = V;
    Description = D;
  }

   ////////////////////////////////////////////
   //  Get e Sets do Tipo de dados
   ////////////////////////////////////////////
  public String Get_RoboticModule()  {  return(RoboticModule); }
  public void set_RoboticModule(String tmp)  {   RoboticModule=tmp;}

  public String Get_ProcessMeasureVariable()  {  return(ProcessMeasureVariable); }
  public void set_ProcessMeasureVariable(String tmp)  {   ProcessMeasureVariable=tmp;}

  public String Get_Value()  {  return(Value); }
  public void set_Value(String tmp)  {   Value=tmp;}

  public String Get_Description()  {  return(Description); }
  public void set_Description(String tmp)  {   Description=tmp;}

  public String toString()
  {
    return (Get_RoboticModule()+","+Get_ProcessMeasureVariable()+","+Get_Value()+","+Get_Description());
  }

}