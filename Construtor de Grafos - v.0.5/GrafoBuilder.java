public class GrafoBuilder {
     
  private Grafo grafo;
 
  public GrafoBuilder() {
    grafo = new Grafo();
  }
  
  public GrafoBuilder(boolean weighted) {
    grafo = new Grafo();
  }
   
  public static GrafoBuilder Grafo(){
    return new GrafoBuilder();
  }
  
  public static GrafoBuilder Grafo(boolean weighted){
    return new GrafoBuilder(weighted);
  }
   
  public ArestaBuilder aresta(){
    ArestaBuilder builder = new ArestaBuilder(this);
  
    getGrafo().addAresta(builder.aresta);
     
    return builder;
  }
   
  public Grafo getGrafo() {
    return grafo;
  }
  
  public void printGrafo(){
    Grafo.printGrafo(grafo);
  }
}