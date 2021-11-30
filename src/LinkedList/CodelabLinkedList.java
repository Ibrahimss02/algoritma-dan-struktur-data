package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class CodelabLinkedList {
    static LinkedList<String> ll = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < n; i++){
            switch (scan.next()){
                case "ngomong": {
                    ngomong(scan.nextLine().trim());
                    break;
                }
                case "tambah": {
                    tambah(scan.nextInt(), scan.nextLine().trim());
                    break;
                }
                case "larang": {
                    larang(scan.nextLine().trim());
                    break;
                }
            }
        }
        if(!ll.isEmpty()){
            print();
        }
    }

    static void print(){
        System.out.println(ll.toString());
    }

    static void ngomong(String kata){
        ll.add(kata);
        print();
    }

    static void larang(String kata){
        ll.removeIf(x -> x.equals(kata));
    }

    static void tambah(int index, String kata){
        if (ll.size() < index){
            System.out.println("ERROR !");
        } else {
            ll.add(index, kata);
            print();
        }
    }
}