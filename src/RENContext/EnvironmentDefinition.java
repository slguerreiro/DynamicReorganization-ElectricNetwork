
//Title:        Plataforma Simulacao
//Version:
//Copyright:    Copyright (c) 1999
//Author:       Sergio Guerreiro
//Company:      IST, MEIC 2002
//Description:  Your description
package RENContext;
import java.lang.*;
import java.io.*;
import java.util.*;
import SimulatorPlatform.*;
import java.util.Enumeration;
import Simulator.*;
import DataRepository.*;
import com.ibm.graph.Net.*;
import com.ibm.graph.Drawable;
import com.ibm.graph.Edge;
import com.ibm.graph.Graph;
import com.ibm.graph.NotDrawableException;
import com.ibm.graph.Vertex;
import com.ibm.graph.VertexMissingException;
import com.ibm.graph.draw.*;
import com.ibm.graph.layout.*;
import com.ibm.graph.awt.GraphCanvas;
import com.ibm.research.util.Dict;
import com.ibm.research.util.KeyMissingException;
import com.ibm.graph.EdgeMissingException;
import com.ibm.graph.EdgeExistsException;


public class EnvironmentDefinition {


private int Time;        // Tempo actual

private Calendar calendar; // Para controlo dos dias a partir do dia inicial
private Date trialTime;    // Para controlo dos dias a partir do dia inicial

private Graph graph;


  ////////////////////////////////////////////
  //  Definição de ambiente do mundo real Robótico
  ////////////////////////////////////////////
  public EnvironmentDefinition()
  {
       calendar = new GregorianCalendar();
       trialTime = new Date();
       calendar.setTime(trialTime);
       graph = new Graph(); // Inicializaçao do grafo
       LoadGrafo(graph);

       Time = 0;
  }


  ////////////////////////////////////////////
  //  Operações para gestão do tempo
  ////////////////////////////////////////////
  public void Set_Time(int tmp) {Time = tmp;};
  public int Get_Time() {return (Time);};
  public void Add_Time(int tmp) { Time += tmp;};
  public void Inc_Time() { Time++;};


  ////////////////////////////////////////////
  //  Operações para devolver o grafo
  ////////////////////////////////////////////
  public Graph Get_Graph()
  {
      return (graph);
  }


