package DataRepository;
import java.net.*;
import java.util.*;
import java.lang.*;
import java.io.*;

  ////////////////////////////////////////////////////
  //  Classe abstracta que define o conceito de repositório genérico
  ////////////////////////////////////////////////////
public abstract class Repository {
protected BufferedReader in;
protected PrintWriter out;
protected String line;
protected String Ficheiro;


  public Repository() {
  }


  public abstract boolean Write(DataType Info);
  public abstract void startAgain();
  public abstract DataType Read();
  public abstract void close();

} 