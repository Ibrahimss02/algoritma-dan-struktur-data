package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * URL Soal: https://www.hackerrank.com/contests/queue-asd-si-d/challenges/dokter-yang-moody
 */

public class HRDokterYangMoody {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<String> q = new LinkedList<>();
        Queue<String> s = new LinkedList<>();

        for(int i = 0; i < 13; i++){
            q.add(scan.nextLine().trim());
        }

        int n = scan.nextInt();

        for(int i = 0; i < n; i++){
            s.add(q.poll());
        }

        System.out.println(s.toString());
        System.out.println(q.toString());
    }
}