  ////////////////////////////////////////////
  //  Carrega o grafo em memória a partir de ficheiros de consumo e de informação na classe Constants
  ////////////////////////////////////////////
  public Graph LoadGrafo(Graph graph_obj)
  {
      // Definicao No0
      Node no0 = new Node( Constants.Node0_value,
                           Constants.Node0,
                           Constants.Node0Priority_value,
                           Constants.Node0Consumption_value,
                           Constants.Node0Generator_value,
                           Constants.Node0Generation_value);
      AddVertex2Graph(no0, Constants.Node0_value, graph_obj);
      ////////////////////////////////////////////////////////////////////

       // Definicao No6
      Node no6 = new Node( Constants.Node6_value,
                           Constants.Node6,
                           Constants.Node6Priority_value,
                           Constants.Node6Consumption_value,
                           Constants.Node6Generator_value,
                           Constants.Node6Generation_value);
      AddVertex2Graph(no6, Constants.Node6_value, graph_obj);
      ////////////////////////////////////////////////////////////////////

      // Definicao No7
      Node no7 = new Node( Constants.Node7_value,
                           Constants.Node7,
                           Constants.Node7Priority_value,
                           Constants.Node7Consumption_value,
                           Constants.Node7Generator_value,
                           Constants.Node7Generation_value);
      AddVertex2Graph(no7, Constants.Node7_value, graph_obj);
      ////////////////////////////////////////////////////////////////////


      // Definição No1
      Node no1 = new Node( Constants.Node1_value,
                           Constants.Node1,
                           Constants.Node1Priority_value,
                           Constants.Node1Consumption_value,
                           Constants.Node1Generator_value,
                           Constants.Node1Generation_value);
      LoadConsumptions(no1 , Constants.ConsumosNode1);
      AddVertex2Graph (no1 , Constants.Node1_value, graph_obj);
      ////////////////////////////////////////////////////////////////////////


      // Definição No2
      Node no2 = new Node( Constants.Node2_value,
                           Constants.Node2,
                           Constants.Node2Priority_value,
                           Constants.Node2Consumption_value,
                           Constants.Node2Generator_value,
                           Constants.Node2Generation_value);
      LoadConsumptions(no2 , Constants.ConsumosNode2);
      AddVertex2Graph (no2 , Constants.Node2_value , graph_obj);
      ////////////////////////////////////////////////////////////////////////


     // Definição No3
      Node no3 = new Node( Constants.Node3_value,
                           Constants.Node3,
                           Constants.Node3Priority_value,
                           Constants.Node3Consumption_value,
                           Constants.Node3Generator_value,
                           Constants.Node3Generation_value);
      LoadConsumptions(no3 , Constants.ConsumosNode3);
      AddVertex2Graph (no3 , Constants.Node3_value , graph_obj);
      ////////////////////////////////////////////////////////////////////////


      // Definição No4
      Node no4 = new Node( Constants.Node4_value,
                           Constants.Node4,
                           Constants.Node4Priority_value,
                           Constants.Node4Consumption_value,
                           Constants.Node4Generator_value,
                           Constants.Node4Generation_value);
      LoadConsumptions(no4 , Constants.ConsumosNode4);
      AddVertex2Graph (no4 , Constants.Node4_value , graph_obj);
      ////////////////////////////////////////////////////////////////////////


      // Definição No5
      Node no5 = new Node( Constants.Node5_value,
                           Constants.Node5,
                           Constants.Node5Priority_value,
                           Constants.Node5Consumption_value,
                           Constants.Node5Generator_value,
                           Constants.Node5Generation_value);
      LoadConsumptions(no5 , Constants.ConsumosNode5);
      AddVertex2Graph (no5 , Constants.Node5_value , graph_obj);
      ////////////////////////////////////////////////////////////////////////





      // Definição de Links
      Link l0=new Link(Constants.link0_value, Constants.link0, Constants.link0MaxCapacity_value, Constants.link0Charge_value, Constants.link0CircuitBreaker_value);
      Link l1=new Link(Constants.link1_value, Constants.link1, Constants.link1MaxCapacity_value, Constants.link1Charge_value, Constants.link1CircuitBreaker_value);
      Link l2=new Link(Constants.link2_value, Constants.link2, Constants.link2MaxCapacity_value, Constants.link2Charge_value, Constants.link2CircuitBreaker_value);
      Link l3=new Link(Constants.link3_value, Constants.link3, Constants.link3MaxCapacity_value, Constants.link3Charge_value, Constants.link3CircuitBreaker_value);
      Link l4=new Link(Constants.link4_value, Constants.link4, Constants.link4MaxCapacity_value, Constants.link4Charge_value, Constants.link4CircuitBreaker_value);
      Link l5=new Link(Constants.link5_value, Constants.link5, Constants.link5MaxCapacity_value, Constants.link5Charge_value, Constants.link5CircuitBreaker_value);
      Link l6=new Link(Constants.link6_value, Constants.link6, Constants.link6MaxCapacity_value, Constants.link6Charge_value, Constants.link6CircuitBreaker_value);
      Link l7=new Link(Constants.link7_value, Constants.link7, Constants.link7MaxCapacity_value, Constants.link7Charge_value, Constants.link7CircuitBreaker_value);
      Link l8=new Link(Constants.link8_value, Constants.link8, Constants.link8MaxCapacity_value, Constants.link8Charge_value, Constants.link8CircuitBreaker_value);
      Link l9=new Link(Constants.link9_value, Constants.link9, Constants.link9MaxCapacity_value, Constants.link9Charge_value, Constants.link9CircuitBreaker_value);

      Link l10=new Link(Constants.link10_value, Constants.link10, Constants.link10MaxCapacity_value, Constants.link10Charge_value, Constants.link10CircuitBreaker_value);
      Link l11=new Link(Constants.link11_value, Constants.link11, Constants.link11MaxCapacity_value, Constants.link11Charge_value, Constants.link11CircuitBreaker_value);
      Link l12=new Link(Constants.link12_value, Constants.link12, Constants.link12MaxCapacity_value, Constants.link12Charge_value, Constants.link12CircuitBreaker_value);
      Link l13=new Link(Constants.link13_value, Constants.link13, Constants.link13MaxCapacity_value, Constants.link13Charge_value, Constants.link13CircuitBreaker_value);
      Link l14=new Link(Constants.link14_value, Constants.link14, Constants.link14MaxCapacity_value, Constants.link14Charge_value, Constants.link14CircuitBreaker_value);

      AddEdge2Graph(0, 3, l0, graph_obj);
      AddEdge2Graph(0, 4, l1, graph_obj);
      AddEdge2Graph(0, 5, l2, graph_obj);
      AddEdge2Graph(0, 6, l3, graph_obj);
      AddEdge2Graph(0, 7, l4, graph_obj);

      AddEdge2Graph(1, 3, l5, graph_obj);
      AddEdge2Graph(1, 4, l6, graph_obj);
      AddEdge2Graph(1, 5, l7, graph_obj);
      AddEdge2Graph(1, 6, l8, graph_obj);
      AddEdge2Graph(1, 7, l9, graph_obj);

      AddEdge2Graph(2, 3, l10, graph_obj);
      AddEdge2Graph(2, 4, l11, graph_obj);
      AddEdge2Graph(2, 5, l12, graph_obj);
      AddEdge2Graph(2, 6, l13, graph_obj);
      AddEdge2Graph(2, 7, l14, graph_obj);


      ////////////////////  Debug
//      System.out.println("Conteudo Grafo: " + graph_obj.toString());
  //    WriteFile.Writeln("Conteudo Grafo: " + graph_obj.toString(),Constants.pathOutputFile,Constants.OutputFile);

    return (graph_obj);
  }


