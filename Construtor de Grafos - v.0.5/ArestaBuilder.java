public class ArestaBuilder {
   
  Aresta aresta;
  GrafoBuilder gBuilder;
   
  public ArestaBuilder(GrafoBuilder gBuilder) {
    this.gBuilder = gBuilder;
    aresta = new Aresta();
  }
   
  public ArestaBuilder from(String lbl){
    Vertex v = new Vertex(lbl);
    aresta.setFromVertex(v);
    gBuilder.getGrafo().addVertice(v);
    return this;
  }
  public ArestaBuilder to(String lbl){
    Vertex v = new Vertex(lbl);
    aresta.setToVertex(v);
    gBuilder.getGrafo().addVertice(v);
    return this;
  }
   
  public GrafoBuilder weight(Double d){
    aresta.setWeight(d);
    return gBuilder;
  }
   
}