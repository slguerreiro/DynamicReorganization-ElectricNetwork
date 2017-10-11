//Source file: C:/Meic/Tese/VigilanciaRoboticoCaseStudy/Codigo/Simulator/Methodology.java

package Simulator;
import java.lang.*;
import java.io.*;
import java.util.*;
import RENContext.*;
import SimulatorPlatform.*;

/**
 * @author
 * @version
 */
public class Methodology
{
  RENGoal Objective;

   public Methodology()
   {
      System.out.println("Methodology created...");
      WriteFile.Writeln("Methodology created...",Constants.pathOutputFile,Constants.OutputFile);
      Objective = new RENGoal();
   }


  ////////////////////////////////////////////////////
  //  Executa o módulo de Methodology do Process Module
  ////////////////////////////////////////////////////
   public RENGoal execute(CorrectiveAction action)
   {
      Objective = null;

      if (action != null)
      {
        Objective = new RENGoal();
        if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_CircuitBreaker0_STATE) == 0)
        { Objective.AddGoal(Constants.link0, true , 0, false); }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_CircuitBreaker1_STATE) == 0)
        { Objective.AddGoal(Constants.link1, true , 1, false); }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_CircuitBreaker2_STATE) == 0)
        { Objective.AddGoal(Constants.link2, true , 2, false); }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_CircuitBreaker3_STATE) == 0)
        { Objective.AddGoal(Constants.link3, true , 3, false); }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_CircuitBreaker4_STATE) == 0)
        { Objective.AddGoal(Constants.link4, true , 4, false); }

        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_OPEN_CircuitBreaker0_STATE) == 0)
        { Objective.AddGoal(Constants.link0, false , 0, true); }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_OPEN_CircuitBreaker1_STATE) == 0)
        { Objective.AddGoal(Constants.link1, false , 1, true); }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_OPEN_CircuitBreaker2_STATE) == 0)
        { Objective.AddGoal(Constants.link2, false , 2, true); }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_OPEN_CircuitBreaker3_STATE) == 0)
        { Objective.AddGoal(Constants.link3, false , 3, true); }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_OPEN_CircuitBreaker4_STATE) == 0)
        { Objective.AddGoal(Constants.link4, false , 4, true); }

        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CLOSE_CircuitBreaker0_STATE) == 0)
        { Objective.AddGoal(Constants.link0, false , 0, false); }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CLOSE_CircuitBreaker1_STATE) == 0)
        { Objective.AddGoal(Constants.link1, false , 1, false); }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CLOSE_CircuitBreaker2_STATE) == 0)
        { Objective.AddGoal(Constants.link2, false , 2, false); }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CLOSE_CircuitBreaker3_STATE) == 0)
        { Objective.AddGoal(Constants.link3, false , 3, false); }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CLOSE_CircuitBreaker4_STATE) == 0)
        { Objective.AddGoal(Constants.link4, false , 4, false); }

        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CLOSEALL_CircuitBreaker_STATE) == 0)
        {
          Objective.AddGoal(Constants.link0, false , 0, false);
          Objective.AddGoal(Constants.link1, false , 1, false);
          Objective.AddGoal(Constants.link2, false , 2, false);
          Objective.AddGoal(Constants.link3, false , 3, false);
          Objective.AddGoal(Constants.link4, false , 4, false);
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_OPENALL_CircuitBreaker_STATE) == 0)
        {
          Objective.AddGoal(Constants.link0, false , 0, true);
          Objective.AddGoal(Constants.link1, false , 1, true);
          Objective.AddGoal(Constants.link2, false , 2, true);
          Objective.AddGoal(Constants.link3, false , 3, true);
          Objective.AddGoal(Constants.link4, false , 4, true);
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CLOSEONLY_Production_Node1_STATE) == 0)
        {
          Objective.AddGoal(Constants.link0, false , 0, true);
          Objective.AddGoal(Constants.link1, false , 1, false);
          Objective.AddGoal(Constants.link2, false , 2, false);
          Objective.AddGoal(Constants.link3, false , 3, false);
          Objective.AddGoal(Constants.link4, false , 4, false);
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CLOSEONLY_Production_Node1_2_STATE) == 0)
        {
          Objective.AddGoal(Constants.link0, false , 0, true);
          Objective.AddGoal(Constants.link1, false , 1, true);
          Objective.AddGoal(Constants.link2, false , 2, false);
          Objective.AddGoal(Constants.link3, false , 3, false);
          Objective.AddGoal(Constants.link4, false , 4, false);
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CLOSEONLY_Production_Node1_2_3_STATE) == 0)
        {
          Objective.AddGoal(Constants.link0, false , 0, true);
          Objective.AddGoal(Constants.link1, false , 1, true);
          Objective.AddGoal(Constants.link2, false , 2, true);
          Objective.AddGoal(Constants.link3, false , 3, false);
          Objective.AddGoal(Constants.link4, false , 4, false);
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CLOSEONLY_Production_Node1_2_3_4_STATE) == 0)
        {
          Objective.AddGoal(Constants.link0, false , 0, true);
          Objective.AddGoal(Constants.link1, false , 1, true);
          Objective.AddGoal(Constants.link2, false , 2, true);
          Objective.AddGoal(Constants.link3, false , 3, true);
          Objective.AddGoal(Constants.link4, false , 4, false);
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CLOSEONLY_Production_Node1_2_3_4_5_STATE) == 0)
        {
          Objective.AddGoal(Constants.link0, false , 0, true);
          Objective.AddGoal(Constants.link1, false , 1, true);
          Objective.AddGoal(Constants.link2, false , 2, true);
          Objective.AddGoal(Constants.link3, false , 3, true);
          Objective.AddGoal(Constants.link4, false , 4, true);
        }


