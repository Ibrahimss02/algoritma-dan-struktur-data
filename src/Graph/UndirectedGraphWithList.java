package Graph;

import java.util.LinkedList;
import java.util.Scanner;

class UndirectedListGraph {
    LinkedList<Integer>[] conn;
    int vertex;

    UndirectedListGraph(int vertex){
        conn = new LinkedList[vertex];
        this.vertex = vertex;

        for (int i = 0; i < conn.length; i++) {
            conn[i] = new LinkedList<>();
        }
    }

    void printConn(){
        for (int i = 0; i < conn.length; i++) {
            if (!conn[i].isEmpty()) {
                System.out.println(i + " Connected to");
                for (int j = 0; j < conn[i].size(); j++) {
                    System.out.println(" - " + conn[i].get(j));
                }
            }
        }
    }
    void addVertex(int source,int destination){
        if (!conn[source].contains(destination)) {
            conn[source].add(destination);
        }
        if (!conn[destination].contains(source)) {
            conn[destination].add(source);
        }
    }

}

public class UndirectedGraphWithList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nVertex = scan.nextInt();
        UndirectedListGraph undirectedListGraph = new UndirectedListGraph(nVertex);

        for(int i = 0; i < nVertex; i++) {
            int source = scan.nextInt();
            int destination = scan.nextInt();
            undirectedListGraph.addVertex(source, destination);
        }

        undirectedListGraph.printConn();
    }
}
