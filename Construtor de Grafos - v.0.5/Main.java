/* 
Trabalho de Compiladores
Criação do DSL - Desenvolvimento de Grafos 0.5
*/
// Grupo:
// João Miguel Descendente
// Caio Meireles Vieira
// Lucas Passos de Siqueira
// Daniel Machado Santos Diaz 
// Henrique Miranda Queiroz

public class Main {
 
  public static void main(String[] args) {
 
    GrafoBuilder.Grafo()
      .aresta()
        .from("a")
        .to("b")
        .weight(40.0)
      .aresta()
        .from("b")
        .to("c")
        .weight(20.0)
      .aresta()
        .from("d")
        .to("e")
        .weight(50.5)
      .printGrafo();
 
    GrafoBuilder.Grafo()
      .aresta()
        .from("w")
        .to("y")
        .weight(23.0)
      .aresta()
        .from("d")
        .to("e")
        .weight(34.5)
      .aresta()
        .from("e")
        .to("y")
        .weight(50.5)
      .printGrafo();
 
  }
}