  ////////////////////////////////////////////
  //  Acrescentar um link ao grafo
  ////////////////////////////////////////////
  public void AddEdge2Graph(int no_origem, int no_destino, Link i_link, Graph graph_destination)
  {
       Edge ed45;
       try
       {
            ed45 = new Edge ( graph_destination.indexVertex( no_origem ) , graph_destination.indexVertex( no_destino) );
            ed45.systemdict.def(Edge.strKeyName,i_link.GetName());
            ed45.userdict.def(Constants.userdict_Link,i_link);
            graph_destination.add( ed45 );
        }
        catch (VertexMissingException e2 ) { /* should not happen */ }
  }


  ////////////////////////////////////////////
  //  Acrescentar um no ao grafo
  ////////////////////////////////////////////
  public void AddVertex2Graph(Node no_node, String no_string, Graph graph_destination)
  {
        Vertex vertex;
        vertex = new Vertex();
        vertex.systemdict.def( Vertex.strKeyName , no_string);
        vertex.userdict.def(Constants.userdict_Node, no_node);
        graph_destination.add( vertex );
  }


  ////////////////////////////////////////////
  //  Carrega os valores de consumo de um no
  ////////////////////////////////////////////
  public void LoadConsumptions(Node no, String noID)
  {
      //System.out.println("A carregar tabela de consumos para o No: " + noID);
      //WriteFile.Writeln("A carregar tabela de consumos para o No: " + noID,Constants.pathOutputFile,Constants.OutputFile);
      BufferedReader no_in = OpenFile (noID);
      String Consumo_dia = ReadFile(noID, no_in);
      while (Consumo_dia != null)
      {
        no.AddConsumptionList(Consumo_dia);
        Consumo_dia = ReadFile(noID, no_in);
      }
      CloseFile (noID, no_in);
//     WriteFile.Writeln("Num. elementos:" + no.GetConsumptionArrayList().size(),Constants.pathOutputFile,Constants.OutputFile);
  }



