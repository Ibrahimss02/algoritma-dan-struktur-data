package LinkedList.Tugas;

import java.util.LinkedList;
import java.util.Scanner;

public class asdd_205150400111046 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedList<String> ll = new LinkedList<>();
        String data;
        int index = 0;

        System.out.println("Silahkan input data (input \"!stop\" untuk exit program) :");
        System.out.printf("Input data node ke-%d : ", index);
        while (!(data = scan.nextLine()).contains("!stop")){
            if (!ll.contains(data)){
                ll.add(data);
                System.out.println(ll);
                index++;
            } else {
                System.out.println("data yang anda masukkan sudah ada dalam linkedlist");
            }
            System.out.printf("Input data node ke-%d : ", index);
        }
    }
}
