package Graph.Implementation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphMatrix {
    private int MAX_VERTEX = 5;
    private final Vertex[] vertexList;
    private final int[][] adjMatx;
    private int nVerts;

    public GraphMatrix(int MAX_VERTEX) {
        this.MAX_VERTEX = MAX_VERTEX;
        vertexList = new Vertex[MAX_VERTEX];
        adjMatx = new int[MAX_VERTEX][MAX_VERTEX];
        nVerts = 0;

        for (int i = 0; i < MAX_VERTEX; i++) {
            for (int j = 0; j < MAX_VERTEX; j++) {
                adjMatx[i][j] = 0;
            }
        }
    }

    public void addVertex(String label) {
        int indexOnList = nVerts++;
        vertexList[indexOnList] = new Vertex(label, indexOnList);
    }

    public void addEdge(int start, int end) {
        adjMatx[start][end] = 1;
        adjMatx[end][start] = 1;
    }

    public void displayVertex(int index) {
        System.out.print(vertexList[index].label + " ");
    }

    public void displayGraphs() {
        System.out.print("  ");
        for (int i = 0; i < MAX_VERTEX; i++) {
            System.out.print(vertexList[i] != null? vertexList[i].label + " " : "- ");
        }
        System.out.println();

        for (int i = 0; i < MAX_VERTEX; i++) {
            System.out.print(vertexList[i] != null? vertexList[i].label + " " : "- ");
            for (int j = 0; j < MAX_VERTEX; j++) {
                System.out.print(adjMatx[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Vertex getAdjUnvisitedVertex(int vertexIndex) {

        for (int i = 0; i < nVerts; i++) {
            if (adjMatx[vertexIndex][i] == 1 && !vertexList[i].wasVisited){
                return vertexList[i];
            }
        }

        return new Vertex(null , -1);
    }

    public void bfs() {
        Queue<Vertex> queue = new LinkedList<>();

        vertexList[0].wasVisited = true;
        displayVertex(0);
        queue.add(vertexList[0]);
        int v2;

        while (!queue.isEmpty()) {
            int v1 = queue.poll().indexOnList;

            while ((v2 = getAdjUnvisitedVertex(v1).indexOnList) != -1) {
                vertexList[v2].wasVisited = true;
                displayVertex(v2);
                queue.add(vertexList[v2]);
            }
        }

        for (int i = 0; i < nVerts; i++) {
            vertexList[i].wasVisited = false;
        }
    }

    void dfs() {
        Stack<Vertex> stack = new Stack<>();
        vertexList[0].wasVisited = true;
        displayVertex(0);
        stack.push(vertexList[0]);
        while (!stack.isEmpty()) {
            Vertex v = getAdjUnvisitedVertex(stack.peek().indexOnList);
            if (v.indexOnList == -1) {
                stack.pop();
            } else {
                vertexList[v.indexOnList].wasVisited = true;
                displayVertex(v.indexOnList);
                stack.push(v);
            }
        }

        for (int i = 0; i < nVerts; i++) {
            vertexList[i].wasVisited = false;
        }

    }
}
