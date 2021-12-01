package Queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * URL Soal: https://www.hackerrank.com/contests/queue-asd-si-d/challenges/holyfoot
 */

public class HRHolyFoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<Pengunjung> q = new PriorityQueue<Pengunjung>();

        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String nama = scan.next();
            int pesanan = scan.nextInt();
            q.add(new Pengunjung(pesanan, nama));
        }

        while (q.size() != 0) {
            System.out.println(q.poll().toString());
        }
    }
}

class Pengunjung implements Comparable<Pengunjung> {
    int pesanan;
    String nama;

    public Pengunjung(int pesanan, String nama) {
        this.pesanan = pesanan;
        this.nama = nama;
    }

    @Override
    public int compareTo(Pengunjung o) {
        if (this.pesanan > o.pesanan) return -1;
        else if(this.pesanan < o.pesanan) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return this.nama + " dengan pesanan " + this.pesanan;
    }
}
