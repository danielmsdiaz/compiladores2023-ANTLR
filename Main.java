import java.io.*;
import graph.*;
import org.antlr.v4.runtime.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    //
    InputStream is = 
            ClassLoader.getSystemResourceAsStream("input.graph");
     
    //
    CharStream cs = new ANTLRInputStream(is);
     
    //
    GraphLexer lexer = new GraphLexer(cs);
     
    CommonTokenStream tokens = new CommonTokenStream(lexer);
     
    // 
    GraphParser parser = new GraphParser(tokens);
     
    //
    Graph g = new Graph();
     
    // 
    parser.addParseListener(new MyGraphBaseListener(g));
     
    // 
    parser.graph();
     
    Graph.printGraph(g);
  }
}
 

 //
 
class MyGraphBaseListener extends GraphBaseListener {
 
  Graph g;
 
  public MyGraphBaseListener(Graph g) {
    this.g = g;
  }
  
  @Override
  public void exitEdge(GraphParser.EdgeContext ctx) {
    // 
    //
    //
    Vertex fromVertex = new Vertex(ctx.vertex(0).ID().getText());
    Vertex toVertex = new Vertex(ctx.vertex(1).ID().getText());
    double weight = Double.parseDouble(ctx.NUM().getText());
    Edge e = new Edge(fromVertex, toVertex, weight);
    g.addEdge(e);
  }
}