package LinkedList.Tugas;

import java.util.LinkedList;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedList<Integer> ll = new LinkedList<>();
        int n;
        int sum = 0;

        System.out.println("Input banyaknya data : ");
        n = scan.nextInt();

        for (int i = 0; i < n; i++){
            System.out.printf("Input data node ke-%d: ", i);
            ll.add(scan.nextInt());
        }

        for (int x : ll){
            sum += x;
        }

        System.out.print("\nJumlah semua data: " + sum);
    }
}
