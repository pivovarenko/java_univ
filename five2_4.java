/**
 * Півоваренко, компмех, завдання 2.4, лаба 5
 * @author pivovarenko
 */
import java.util.ArrayList;
import java.util.List;
class Graph {
    private int vertices;
    private List<List<Integer>> adjacentVertices;
    public Graph(int vertices) {
        this.vertices = vertices;
        initializeGraph();
    }
    private void initializeGraph() {
        adjacentVertices = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjacentVertices.add(new ArrayList<>());
        }
    }
    public void addEdge(int vertex1, int vertex2) {
        adjacentVertices.get(vertex1).add(vertex2);
        adjacentVertices.get(vertex2).add(vertex1);
    }
    public void removeEdge(int vertex1, int vertex2) {
        adjacentVertices.get(vertex1).remove(Integer.valueOf(vertex2));
        adjacentVertices.get(vertex2).remove(Integer.valueOf(vertex1));
    }
    public void printGraph() {
        for (int vertex = 0; vertex < vertices; vertex++) {
            System.out.print("Vertex " + vertex + ": ");
            for (Integer adjacentVertex : adjacentVertices.get(vertex)) {
                System.out.print(adjacentVertex + " ");
            }
            System.out.println();
        }
    }
}
public class five2_4
 {
    public static void main(String[] args) {
        // example 
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        System.out.println("Initial graph:");
        graph.printGraph();
        graph.removeEdge(0, 1);
        System.out.println("\nGraph after removing an edge:");
        graph.printGraph();
    }
}

