package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.function.Predicate;

public class HRCelenganGanjilGenap {
    static LinkedList<Integer> ll = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Predicate<Integer> cekGenap = i -> (i % 2 == 0);
        Predicate<Integer> cekGanjil = i -> (i % 2 != 0);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            ll.add(scan.nextInt());
        }

        scan.nextLine();
        String type = scan.nextLine();

        if (type.equals("ganjil")) {
            ll.removeIf(integer -> integer % 2 == 0);
        } else {
            ll.removeIf(cekGanjil);
        }

        System.out.println(ll.toString());
    }
}