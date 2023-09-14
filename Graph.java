import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Graph {
 
  private List<Edge> edges;
  private Set<Vertex> vertices;
 
  public Graph() {
    edges = new ArrayList<>();
    vertices = new TreeSet<>();
  }
  public void addEdge(Edge edge){
    getEdges().add(edge);
    getVertices().add(edge.getFromVertex());
    getVertices().add(edge.getToVertex());
  }
   
  public void addVertice(Vertex v){
    getVertices().add(v);
  }
 
  public List<Edge> getEdges() {
    return edges;
  }
 
  public Set<Vertex> getVertices() {
    return vertices;
  }
   
  public static void printGraph(Graph g){
    System.out.println("\n\nVértices do GRAFO: \n");
    for (Vertex v : g.getVertices()) {
      System.out.print(v.getLabel() + " ");
    }
    
    System.out.println("\n\nArestas do GRAFO: \n");
    for (Edge e : g.getEdges()) {
      System.out.println("{ " + e + " }");
    }
    System.out.println("\n\n");
  }
 
}
 