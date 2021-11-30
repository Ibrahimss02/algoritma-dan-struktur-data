package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class DirectedGraphWithMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nVertex = scan.nextInt();
        DirectedMatrixGraph graph = new DirectedMatrixGraph(10);

        for (int i = 0; i < nVertex; i++) {
            int source = scan.nextInt();
            int destinantion = scan.nextInt();
            graph.addEdge(source, destinantion);
        }

        graph.print();
    }
}

class DirectedMatrixGraph {
    private boolean[][] adjMatrix;
    private int edge;

    public DirectedMatrixGraph(int edge) {
        adjMatrix = new boolean[edge][edge];
        this.edge = edge;
    }

    void addEdge(int source, int destination) {
        adjMatrix[source][destination] = true;
    }

    void print() {
        for (int i = 0; i < edge; i++) {
            ArrayList<Integer> destList = new ArrayList<>();
            for (int j = 0; j < adjMatrix[i].length; j++) {
                if (adjMatrix[i][j]) {
                    destList.add(j);
                }
            }
            if (!destList.isEmpty()) {
                System.out.print(i + " connected with : ");
                for (Integer x : destList) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
    }
}
