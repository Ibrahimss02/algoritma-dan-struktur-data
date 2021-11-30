package Graph.Implementation;

public class Main {
    public static void main(String[] args) {
        GraphMatrix graph1 = new GraphMatrix(5);
        graph1.addVertex("1");//0
        graph1.addVertex("2");//1
        graph1.addVertex("3");//2
        graph1.addVertex("4");//3
        graph1.addVertex("5");//4

        graph1.addEdge(0, 1);
        graph1.addEdge(0, 3);
        graph1.addEdge(1, 4);
        graph1.addEdge(3, 4);
        graph1.addEdge(2, 4);

        System.out.println("Graph 1");
        System.out.println("=======");
        graph1.displayGraphs();
        System.out.println("\nBFS Graph 1");
        graph1.bfs();
        System.out.println("\nDFS Graph 2");
        graph1.dfs();


        System.out.println("\n\n");


        GraphMatrix graph = new GraphMatrix(9);

        graph.addVertex("A"); //0
        graph.addVertex("B"); //1
        graph.addVertex("C"); //2
        graph.addVertex("D"); //3
        graph.addVertex("E"); //4
        graph.addVertex("F"); //5
        graph.addVertex("G"); //6
        graph.addVertex("H"); //7
        graph.addVertex("I"); //8

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(1, 5);
        graph.addEdge(5, 7);
        graph.addEdge(3, 6);
        graph.addEdge(6, 8);

        System.out.println("Graph 2");
        System.out.println("=======");
        graph.displayGraphs();
        System.out.println("\nBFS Graph 2");
        graph.bfs();
        System.out.println("\nDFS Graph 2");
        graph.dfs();

    }
}
