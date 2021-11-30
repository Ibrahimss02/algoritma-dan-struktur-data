package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class HRMerangkaiGerbong {
    static LinkedList<String> ll = new LinkedList<>();

    static void cetak(){
        //Tulis kode anda
        for (String x : ll){
            System.out.printf("%s -> ", x);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Tulis Kode anda
        int n = scan.nextInt();

        for(int i = 0; i < n; i++){
            String opsi = scan.next();
            switch (opsi){
                case "masuk": {
                    int index = scan.nextInt();
                    String elemen = scan.next();
                    masuk(index, elemen);
                    break;
                }
                case "masukAkhir": {
                    String elemen = scan.next();
                    masukAkhir(elemen);
                    break;
                }
                case "masukAwal": {
                    String elemen = scan.next();
                    masukAwal(elemen);
                    break;
                }
                case "print": {
                    cetak();
                }
            }
        }
    }

    static void masukAwal(String n){
        ll.addFirst(n);
    }

    static void masukAkhir(String n){
        ll.addLast(n);
    }

    static void masuk(int index, String n){
        if (index > ll.size()){
            System.out.print("ERROR ! hanya terdapat " + ll.size() + " Gerbong !\n");
        } else {
            ll.add(index, n);
        }
    }
}