  ////////////////////////////////////////////
  //  Operação genérica de abertura de um ficheiro
  ////////////////////////////////////////////
  public BufferedReader OpenFile(String ficheiro)
  {
    BufferedReader in;

    ficheiro = Constants.PathConsumos + ficheiro;

    try
    {
        in = new BufferedReader (new FileReader(ficheiro));
        return (in);
    }
    catch (FileNotFoundException exc)
    {
       System.out.println("File Not found: "+ficheiro);
       WriteFile.Writeln("File Not found: "+ficheiro,Constants.pathOutputFile,Constants.OutputFile);
    }
    return (null);
  }



  ////////////////////////////////////////////
  //  Operação para leitura de um linha num ficheiro
  ////////////////////////////////////////////
  public String ReadFile(String ficheiro, BufferedReader in)
  {
    try
    {
       String line;
       line = in.readLine();
       if (line==null) return(null);
       else return (line);
    }
    catch (Exception exc)
    {
       System.out.println("Reading File: " + ficheiro + " invalid.\n" + exc);
       WriteFile.Writeln("Reading File: " + ficheiro + " invalid.\n" + exc,Constants.pathOutputFile,Constants.OutputFile);
    }
    return (null);
  }


  ////////////////////////////////////////////
  //  Operação para fechar um ficheiro
  ////////////////////////////////////////////
  public void CloseFile(String ficheiro, BufferedReader in)
  {
        try
        {
          in.close();
        }
        catch (IOException exc)
        {
         System.out.println("Error closing pointers to files: "+exc);
         WriteFile.Writeln("Error closing pointers to files: "+exc,Constants.pathOutputFile,Constants.OutputFile);
        }
  }


