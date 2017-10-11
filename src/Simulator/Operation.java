
//Title:        Plataforma Simulacao
//Version:
//Copyright:    Copyright (c) 1999
//Author:       Sergio Guerreiro
//Company:      IST, MEIC 2002
//Description:  Your description
package Simulator;
import SimulatorPlatform.*;
import java.lang.*;
import java.util.*;
import java.io.*;

public class Operation {

private String m_Operation;

  public Operation() {
   m_Operation = new String("");
  }

  public Operation(String tmp)
  {
   m_Operation = tmp;
  }

  public String GetClasse()
  {
      if (And() || Or() || Xor() || Not()) return(Constants.ClasseA);
      else if (less() || greater() || equals() || less_equal() || greater_equal() || not_equal()) return(Constants.ClasseB);
      else return (Constants.ClasseC);
  }

  public String GetOperation()  {return (m_Operation);};

  // Operações nível A
  public boolean And() { return (m_Operation.compareTo(Constants.Operation_AND) == 0); };
  public boolean Or()  { return (m_Operation.compareTo(Constants.Operation_OR) == 0); }
  public boolean Xor() { return (m_Operation.compareTo(Constants.Operation_XOR) == 0);}
  public boolean Not() { return (m_Operation.compareTo(Constants.Operation_NOT) == 0);}
  public boolean Abstract_A() {return (m_Operation.compareTo(Constants.Operation_ABSTRACT_A) == 0);}

  // Operações nível B
  public boolean  less() { return (m_Operation.compareTo(Constants.Operation_LESS)== 0); };
  public boolean  greater() { return (m_Operation.compareTo(Constants.Operation_GREATER)== 0); };
  public boolean  equals() { return (m_Operation.compareTo(Constants.Operation_EQUAL)== 0); };
  public boolean  less_equal() { return (m_Operation.compareTo(Constants.Operation_LESS_EQUAL)== 0); };
  public boolean  greater_equal() { return (m_Operation.compareTo(Constants.Operation_GREATER_EQUAL)== 0); };
  public boolean  not_equal() {return (m_Operation.compareTo(Constants.Operation_NOT_EQUAL)== 0); };
  public boolean  Abstract_B() {return (m_Operation.compareTo(Constants.Operation_ABSTRACT_B) == 0);}

  // Operações nível C
  public boolean plus()  { return (m_Operation.compareTo(Constants.Operation_PLUS)== 0);};
  public boolean minus()  { return (m_Operation.compareTo(Constants.Operation_MINUS)== 0);};
  public boolean div()  { return (m_Operation.compareTo(Constants.Operation_DIV)== 0);};
  public boolean mul()  { return (m_Operation.compareTo(Constants.Operation_MUL)== 0);};
  public boolean mod()  { return (m_Operation.compareTo(Constants.Operation_MOD)== 0);};
  public boolean abs()  { return (m_Operation.compareTo(Constants.Operation_ABS)== 0);};
  public boolean sqrt()  { return (m_Operation.compareTo(Constants.Operation_SQRT)== 0);};
  public boolean sqr()  { return (m_Operation.compareTo(Constants.Operation_SQR)== 0);};
  public boolean Abstract_C() {return (m_Operation.compareTo(Constants.Operation_ABSTRACT_C) == 0);}


  public double calculate_C (double x, double y)
  {
    if (plus()) return (x + y);
    else if (minus()) return (x - y);
    else if (div()) return (x / y); // verificar excepção de y=0
    else if (mul()) return (x * y);
    else if (mod()) return (x % y);
    else if (abs()) return (java.lang.Math.abs(x));
    else if (sqrt()) return (java.lang.Math.sqrt(x));
    else if (sqr()) return (java.lang.Math.pow(x,y));
    else if (Abstract_C())
        {
          if ( y == 1) return (x);
          else return (0);

        }
    else return (-1);
  }



  public boolean calculate_B(double x, double y)
  {
      if (less())
      {
          if (x < y) return (true);
          else return (false);
      }
      else if (greater())
      {
          if (x > y) return (true);
          else return (false);
      }
      else if (equals())
      {
          if (x == y) return (true);
          else return (false);
      }
      else if (less_equal())
      {
          if (x <= y) return (true);
          else return (false);
      }
      else if (greater_equal())
      {
          if (x >= y) return (true);
          else return (false);
      }
      else if (not_equal())
      {
          if (x != y) return (true);
          else return (false);
      }
      else if (Abstract_B())
      {
          if ((x > y) | (y < x)) return (true);
          else return (false);
      }
      else return (false); // nenhuma das anteriores
  }




  public boolean calculate_A(boolean x, boolean y)
  {
      if (And())  return (x && y);
      else if (Or())  return (x || y);
      else if (Not())  return (!x);
      else if (Xor())  return (x ^ y);
      else if (Abstract_A()) return ((x&&y) | (y||x));
      else return (false); // nenhuma das anteriores
  }

}