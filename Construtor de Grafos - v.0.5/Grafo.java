import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
 
public class Grafo {
 
  private List<Aresta> arestas;
  private Set<Vertex> vertices;
  
  public Grafo() {
    arestas = new ArrayList<>();
    vertices = new TreeSet<>();
  }

  public void addAresta(Aresta aresta){
    getArestas().add(aresta);
  }
   
  public void addVertice(Vertex v){
    getVertices().add(v);
  }
 
  public List<Aresta> getArestas() {
    return arestas;
  }
 
  public Set<Vertex> getVertices() {
    return vertices;
  }
   
  public static void printGrafo(Grafo g){
    System.out.println("Vertices...");
    for (Vertex v : g.getVertices()) {
      System.out.print(v.getLabel() + " ");
    }
    System.out.println("");
    System.out.println("Arestas...");
    for (Aresta e : g.getArestas()) {
      System.out.println(e);
    } 
    
    System.out.println("----------------");
  }
}