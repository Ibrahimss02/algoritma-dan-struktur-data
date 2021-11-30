package Graph.Implementation;

/*
 * Atribut indexOnList ditambahkan untuk
 * mengetahui posisi vertex di dalam list.
 */
public class Vertex {
    String label;
    boolean wasVisited = false;
    int indexOnList;

    Vertex(String label, int indexOnList) {
        this.label = label;
        this.indexOnList = indexOnList;
    }
}