///caso espanha
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_G1_Node1_STATE) == 0)
        {
          Objective.AddGoal(Constants.link0, false , 0, true , Constants.link5);
//          Objective.AddGoal(Constants.link5, false , 1, false);
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_G1_Node1_2_STATE) == 0)
        {
          Objective.AddGoal(Constants.link0, false , 0, true , Constants.link5);
          Objective.AddGoal(Constants.link1, false , 1, true , Constants.link6);
  //        Objective.AddGoal(Constants.link5, false , 2, false);
    //      Objective.AddGoal(Constants.link6, false , 3, false);
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_G1_Node1_2_3_STATE) == 0)
        {
          Objective.AddGoal(Constants.link0, false , 0, true , Constants.link5);
          Objective.AddGoal(Constants.link1, false , 1, true , Constants.link6);
          Objective.AddGoal(Constants.link2, false , 2, true , Constants.link7);
//          Objective.AddGoal(Constants.link5, false , 3, false);
//          Objective.AddGoal(Constants.link6, false , 4, false);
//          Objective.AddGoal(Constants.link7, false , 5, false);
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_G1_Node1_2_3_4_STATE) == 0)
        {
          Objective.AddGoal(Constants.link0, false , 0, true , Constants.link5);
          Objective.AddGoal(Constants.link1, false , 1, true , Constants.link6);
          Objective.AddGoal(Constants.link2, false , 2, true , Constants.link7);
          Objective.AddGoal(Constants.link3, false , 3, true , Constants.link8);
//          Objective.AddGoal(Constants.link5, false , 4, false);
 //         Objective.AddGoal(Constants.link6, false , 5, false);
  //        Objective.AddGoal(Constants.link7, false , 6, false);
   //       Objective.AddGoal(Constants.link8, false , 7, false);
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_G1_Node1_2_3_4_5_STATE) == 0)
        {
          Objective.AddGoal(Constants.link0, false , 0, true , Constants.link5);
          Objective.AddGoal(Constants.link1, false , 1, true , Constants.link6);
          Objective.AddGoal(Constants.link2, false , 2, true , Constants.link7);
          Objective.AddGoal(Constants.link3, false , 3, true , Constants.link8);
          Objective.AddGoal(Constants.link4, false , 4, true , Constants.link9);
    /*      Objective.AddGoal(Constants.link5, false , 5, false);
          Objective.AddGoal(Constants.link6, false , 6, false);
          Objective.AddGoal(Constants.link7, false , 7, false);
          Objective.AddGoal(Constants.link8, false , 8, false);
          Objective.AddGoal(Constants.link9, false , 9, false);*/
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_G2_Node1_STATE) == 0)
        {
    //      Objective.AddGoal(Constants.link0, false , 0, false);
          Objective.AddGoal(Constants.link5, false , 0, true , Constants.link0);
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_G2_Node1_2_STATE) == 0)
        {
   /*       Objective.AddGoal(Constants.link0, false , 0, false);
          Objective.AddGoal(Constants.link1, false , 1, false);*/
          Objective.AddGoal(Constants.link5, false , 0, true , Constants.link0);
          Objective.AddGoal(Constants.link6, false , 1, true , Constants.link6);
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_G2_Node1_2_3_STATE) == 0)
        {
/*          Objective.AddGoal(Constants.link0, false , 0, false);
          Objective.AddGoal(Constants.link1, false , 1, false);
          Objective.AddGoal(Constants.link2, false , 2, false);*/
          Objective.AddGoal(Constants.link5, false , 0, true , Constants.link0);
          Objective.AddGoal(Constants.link6, false , 1, true , Constants.link1);
          Objective.AddGoal(Constants.link7, false , 2, true , Constants.link2);
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_G2_Node1_2_3_4_STATE) == 0)
        {
     /*     Objective.AddGoal(Constants.link0, false , 0, false);
          Objective.AddGoal(Constants.link1, false , 1, false);
          Objective.AddGoal(Constants.link2, false , 2, false);
          Objective.AddGoal(Constants.link3, false , 3, false);*/
          Objective.AddGoal(Constants.link5, false , 0, true , Constants.link0);
          Objective.AddGoal(Constants.link6, false , 1, true , Constants.link1);
          Objective.AddGoal(Constants.link7, false , 2, true , Constants.link2);
          Objective.AddGoal(Constants.link8, false , 3, true , Constants.link3);
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_G2_Node1_2_3_4_5_STATE) == 0)
        {
     /*     Objective.AddGoal(Constants.link0, false , 0, false);
          Objective.AddGoal(Constants.link1, false , 1, false);
          Objective.AddGoal(Constants.link2, false , 2, false);
          Objective.AddGoal(Constants.link3, false , 3, false);
          Objective.AddGoal(Constants.link4, false , 4, false);*/
          Objective.AddGoal(Constants.link5, false , 0, true  ,Constants.link0);
          Objective.AddGoal(Constants.link6, false , 1, true , Constants.link1);
          Objective.AddGoal(Constants.link7, false , 2, true , Constants.link2);
          Objective.AddGoal(Constants.link8, false , 3, true , Constants.link3);
          Objective.AddGoal(Constants.link9, false , 4, true , Constants.link4);
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_G1_Node1_SPAIN_STATE) == 0)
        {
          Objective.AddGoal(Constants.link0 , false , 0, true , Constants.link10);
  //        Objective.AddGoal(Constants.link10, false , 1, false);
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_G1_Node1_2_SPAIN_STATE) == 0)
        {
          Objective.AddGoal(Constants.link0 , false , 0, true , Constants.link10);
          Objective.AddGoal(Constants.link1 , false , 1, true , Constants.link11);
       /*   Objective.AddGoal(Constants.link10, false , 2, false);
          Objective.AddGoal(Constants.link11, false , 3, false);*/
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_G1_Node1_2_3_SPAIN_STATE) == 0)
        {
          Objective.AddGoal(Constants.link0 , false , 0, true  ,Constants.link10);
          Objective.AddGoal(Constants.link1 , false , 1, true  ,Constants.link11);
          Objective.AddGoal(Constants.link2 , false , 2, true  ,Constants.link12);
 /*         Objective.AddGoal(Constants.link10, false , 3, false);
          Objective.AddGoal(Constants.link11, false , 4, false);
          Objective.AddGoal(Constants.link12, false , 5, false);*/
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_G1_Node1_2_3_4_SPAIN_STATE) == 0)
        {
          Objective.AddGoal(Constants.link0 , false , 0, true , Constants.link10);
          Objective.AddGoal(Constants.link1 , false , 1, true , Constants.link11);
          Objective.AddGoal(Constants.link2 , false , 2, true , Constants.link12);
          Objective.AddGoal(Constants.link3 , false , 3, true , Constants.link13);
     /*     Objective.AddGoal(Constants.link10, false , 4, false);
          Objective.AddGoal(Constants.link11, false , 5, false);
          Objective.AddGoal(Constants.link12, false , 6, false);
          Objective.AddGoal(Constants.link13, false , 7, false);*/
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_G1_Node1_2_3_4_5_SPAIN_STATE) == 0)
        {
          Objective.AddGoal(Constants.link0 , false , 0, true , Constants.link10);
          Objective.AddGoal(Constants.link1 , false , 1, true , Constants.link11);
          Objective.AddGoal(Constants.link2 , false , 2, true , Constants.link12);
          Objective.AddGoal(Constants.link3 , false , 3, true , Constants.link13);
          Objective.AddGoal(Constants.link4 , false , 4, true , Constants.link14);
  /*        Objective.AddGoal(Constants.link10, false , 5, false);
          Objective.AddGoal(Constants.link11, false , 6, false);
          Objective.AddGoal(Constants.link12, false , 7, false);
          Objective.AddGoal(Constants.link13, false , 8, false);
          Objective.AddGoal(Constants.link14, false , 9, false);*/
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_G2_Node1_SPAIN_STATE) == 0)
        {
          Objective.AddGoal(Constants.link5 , false , 0, true , Constants.link10);
    //      Objective.AddGoal(Constants.link10, false , 1, false);
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_G2_Node1_2_SPAIN_STATE) == 0)
        {
          Objective.AddGoal(Constants.link5 , false , 0, true , Constants.link10);
          Objective.AddGoal(Constants.link6 , false , 1, true , Constants.link11);
/*          Objective.AddGoal(Constants.link10, false , 2, false);
          Objective.AddGoal(Constants.link11, false , 3, false);*/
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_G2_Node1_2_3_SPAIN_STATE) == 0)
        {
          Objective.AddGoal(Constants.link5 , false , 0, true , Constants.link10);
          Objective.AddGoal(Constants.link6 , false , 1, true , Constants.link1);
          Objective.AddGoal(Constants.link7 , false , 2, true  , Constants.link12);
    /*      Objective.AddGoal(Constants.link10, false , 3, false);
          Objective.AddGoal(Constants.link11, false , 4, false);
          Objective.AddGoal(Constants.link12, false , 5, false);*/
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_G2_Node1_2_3_4_SPAIN_STATE) == 0)
        {
           Objective.AddGoal(Constants.link5 , false , 0, true , Constants.link10);
          Objective.AddGoal(Constants.link6 , false , 1, true , Constants.link1);
          Objective.AddGoal(Constants.link7 , false , 2, true  , Constants.link12);
         Objective.AddGoal(Constants.link8 , false , 3, true , Constants.link13);
/*          Objective.AddGoal(Constants.link10, false , 4, false);
          Objective.AddGoal(Constants.link11, false , 5, false);
          Objective.AddGoal(Constants.link12, false , 6, false);
          Objective.AddGoal(Constants.link13, false , 7, false);*/
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_G2_Node1_2_3_4_5_SPAIN_STATE) == 0)
        {
          Objective.AddGoal(Constants.link5 , false , 0, true , Constants.link10);
          Objective.AddGoal(Constants.link6 , false , 1, true , Constants.link1);
          Objective.AddGoal(Constants.link7 , false , 2, true  , Constants.link12);
         Objective.AddGoal(Constants.link8 , false , 3, true , Constants.link13);
          Objective.AddGoal(Constants.link9 , false , 4, true , Constants.link14);
 /*         Objective.AddGoal(Constants.link10, false , 5, false);
          Objective.AddGoal(Constants.link11, false , 6, false);
          Objective.AddGoal(Constants.link12, false , 7, false);
          Objective.AddGoal(Constants.link13, false , 8, false);
          Objective.AddGoal(Constants.link14, false , 9, false);*/
        }


        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_SPAIN_Node1_G1_STATE) == 0)
        {
  //        Objective.AddGoal(Constants.link0 , false , 0, false);
          Objective.AddGoal(Constants.link10, false , 0, true , Constants.link0);
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_SPAIN_Node1_2_G1_STATE) == 0)
        {
   //       Objective.AddGoal(Constants.link0 , false , 0, false);
     //     Objective.AddGoal(Constants.link1 , false , 1, false);
          Objective.AddGoal(Constants.link10, false , 0, true , Constants.link0);
          Objective.AddGoal(Constants.link11, false , 1, true  ,Constants.link1);
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_SPAIN_Node1_2_3_G1_STATE) == 0)
        {
     /*     Objective.AddGoal(Constants.link0 , false , 0, false);
          Objective.AddGoal(Constants.link1 , false , 1, false);
          Objective.AddGoal(Constants.link2 , false , 2, false);*/
          Objective.AddGoal(Constants.link10, false , 0, true , Constants.link0);
          Objective.AddGoal(Constants.link11, false , 1, true , Constants.link11);
          Objective.AddGoal(Constants.link12, false , 2, true , Constants.link12);
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_SPAIN_Node1_2_3_4_G1_STATE) == 0)
        {
 /*         Objective.AddGoal(Constants.link0 , false , 0, false);
          Objective.AddGoal(Constants.link1 , false , 1, false);
          Objective.AddGoal(Constants.link2 , false , 2, false);
          Objective.AddGoal(Constants.link3 , false , 3, false);*/
          Objective.AddGoal(Constants.link10, false , 0, true , Constants.link0);
          Objective.AddGoal(Constants.link11, false , 1, true , Constants.link1);
          Objective.AddGoal(Constants.link12, false , 2, true , Constants.link2 );
          Objective.AddGoal(Constants.link13, false , 3, true , Constants.link3);
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_SPAIN_Node1_2_3_4_5_G1_STATE) == 0)
        {
/*          Objective.AddGoal(Constants.link0 , false , 0, false);
          Objective.AddGoal(Constants.link1 , false , 1, false);
          Objective.AddGoal(Constants.link2 , false , 2, false);
          Objective.AddGoal(Constants.link3 , false , 3, false);
          Objective.AddGoal(Constants.link4 , false , 4, false);                  */
           Objective.AddGoal(Constants.link10, false , 0, true , Constants.link0);
          Objective.AddGoal(Constants.link11, false , 1, true , Constants.link1);
          Objective.AddGoal(Constants.link12, false , 2, true , Constants.link2 );
          Objective.AddGoal(Constants.link13, false , 3, true , Constants.link3);
          Objective.AddGoal(Constants.link14, false , 4, true , Constants.link4);
        }


        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_SPAIN_Node1_G2_STATE) == 0)
        {
     //     Objective.AddGoal(Constants.link5 , false , 0, false);
          Objective.AddGoal(Constants.link10, false , 0, true, Constants.link5);
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_SPAIN_Node1_2_G2_STATE) == 0)
        {
   //       Objective.AddGoal(Constants.link5 , false , 0, false);
     //     Objective.AddGoal(Constants.link6 , false , 1, false);
          Objective.AddGoal(Constants.link10, false , 0, true , Constants.link5 );
          Objective.AddGoal(Constants.link11, false , 1, true , Constants.link6);
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_SPAIN_Node1_2_3_G2_STATE) == 0)
        {
  /*        Objective.AddGoal(Constants.link5 , false , 0, false);
          Objective.AddGoal(Constants.link6 , false , 1, false);
          Objective.AddGoal(Constants.link7 , false , 2, false);*/
   Objective.AddGoal(Constants.link10, false , 0, true , Constants.link5 );
          Objective.AddGoal(Constants.link11, false , 1, true , Constants.link6);
          Objective.AddGoal(Constants.link12, false , 2, true , Constants.link7);
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_SPAIN_Node1_2_3_4_G2_STATE) == 0)
        {
   /*       Objective.AddGoal(Constants.link5 , false , 0, false);
          Objective.AddGoal(Constants.link6 , false , 1, false);
          Objective.AddGoal(Constants.link7 , false , 2, false);
          Objective.AddGoal(Constants.link8 , false , 3, false);*/
  Objective.AddGoal(Constants.link10, false , 0, true , Constants.link5 );
          Objective.AddGoal(Constants.link11, false , 1, true , Constants.link6);
          Objective.AddGoal(Constants.link12, false , 2, true , Constants.link7);
          Objective.AddGoal(Constants.link13, false , 3, true, Constants.link8);
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_CHANGE_SPAIN_Node1_2_3_4_5_G2_STATE) == 0)
        {
    /*      Objective.AddGoal(Constants.link5 , false , 0, false);
          Objective.AddGoal(Constants.link6 , false , 1, false);
          Objective.AddGoal(Constants.link7 , false , 2, false);
          Objective.AddGoal(Constants.link8 , false , 3, false);
          Objective.AddGoal(Constants.link9 , false , 4, false);*/
   Objective.AddGoal(Constants.link10, false , 0, true , Constants.link5 );
          Objective.AddGoal(Constants.link11, false , 1, true , Constants.link6);
          Objective.AddGoal(Constants.link12, false , 2, true , Constants.link7);
          Objective.AddGoal(Constants.link13, false , 3, true, Constants.link8);
          Objective.AddGoal(Constants.link14, false , 4, true, Constants.link9);
        }
      }
      return (Objective);
   }
}
