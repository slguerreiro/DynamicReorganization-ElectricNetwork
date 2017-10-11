
//Title:        Plataforma de simula\u00e7ao gen\u00e9rica
//Version:      1.0
//Copyright:    Copyright (c) 2002
//Author:
//Company:      MEIC, 2002
//Description:
package SimulatorPlatform;

public class Constants {

// configuração para o nível de dados
public static String PPerfMMs = "PerformanceMeasureMappings.txt";
public static String RskMs = "RisksMappings.txt";
public static String RlsMs = "RulesMappings.txt";
public static String pathInputFile="d:\\Meic\\PlataformaSimulacaoREN_LigacaoEspanha\\Mapeamentos\\";
public static String pathOutputGraphFile="d:\\Meic\\PlataformaSimulacaoREN_LigacaoEspanha\\Graficos\\";
public static String OutputFile="SimulationOutput";
public static String OutputGraphFile="SimulationGraphOutput";
public static String pathOutputFile="d:\\Meic\\PlataformaSimulacaoREN_LigacaoEspanha\\Outputs\\";
public static String SeparatorFile="#";
public static String connectString="";  // Para Base de dados
public static int WriteToFile = 1;
public static int NumMaxDays = 365;
public static int LimitXEcra = 580;
public static int LimitYEcra = 590;

// Para o domínio especifico do caso REN


/////////// NOS
public static String Node7 = "Node7";
public static String Node7_value = "Espanha";
public static String Node7Priority= "Node7Pritority";
public static int Node7Priority_value= 107;
public static String Node7Consumption = "Node7Consumption";
public static boolean Node7Consumption_value = false;
public static String Node7Generator = "Node7Generator";
public static boolean Node7Generator_value = true;
public static String Node7Generation = "Node7Generation";
public static double Node7Generation_value = 99999999;
public static String Node7PowerNeed = "Node7PowerNeed";


public static String Node0 = "Node0";
public static String Node0_value = "BarragemDeBode";
public static String Node0Priority= "Node0Pritority";
public static int Node0Priority_value= 100;
public static String Node0Consumption = "Node0Consumption";
public static boolean Node0Consumption_value = false;
public static String Node0Generator = "Node0Generator";
public static boolean Node0Generator_value = true;
public static String Node0Generation = "Node0Generation";
public static double Node0Generation_value = 75;
public static String Node0PowerNeed = "Node0PowerNeed";

public static String Node6 = "Node6";
public static String Node6_value = "BarragemDoAlqueva";
public static String Node6Priority= "Node6Pritority";
public static int Node6Priority_value= 106;
public static String Node6Consumption = "Node6Consumption";
public static boolean Node6Consumption_value = false;
public static String Node6Generator = "Node6Generator";
public static boolean Node6Generator_value = true;
public static String Node6Generation = "Node6Generation";
public static double Node6Generation_value = 70;
public static String Node6PowerNeed = "Node6PowerNeed";


public static String Node1 = "Node1";
public static String Node1_value = "Sacavem";
public static String Node1Priority= "Node1Pritority";
public static int Node1Priority_value= 101;
public static String Node1Consumption = "Node1Consumption";
public static boolean Node1Consumption_value = true;
public static String Node1Generator = "Node1Generator";
public static boolean Node1Generator_value = false;
public static String Node1Generation = "Node1Generation";
public static double Node1Generation_value = 0;
public static String Node1PowerNeed = "Node1PowerNeed";

public static String Node2 = "Node2";
public static String Node2_value = "Oeiras";
public static String Node2Priority= "Node2Pritority";
public static int Node2Priority_value= 102;
public static String Node2Consumption = "Node2Consumption";
public static boolean Node2Consumption_value = true;
public static String Node2Generator = "Node2Generator";
public static boolean Node2Generator_value = false;
public static String Node2Generation = "Node2Generation";
public static double Node2Generation_value = 0;
public static String Node2PowerNeed = "Node2PowerNeed";

public static String Node3 = "Node3";
public static String Node3_value = "Alcochete";
public static String Node3Priority= "Node3Pritority";
public static int Node3Priority_value= 103;
public static String Node3Consumption = "Node3Consumption";
public static boolean Node3Consumption_value = true;
public static String Node3Generator = "Node3Generator";
public static boolean Node3Generator_value = false;
public static String Node3Generation = "Node3Generation";
public static double Node3Generation_value = 0;
public static String Node3PowerNeed = "Node3PowerNeed";

public static String Node4 = "Node4";
public static String Node4_value = "Porto";
public static String Node4Priority= "Node4Pritority";
public static int Node4Priority_value= 104;
public static String Node4Consumption = "Node4Consumption";
public static boolean Node4Consumption_value = true;
public static String Node4Generator = "Node4Generator";
public static boolean Node4Generator_value = false;
public static String Node4Generation = "Node4Generation";
public static double Node4Generation_value = 0;
public static String Node4PowerNeed = "Node4PowerNeed";

public static String Node5 = "Node5";
public static String Node5_value = "Santarem";
public static String Node5Priority= "Node5Pritority";
public static int Node5Priority_value= 105;
public static String Node5Consumption = "Node5Consumption";
public static boolean Node5Consumption_value = true;
public static String Node5Generator = "Node5Generator";
public static boolean Node5Generator_value = false;
public static String Node5Generation = "Node5Generation";
public static double Node5Generation_value = 0;
public static String Node5PowerNeed = "Node5PowerNeed";


///////// RAMOS
public static String link0 = "Link0";
public static String link0_value = Constants.Node0_value + "-" + Constants.Node1_value;
public static String link0MaxCapacity = "Link0MaxCapacity";
public static double link0MaxCapacity_value = 200;
public static String link0Charge = "Link0Charge";
public static double link0Charge_value = 45;
public static String link0CircuitBreaker = "Link0CircuitBreaker";
public static boolean link0CircuitBreaker_value = false;

public static String link1 = "Link1";
public static String link1_value = Constants.Node0_value + "-" + Constants.Node2_value;
public static String link1MaxCapacity = "Link1MaxCapacity";
public static double link1MaxCapacity_value = 201;
public static String link1Charge = "Link1Charge";
public static double link1Charge_value = 45;
public static String link1CircuitBreaker = "Link1CircuitBreaker";
public static boolean link1CircuitBreaker_value = false;

public static String link2 = "Link2";
public static String link2_value = Constants.Node0_value + "-" + Constants.Node3_value;
public static String link2MaxCapacity = "Link2MaxCapacity";
public static double link2MaxCapacity_value = 202;
public static String link2Charge = "Link2Charge";
public static double link2Charge_value = 45;
public static String link2CircuitBreaker = "Link2CircuitBreaker";
public static boolean link2CircuitBreaker_value = false;

public static String link3 = "Link3";
public static String link3_value = Constants.Node0_value + "-" + Constants.Node4_value;
public static String link3MaxCapacity = "Link3MaxCapacity";
public static double link3MaxCapacity_value = 203;
public static String link3Charge = "Link3Charge";
public static double link3Charge_value = 45;
public static String link3CircuitBreaker = "Link3CircuitBreaker";
public static boolean link3CircuitBreaker_value = false;

public static String link4 = "Link4";
public static String link4_value = Constants.Node0_value + "-" + Constants.Node5_value;
public static String link4MaxCapacity = "Link4MaxCapacity";
public static double link4MaxCapacity_value = 204;
public static String link4Charge = "Link4Charge";
public static double link4Charge_value = 45;
public static String link4CircuitBreaker = "Link4CircuitBreaker";
public static boolean link4CircuitBreaker_value = false;


public static String link5 = "Link5";
public static String link5_value = Constants.Node6_value + "-" + Constants.Node1_value;
public static String link5MaxCapacity = "Link5MaxCapacity";
public static double link5MaxCapacity_value = 205;
public static String link5Charge = "Link5Charge";
public static double link5Charge_value = 45;
public static String link5CircuitBreaker = "Link5CircuitBreaker";
public static boolean link5CircuitBreaker_value = true;

public static String link6 = "Link6";
public static String link6_value = Constants.Node6_value + "-" + Constants.Node2_value;
public static String link6MaxCapacity = "Link6MaxCapacity";
public static double link6MaxCapacity_value = 206;
public static String link6Charge = "Link6Charge";
public static double link6Charge_value = 45;
public static String link6CircuitBreaker = "Link6CircuitBreaker";
public static boolean link6CircuitBreaker_value = true;

public static String link7 = "Link7";
public static String link7_value = Constants.Node6_value + "-" + Constants.Node3_value;
public static String link7MaxCapacity = "Link7MaxCapacity";
public static double link7MaxCapacity_value = 207;
public static String link7Charge = "Link7Charge";
public static double link7Charge_value = 45;
public static String link7CircuitBreaker = "Link7CircuitBreaker";
public static boolean link7CircuitBreaker_value = true;

public static String link8 = "Link8";
public static String link8_value = Constants.Node6_value + "-" + Constants.Node4_value;
public static String link8MaxCapacity = "Link8MaxCapacity";
public static double link8MaxCapacity_value = 208;
public static String link8Charge = "Link8Charge";
public static double link8Charge_value = 45;
public static String link8CircuitBreaker = "Link8CircuitBreaker";
public static boolean link8CircuitBreaker_value = true;

public static String link9 = "Link9";
public static String link9_value = Constants.Node6_value + "-" + Constants.Node5_value;
public static String link9MaxCapacity = "Link9MaxCapacity";
public static double link9MaxCapacity_value = 209;
public static String link9Charge = "Link9Charge";
public static double link9Charge_value = 45;
public static String link9CircuitBreaker = "Link9CircuitBreaker";
public static boolean link9CircuitBreaker_value = true;


public static String link10 = "Link10";
public static String link10_value = Constants.Node7_value + "-" + Constants.Node1_value;
public static String link10MaxCapacity = "Link10MaxCapacity";
public static double link10MaxCapacity_value = 99999;
public static String link10Charge = "Link10Charge";
public static double link10Charge_value = 45;
public static String link10CircuitBreaker = "Link10CircuitBreaker";
public static boolean link10CircuitBreaker_value = true;

public static String link11 = "Link11";
public static String link11_value = Constants.Node7_value + "-" + Constants.Node2_value;
public static String link11MaxCapacity = "Link11MaxCapacity";
public static double link11MaxCapacity_value = 99999;
public static String link11Charge = "Link11Charge";
public static double link11Charge_value = 45;
public static String link11CircuitBreaker = "Link11CircuitBreaker";
public static boolean link11CircuitBreaker_value = true;

public static String link12 = "Link12";
public static String link12_value = Constants.Node7_value + "-" + Constants.Node3_value;
public static String link12MaxCapacity = "Link12MaxCapacity";
public static double link12MaxCapacity_value = 99999;
public static String link12Charge = "Link12Charge";
public static double link12Charge_value = 45;
public static String link12CircuitBreaker = "Link12CircuitBreaker";
public static boolean link12CircuitBreaker_value = true;

public static String link13 = "Link13";
public static String link13_value = Constants.Node7_value + "-" + Constants.Node4_value;
public static String link13MaxCapacity = "Link13MaxCapacity";
public static double link13MaxCapacity_value = 99999;
public static String link13Charge = "Link13Charge";
public static double link13Charge_value = 45;
public static String link13CircuitBreaker = "Link13CircuitBreaker";
public static boolean link13CircuitBreaker_value = true;

public static String link14 = "Link14";
public static String link14_value = Constants.Node7_value + "-" + Constants.Node5_value;
public static String link14MaxCapacity = "Link14MaxCapacity";
public static double link14MaxCapacity_value = 99999;
public static String link14Charge = "Link14Charge";
public static double link14Charge_value = 45;
public static String link14CircuitBreaker = "Link14CircuitBreaker";
public static boolean link14CircuitBreaker_value = true;


// Identificadores com ficheiros mapeamentos do consumo
public static String PathConsumos = "d:\\Meic\\PlataformaSimulacaoREN_LigacaoEspanha\\Consumos\\";
public static String ConsumosNode1 = Node1_value + ".txt";
public static String ConsumosNode2 = Node2_value + ".txt";
public static String ConsumosNode3 = Node3_value + ".txt";
public static String ConsumosNode4 = Node4_value + ".txt";
public static String ConsumosNode5 = Node5_value + ".txt";

// Constantes para o user dict
public static String userdict_Node = "Node";
public static String userdict_Link = "Link";

////////  Time
public static String Time = "Time";
public static double Time_value = 0;

// Ordens de reorganizacao
public static String Order_CHANGE_CircuitBreaker0_STATE = "CHANGE_CircuitBreaker0";
public static String Order_CHANGE_CircuitBreaker1_STATE = "CHANGE_CircuitBreaker1";
public static String Order_CHANGE_CircuitBreaker2_STATE = "CHANGE_CircuitBreaker2";
public static String Order_CHANGE_CircuitBreaker3_STATE = "CHANGE_CircuitBreaker3";
public static String Order_CHANGE_CircuitBreaker4_STATE = "CHANGE_CircuitBreaker4";
public static String Order_OPEN_CircuitBreaker0_STATE = "OPEN_CircuitBreaker0";
public static String Order_OPEN_CircuitBreaker1_STATE = "OPEN_CircuitBreaker1";
public static String Order_OPEN_CircuitBreaker2_STATE = "OPEN_CircuitBreaker2";
public static String Order_OPEN_CircuitBreaker3_STATE = "OPEN_CircuitBreaker3";
public static String Order_OPEN_CircuitBreaker4_STATE = "OPEN_CircuitBreaker4";
public static String Order_CLOSE_CircuitBreaker0_STATE = "CLOSE_CircuitBreaker0";
public static String Order_CLOSE_CircuitBreaker1_STATE = "CLOSE_CircuitBreaker1";
public static String Order_CLOSE_CircuitBreaker2_STATE = "CLOSE_CircuitBreaker2";
public static String Order_CLOSE_CircuitBreaker3_STATE = "CLOSE_CircuitBreaker3";
public static String Order_CLOSE_CircuitBreaker4_STATE = "CLOSE_CircuitBreaker4";
public static String Order_CLOSEALL_CircuitBreaker_STATE = "CLOSEALL_CircuitBreaker";
public static String Order_OPENALL_CircuitBreaker_STATE = "OPENALL_CircuitBreaker";

public static String Order_CHANGE_Production_Node0_STATE = "CHANGE_Production_Node0";
public static String Order_CHANGE_Production_Node1_STATE = "CHANGE_Production_Node1";
public static String Order_CHANGE_Production_Node2_STATE = "CHANGE_Production_Node2";
public static String Order_CHANGE_Production_Node3_STATE = "CHANGE_Production_Node3";
public static String Order_CHANGE_Production_Node4_STATE = "CHANGE_Production_Node4";
public static String Order_CHANGE_Production_Node5_STATE = "CHANGE_Production_Node5";

public static String Order_CLOSEONLY_Production_Node1_STATE = "CLOSEONLY_Production_Node1";
public static String Order_CLOSEONLY_Production_Node1_2_STATE = "CLOSEONLY_Production_Node12";
public static String Order_CLOSEONLY_Production_Node1_2_3_STATE = "CLOSEONLY_Production_Node123";
public static String Order_CLOSEONLY_Production_Node1_2_3_4_STATE = "CLOSEONLY_Production_Node1234";
public static String Order_CLOSEONLY_Production_Node1_2_3_4_5_STATE = "CLOSEONLY_Production_Node12345";

// caso espanha
public static String Order_CHANGE_G1_Node1_STATE = "CHANGE_G1_Node1";
public static String Order_CHANGE_G1_Node1_2_STATE = "CHANGE_G1_Node12";
public static String Order_CHANGE_G1_Node1_2_3_STATE = "CHANGE_G1_Node123";
public static String Order_CHANGE_G1_Node1_2_3_4_STATE = "CHANGE_G1_Node1234";
public static String Order_CHANGE_G1_Node1_2_3_4_5_STATE = "CHANGE_G1_Node12345";

public static String Order_CHANGE_G2_Node1_STATE = "CHANGE_G2_Node1";
public static String Order_CHANGE_G2_Node1_2_STATE = "CHANGE_G2_Node12";
public static String Order_CHANGE_G2_Node1_2_3_STATE = "CHANGE_G2_Node123";
public static String Order_CHANGE_G2_Node1_2_3_4_STATE = "CHANGE_G2_Node1234";
public static String Order_CHANGE_G2_Node1_2_3_4_5_STATE = "CHANGE_G2_Node12345";


public static String Order_CHANGE_G1_Node1_SPAIN_STATE = "CHANGE_G1_Node1_SPAIN";
public static String Order_CHANGE_G1_Node1_2_SPAIN_STATE = "CHANGE_G1_Node12_SPAIN";
public static String Order_CHANGE_G1_Node1_2_3_SPAIN_STATE = "CHANGE_G1_Node123_SPAIN";
public static String Order_CHANGE_G1_Node1_2_3_4_SPAIN_STATE = "CHANGE_G1_Node1234_SPAIN";
public static String Order_CHANGE_G1_Node1_2_3_4_5_SPAIN_STATE = "CHANGE_G1_Node12345_SPAIN";

public static String Order_CHANGE_G2_Node1_SPAIN_STATE = "CHANGE_G2_Node1_SPAIN";
public static String Order_CHANGE_G2_Node1_2_SPAIN_STATE = "CHANGE_G2_Node12_SPAIN";
public static String Order_CHANGE_G2_Node1_2_3_SPAIN_STATE = "CHANGE_G2_Node123_SPAIN";
public static String Order_CHANGE_G2_Node1_2_3_4_SPAIN_STATE = "CHANGE_G2_Node1234_SPAIN";
public static String Order_CHANGE_G2_Node1_2_3_4_5_SPAIN_STATE = "CHANGE_G2_Node12345_SPAIN";


public static String Order_CHANGE_SPAIN_Node1_G1_STATE = "CHANGE_SPAIN_Node1_G1";
public static String Order_CHANGE_SPAIN_Node1_2_G1_STATE = "CHANGE_SPAIN_Node12_G1";
public static String Order_CHANGE_SPAIN_Node1_2_3_G1_STATE = "CHANGE_SPAIN_Node123_G1";
public static String Order_CHANGE_SPAIN_Node1_2_3_4_G1_STATE = "CHANGE_SPAIN_Node1234_G1";
public static String Order_CHANGE_SPAIN_Node1_2_3_4_5_G1_STATE = "CHANGE_SPAIN_Node12345_G1";

public static String Order_CHANGE_SPAIN_Node1_G2_STATE = "CHANGE_SPAIN_Node1_G2";
public static String Order_CHANGE_SPAIN_Node1_2_G2_STATE = "CHANGE_SPAIN_Node12_G2";
public static String Order_CHANGE_SPAIN_Node1_2_3_G2_STATE = "CHANGE_SPAIN_Node123_G2";
public static String Order_CHANGE_SPAIN_Node1_2_3_4_G2_STATE = "CHANGE_SPAIN_Node1234_G2";
public static String Order_CHANGE_SPAIN_Node1_2_3_4_5_G2_STATE = "CHANGE_SPAIN_Node12345_G2";


// Constantes para as operações lógicas das expressões avaliadoras
// Operações nível A
public static String Operation_AND = "AND";
public static String Operation_OR = "OR";
public static String Operation_XOR = "XOR";
public static String Operation_NOT = "NOT";
public static String Operation_ABSTRACT_A = "@A";
public static String ClasseA = "Classe A";

  // Operações nível B
public static String Operation_LESS = "<";
public static String Operation_GREATER = ">";
public static String Operation_EQUAL = "=";
public static String Operation_LESS_EQUAL = "<=";
public static String Operation_GREATER_EQUAL = ">=";
public static String Operation_NOT_EQUAL = "<>";
public static String Operation_ABSTRACT_B = "@B";
public static String ClasseB = "Classe B";

  // Operações nível C
public static String Operation_PLUS = "+";
public static String Operation_MINUS = "-";
public static String Operation_DIV = "/";
public static String Operation_MUL = "*";
public static String Operation_MOD = "MOD";
public static String Operation_ABS = "ABS";
public static String Operation_SQRT = "SQRT";
public static String Operation_SQR = "SQR";
public static String Operation_ABSTRACT_C = "@C";
public static String ClasseC = "Classe C";


  public Constants() {
  }
}