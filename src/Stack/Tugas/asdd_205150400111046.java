package Stack.Tugas;

import java.util.Scanner;
import java.util.Stack;

public class asdd_205150400111046 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        stack.push('(');

        char[] sentinelQ = scan.nextLine().concat(")").toCharArray();
        sentinelQ[sentinelQ.length - 1] = ')';
        Stack<Character> p = new Stack<>();


        for (Character x : sentinelQ) {
            if (Character.isLetter(x)) {
                p.push(x);
            } else if (x.equals('(')) {
                stack.push(x);
            } else if (x.equals(')')) {
                do {
                    Character charOnTop = stack.peek();
                    if (charOnTop.equals('(')) {
                        stack.pop();
                        break;
                    } else {
                        p.push(stack.pop());
                    }
                } while (!stack.isEmpty());
            } else {
                if (!stack.peek().equals('(')) {
                    do {
                        if (getPrecedenceLevel(stack.peek()) >= getPrecedenceLevel(x)) {
                            p.push(stack.pop());
                        } else {
                            break;
                        }
                    } while (!stack.peek().equals('('));
                }
                stack.push(x);
            }
        }

        for (char element : p){
            System.out.print(element);
        }
    }

    /**
     * Method berfungsi untuk mengecek nilai precedence (prioritas) dari operator
     * yang akan dipakai untuk keperluan komparasi.
     * @param operator Operator yang akan dicek nilai precedence-nya untuk keperluan komparasi
     * @return Nilai [integer] precedence (prioritas) dari operator
     */
    static int getPrecedenceLevel(char operator){
        switch (operator){
            case '+':
            case '-':
                return 0;
            case '*':
            case '/':
                return 1;
            case '^':
                return 2;
            default:
                throw new IllegalArgumentException("Operator tidak diketahui: " + operator);
        }
    }
}
