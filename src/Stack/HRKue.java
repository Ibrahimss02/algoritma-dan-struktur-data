package Stack;

import java.util.Scanner;
import java.util.Stack;

public class HRKue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String kue = scan.nextLine();
        String[] semuaKue = kue.split(" ");
        Stack<String> tempatKue = new Stack<>();

        for (String x : semuaKue) {
            tempatKue.push(x);
        }

        int size = tempatKue.size();
        String kueAtas = tempatKue.pop();
        String kueBawah = "";

        while (tempatKue.size() != 1){
            tempatKue.pop();
        }

        System.out.println(size);
        System.out.println(tempatKue.pop());
        System.out.println(kueBawah);
    }
}