  ////////////////////////////////////////////
  //  Criação de PPMData para criação de ActualEnvironment
  ////////////////////////////////////////////
    public ActualEnvironment CreateActualEnvironment()
    {
     WriteFile.Writeln("Invocação CreateActualEnvironment",Constants.pathOutputFile,Constants.OutputFile);


      ActualEnvironment m_actual_state = new ActualEnvironment();
      Vertex vertex_tmp;
      Edge 	edge_tmp;
      PPMData variavel_tmp;
      Node node_tmp;
      Link link_tmp;
      String node_Name;
      String link_Name;

      // Actualiza consumos
      CalculateNodeConsumption();

      // devolve nos
      //////////////////////////////////////
      for ( Enumeration vertices = graph.enumerateVertices() ; vertices.hasMoreElements() ; )
      {
        vertex_tmp = (Vertex)vertices.nextElement();
        try
        {
          node_tmp = (Node) vertex_tmp.userdict.get( Constants.userdict_Node );
          node_Name = vertex_tmp.systemdict.getString(Vertex.strKeyName);

          // Identificacao do No
          variavel_tmp = new PPMData( null, node_tmp.GetNameID(), node_tmp.GetName(), null);
          m_actual_state.AddVariable(variavel_tmp);
          // Prioridade do No
          variavel_tmp = new PPMData( null, node_tmp.GetNameID()+"Priority", node_tmp.GetPriority_S(), null);
          m_actual_state.AddVariable(variavel_tmp);
          // Consumption do No
          variavel_tmp = new PPMData( null, node_tmp.GetNameID()+"Consumption", node_tmp.GetConsumptionNode_S(), null);
          m_actual_state.AddVariable(variavel_tmp);
          // Generator do No
          variavel_tmp = new PPMData( null, node_tmp.GetNameID()+"Generator", node_tmp.GetGeneratorNode_S(), null);
          m_actual_state.AddVariable(variavel_tmp);
          // Generation do No
          variavel_tmp = new PPMData( null, node_tmp.GetNameID()+"Generation", node_tmp.GetGeneratorValue_S(), null);
          m_actual_state.AddVariable(variavel_tmp);
          // Need do No
          variavel_tmp = new PPMData( null, node_tmp.GetNameID()+"PowerNeed", node_tmp.GetConsumptionList_S(Time), null);
          m_actual_state.AddVariable(variavel_tmp);
        }

        catch ( KeyMissingException e )
        {
           System.out.println("Error with keys of user/system dict. Node"+e);
           WriteFile.Writeln("Error with keys of user/system dict. Node"+e,Constants.pathOutputFile,Constants.OutputFile);
        }
      }

      // devolve links
      /////////////////////////////////////////////////////
      for ( Enumeration edges = graph.enumerateEdges() ; edges.hasMoreElements() ; )
      {
        edge_tmp = (Edge)edges.nextElement();
        try
        {
          link_tmp = (Link) edge_tmp.userdict.get( Constants.userdict_Link );
          link_Name = edge_tmp.systemdict.getString(Edge.strKeyName);
          // Identificacao do Link
          variavel_tmp = new PPMData( null, link_tmp.GetNameID(), link_tmp.GetName(), null);
          m_actual_state.AddVariable(variavel_tmp);
          // Identificacao da Capacidade Maxima
          variavel_tmp = new PPMData( null, link_tmp.GetNameID()+"MaxCapacity", link_tmp.GetMaximumCapacity_S(), null);
          m_actual_state.AddVariable(variavel_tmp);
          // Identificacao da Capacidade Actual (terá de ser calculada com base na topologia de rede - actualmente fica com um valor fixo que não é olhado)
          variavel_tmp = new PPMData( null, link_tmp.GetNameID()+"Charge", link_tmp.GetCapacity_S(), null);
          m_actual_state.AddVariable(variavel_tmp);
          // Identificacao do estado do circuit breaker
          variavel_tmp = new PPMData( null, link_tmp.GetNameID()+"CircuitBreaker", link_tmp.GetCircuitBreaker_S(), null);
          m_actual_state.AddVariable(variavel_tmp);
        }
        catch ( KeyMissingException e )
        {
           System.out.println("Error with keys of user/system dict. Link"+e);
           WriteFile.Writeln("Error with keys of user/system dict. Link"+e,Constants.pathOutputFile,Constants.OutputFile);
        }
      }

      // devolve tempo
      ///////////////////////////////////////////////////////
      variavel_tmp = new PPMData( null, "Time", String.valueOf(Time), null);
      m_actual_state.AddVariable(variavel_tmp);

      return (m_actual_state);
    }





  ////////////////////////////////////////////
  //  Faz a actualização dos disjuntores baseado nas ordens recebidas
  ////////////////////////////////////////////
    public void Set_CircuitBreaker(String Name, int Index, boolean StateREL, boolean StateABS)
    {
      Edge edge_tmp;
      Link link_tmp;
      String link_Name;

      for ( Enumeration edges = graph.enumerateEdges() ; edges.hasMoreElements() ; )
      {
        edge_tmp = (Edge)edges.nextElement();
        link_tmp = (Link) edge_tmp.userdict.get( Constants.userdict_Link );

        if (Name.compareTo(link_tmp.GetNameID()) == 0)
        {
          // Lógica própria do fecho/abertura das ordens
          if( StateREL == false)
          {
            link_tmp.SetCircuitBreaker(StateABS);
          }
          else
          {
             if (link_tmp.GetCircuitBreaker() == true) link_tmp.SetCircuitBreaker(false);
             else link_tmp.SetCircuitBreaker(true);
          }
          edge_tmp.userdict.def(Constants.userdict_Link,link_tmp);
        }

      }
    }

