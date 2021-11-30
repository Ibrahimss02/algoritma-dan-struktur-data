import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


class Graph{
    private int[] vertexList;
    private int[][] adjMatx;
    private int nVertex;

    Graph(int nVertex){
        this.nVertex = nVertex;
        vertexList = new int[nVertex];
        adjMatx = new int[nVertex][nVertex];


        for(int i = 0; i < nVertex; i++) {
            for(int j = 0; j < nVertex; j++) {
                adjMatx[i][j] = 0;
            }
        }
    }

    void addEdge(int source, int destination){
        adjMatx[source][destination] = 1;
        adjMatx[destination][source] = 1;
    }

    void printConnection(){

    }
    void bfs(int source){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[nVertex];
        q.add(source);

        while(!q.isEmpty()) {
            int temp = q.poll();

            if (!visited[temp]) {
                System.out.print(temp + "->");
                visited[temp] = true;

                for (int i = 0; i < adjMatx[temp].length; i++) {
                    int adjTemp = adjMatx[temp][i];
                    if (adjTemp == 1 && !visited[i]) {
                        q.add(i);
                    }
                }
            }
        }

    }
    void dfs(int source){
        Stack<Integer> s = new Stack<>();
        boolean[] visited = new boolean[nVertex];
        s.push(source);

        while(!s.isEmpty()){
            int temp = s.pop();

            if(!visited[temp]){
                System.out.print(temp + "->");
                visited[temp] = true;

                for(int i = nVertex - 1; i >= 0; i--){
                    if(adjMatx[temp][i] == 1 && !visited[i]){
                        s.push(i);
                    }
                }
            }
        }
    }


}
class Playground2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nEdge = scan.nextInt();
        int nVertex = scan.nextInt();

        Graph graph = new Graph(nVertex);

        for (int i = 0; i < nEdge; i++) {
            int source = scan.nextInt();
            int destination = scan.nextInt();

            graph.addEdge(source, destination);
        }

        int start = scan.nextInt();
        graph.dfs(start);
        System.out.println();
        graph.bfs(start);
    }
}