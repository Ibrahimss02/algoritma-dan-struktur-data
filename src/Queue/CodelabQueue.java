package Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Siswa implements Comparable<Siswa>{
    String nama;
    int nilai;

    Siswa(String nama, int nilai){
        this.nama = nama;
        this.nilai = nilai;
    }

    @Override
    public int compareTo(Siswa o) {
        if (this.nilai > o.nilai) return -1;
        else if (this.nilai < o.nilai) return 1;
        return 0;
    }

    @Override
    public String toString() {
        return this.nama + " = " + this.nilai;
    }
}

public class CodelabQueue {
    public static void main(String[] args) {
        Queue<Siswa> siswaQueue = new PriorityQueue<>();

        siswaQueue.add(new Siswa("Glen", 20));
        siswaQueue.add(new Siswa("Petma", 80));
        siswaQueue.add(new Siswa("Naruto", 40));
        siswaQueue.add(new Siswa("Kambing", 100));
        siswaQueue.add(new Siswa("Kurama", 60));

        while(siswaQueue.size() != 0){
            System.out.println(siswaQueue.poll().toString());
        }
    }
}