 ////////////////////////////////////////////
  //  Faz a actualização dos disjuntores baseado nas ordens recebidas
  ////////////////////////////////////////////
    public void Set_CircuitBreaker(String Name, int Index, boolean StateREL, boolean StateABS,String link2)
    {
      Edge edge_tmp;
      Link link_tmp,link_tmp2;
      String link_Name;

      boolean Abrelink2 = false;

      for ( Enumeration edges = graph.enumerateEdges() ; edges.hasMoreElements() ; )
      {
        edge_tmp = (Edge)edges.nextElement();
        link_tmp = (Link) edge_tmp.userdict.get( Constants.userdict_Link );

        if (Name.compareTo(link_tmp.GetNameID()) == 0)
        {
          // Lógica própria do fecho/abertura das ordens
          if( StateREL == false)
          {
            if (link_tmp.GetCircuitBreaker() == false )
            {
                  link_tmp.SetCircuitBreaker(true);
                  Abrelink2 = true;
            }
          }
          else
          {
             if (link_tmp.GetCircuitBreaker() == true)
              link_tmp.SetCircuitBreaker(false);
                 else link_tmp.SetCircuitBreaker(true);
          }
          edge_tmp.userdict.def(Constants.userdict_Link,link_tmp);
        }

      }


      if (Abrelink2)
      {
        for ( Enumeration edges = graph.enumerateEdges() ; edges.hasMoreElements() ; )
        {
           edge_tmp = (Edge)edges.nextElement();
          link_tmp = (Link) edge_tmp.userdict.get( Constants.userdict_Link );

          if (link2.compareTo(link_tmp.GetNameID()) == 0)
          {
                   link_tmp.SetCircuitBreaker(false);
           }

        edge_tmp.userdict.def(Constants.userdict_Link,link_tmp);
       }
      }


    }

  ////////////////////////////////////////////
  //  Reflecte os estado dos disjuntores num grafo a parte
  ////////////////////////////////////////////
    public Graph Set_CircuitBreaker(Graph graph_aux)
    {
      Edge edge_tmp, edge_tmp2;
      Link link_tmp, link_tmp2;

      for ( Enumeration edges = graph.enumerateEdges() ; edges.hasMoreElements() ; )
      {
        edge_tmp = (Edge)edges.nextElement();
        link_tmp = (Link) edge_tmp.userdict.get( Constants.userdict_Link );

        for ( Enumeration edges2 = graph_aux.enumerateEdges() ; edges2.hasMoreElements() ; )
        {
            edge_tmp2 = (Edge)edges2.nextElement();
            link_tmp2 = (Link) edge_tmp2.userdict.get( Constants.userdict_Link );

            if (link_tmp2.GetNameID().compareTo(link_tmp.GetNameID()) == 0)
            {
                WriteFile.Writeln("link igual!!!   :"+link_tmp2,Constants.pathOutputFile,Constants.OutputFile);
                link_tmp2.SetCircuitBreaker(link_tmp.GetCircuitBreaker());
                WriteFile.Writeln("link igual!!!   :"+link_tmp2,Constants.pathOutputFile,Constants.OutputFile);
                edge_tmp2.userdict.def( Constants.userdict_Link, link_tmp2);
            }
        }


      }
      return (graph_aux);
    }


    ///////////////////////////////////////////
    //  Copia um Grafo para outro
    ////////////////////////////////////////////
    Graph CopyGraph(Graph graph_source)
    {
      Graph graph_destination = new Graph();
      graph_destination = LoadGrafo(graph_destination);
      return (graph_destination);
    }




