package Interface;


import javax.swing.*; // For JPanel, etc.
import java.awt.*;           // For Graphics, etc.
import java.awt.geom.*;      // For Ellipse2D, etc.
import java.lang.*;
import java.io.*;
import java.util.*;
import SimulatorPlatform.*;
import RENContext.*;
import com.ibm.graph.Drawable;
import com.ibm.graph.Edge;
import com.ibm.graph.Graph;
import com.ibm.graph.NotDrawableException;
import com.ibm.graph.Vertex;
import com.ibm.graph.VertexMissingException;
import com.ibm.graph.draw.*;
import com.ibm.graph.draw.DrawEdgeLineKeyVisible;
import com.ibm.graph.layout.*;
import com.ibm.graph.awt.*;
import com.ibm.research.util.Dict;
import com.ibm.research.util.KeyMissingException;


/**
 * Title:        Plataforma de simulaçao genérica
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      MEIC, 2002
 * @author Sérgio Guerreiro
 * @version 1.0
 */


//////////////////////////////////////////////////////
//  Classe que desenha o ambiente REN Específico
//////////////////////////////////////////////////////
public class SimulationAnimation extends JPanel{

  private int m_Limite_JanelaX , m_Limite_JanelaY;

  private String time;
  EnvironmentDefinition m_ambiente;


  public SimulationAnimation()
  {
  }

  public void setTime(int time_tmp)
  {
   time = String.valueOf(time_tmp);
  }

  public void SetEnvironment (EnvironmentDefinition ambiente)
  {
    m_ambiente = ambiente;
  }

   protected void drawState(Graphics2D g2d,String state) {
    g2d.setPaint(Color.black);
    g2d.drawString(state, 10, 50 /*m_Limite_JanelaY*/);
  }


  public void paintComponent(Graphics g) {
    clear(g);
     Graphics2D g2d = (Graphics2D)g;

    Vertex  vertex;
    Node    no_draw;
    Draw3VertexRectangleTextArray  vd;

    for ( Enumeration vertices = m_ambiente.Get_Graph().enumerateVertices() ; vertices.hasMoreElements() ; )
    {
        vertex = (Vertex)vertices.nextElement();
        no_draw = (Node) vertex.userdict.get(Constants.userdict_Node);
        String[] info_node = new String[4];
        info_node[0] = no_draw.GetName();
        info_node[1] = "Power Need: " + no_draw.GetConsumptionList_S(m_ambiente.Get_Time());
        info_node[2] = "Priority: " + no_draw.GetPriority_S();
        info_node[3] = "Generation: " + no_draw.GetGeneratorValue_S();
        vd = new Draw3VertexRectangleTextArray( info_node, "Times New Roman" , Font.PLAIN , 12 );
        vd.setAlignmentX( DrawVertex.ALIGNMENT_CENTER );
        vd.setAlignmentY( DrawVertex.ALIGNMENT_CENTER );
        vd.setMargins(1,1,1,1);
        vd.setColorFill(Color.yellow);
        vd.setBorder(Color.gray);
        vertex.setDrawable( vd );

    }
    Edge 	edge;
    DrawEdgeArrowThenText ed;

    Link link_draw;
    for ( Enumeration edges = m_ambiente.Get_Graph().enumerateEdges() ; edges.hasMoreElements() ; )
    {
         ed = new DrawEdgeArrowThenText();
         edge = (Edge)edges.nextElement();
         link_draw = (Link) edge.userdict.get(Constants.userdict_Link);
         if (link_draw.GetCircuitBreaker() == true)
         {
             ed.setColorPath(Color.red);
//             ed.setText("XX/" + link_draw.GetMaximumCapacity_S());
              ed.setVisible (false);

         }
         else
         {
               ed.setVisible(true);
  //           ed.setText("--/" + link_draw.GetMaximumCapacity_S());
         }
         edge.setDrawable( ed );
    }
  //  LayoutGlow97 t1 = new LayoutGlow97( /* new LayoutGlowCostFunction() , 300 , 100 */ ); // pior (sempre a alterar)
  //  LayoutGlow t1 = new LayoutGlow(  new LayoutGlowCostFunction()  ); // reorganiza mas mais estatico

  // LayoutGraphAsTree t1 = new LayoutGraphAsTree() ; // deixa pouco espaço
      LayoutDAG t1=new LayoutDAG(); //deixa pouco espaço mas centra
  //  LayoutGraphHierarchical t1=new LayoutGraphHierarchical(); // deixa mais /espaço

    t1.setSpaceMultipliers(2,2);
    m_ambiente.Get_Graph().setGraphLayoutManager( t1 );
    m_ambiente.Get_Graph().layout();
    Rectangle rectangle;
    try
    {
      rectangle = m_ambiente.Get_Graph().getBounds();
      DrawNet.translate( m_ambiente.Get_Graph() , - rectangle.x , - rectangle.y );
    }
    catch ( NotDrawableException ndexception )
    {
      System.out.println( "Could not find the bounds of the graph. This should not have happened. BUG!" );
    }

    drawState(g2d,"Time = "+time +"[days]");

    GraphCanvas  grfc =   new GraphCanvas ( m_ambiente.Get_Graph() );
    grfc.paint(g);
  }



  // super.paintComponent clears offscreen pixmap,
  // since we're using double buffering by default.

  protected void clear(Graphics g)
  {
    super.paintComponent(g);
  }


}