  ////////////////////////////////////////////
  //  Calcula os consumos em cada nó
  ////////////////////////////////////////////
    void CalculateNodeConsumption()
    {
      Graph graph_tmp = CopyGraph(graph);



//      WriteFile.Writeln("Graph Clone:"+graph_tmp,Constants.pathOutputFile,Constants.OutputFile);
//      WriteFile.Writeln("Graph Original:"+graph,Constants.pathOutputFile,Constants.OutputFile);

    // Remocao dos links em aberto para o grafo clonado
      Edge ligacao_no,ligacao_no2;
      Link link_ligacao_no,link_ligacao_no2;

      for ( Enumeration h = graph.enumerateEdges(); h.hasMoreElements() ; )
      {
          ligacao_no = (Edge) h.nextElement();
          link_ligacao_no = (Link) ligacao_no.userdict.get( Constants.userdict_Link );
//           WriteFile.Writeln(graph_tmp.getEnumerationSize()+" link_ligacao_no:"+link_ligacao_no,Constants.pathOutputFile,Constants.OutputFile);
           if (link_ligacao_no.GetCircuitBreaker() == true)
           {
              for (Enumeration j=graph_tmp.enumerateEdges(); j.hasMoreElements();)
              {
                    ligacao_no2 = (Edge) j.nextElement();
                    link_ligacao_no2 = (Link) ligacao_no2.userdict.get( Constants.userdict_Link );
                    if (link_ligacao_no2.GetNameID().compareTo(link_ligacao_no.GetNameID()) == 0) graph_tmp.remove(ligacao_no2);
              }
           }
      }


//      WriteFile.Writeln("Graph Clone:"+graph_tmp,Constants.pathOutputFile,Constants.OutputFile);
  //    WriteFile.Writeln("Graph Clone SystemDict:"+graph_tmp.systemdict.elements().toString(),Constants.pathOutputFile,Constants.OutputFile);

    //  WriteFile.Writeln("Graph Original:"+graph,Constants.pathOutputFile,Constants.OutputFile);


      //  Verifica se existe caminho entre os consumidores e os geradores
      Vertex vertex_tmp = null, vertex_tmp_Ger = null;
      Node Node_vertex_tmp = null, Node_vertex_tmp_Ger = null;
      for ( Enumeration vertices = graph_tmp.enumerateVertices() ; vertices.hasMoreElements() ; )
      {
        vertex_tmp = (Vertex)vertices.nextElement();
        Node_vertex_tmp = (Node) vertex_tmp.userdict.get( Constants.userdict_Node );

        if (Node_vertex_tmp.GetConsumptionNode())
        {
           boolean tem_caminho = false;

           for (Enumeration vertices_Ger = graph_tmp.enumerateVertices();vertices_Ger.hasMoreElements();)
           {
              vertex_tmp_Ger = (Vertex)vertices_Ger.nextElement();
              Node_vertex_tmp_Ger = (Node) vertex_tmp_Ger.userdict.get( Constants.userdict_Node );
              if (Node_vertex_tmp_Ger.GetGeneratorNode())
              {
                 if (graph_tmp.existsPath(vertex_tmp,vertex_tmp_Ger))
                 {
                    if (tem_caminho == true) WriteFile.Writeln("!!!!O No:" + Node_vertex_tmp+" tem mais de 1 gerador ligado!!!",Constants.pathOutputFile,Constants.OutputFile);
                    tem_caminho = true;
                 }
              }
           }

           if (tem_caminho == false)
           {
              // Faz o update à topologia de consumos da rede
                for (Enumeration xpto = graph.enumerateVertices(); xpto.hasMoreElements(); )
                {
                     Vertex  vertex_xpto = (Vertex) xpto.nextElement();
                     Node node_xpto = (Node) vertex_xpto.userdict.get( Constants.userdict_Node );
                     if (Node_vertex_tmp.GetNameID().compareTo(node_xpto.GetNameID()) == 0)
                     {
                        WriteFile.Writeln("Fechei o consumo ao No: "+node_xpto,Constants.pathOutputFile,Constants.OutputFile);
                        node_xpto.UpdateConsumptionList(Time, 0.0);
                        vertex_xpto.userdict.def(Constants.userdict_Node,node_xpto);
                     }
                }
              //  WriteFile.Writeln("FIz update ao consumo do No:" + Node_vertex_tmp,Constants.pathOutputFile,Constants.OutputFile);
           }
        }
      }

      graph_tmp.clear();
    }


}

