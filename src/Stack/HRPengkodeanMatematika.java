package Stack;

import java.util.Scanner;
import java.util.Stack;

public class HRPengkodeanMatematika {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> stackData = new Stack<>();

        String[] data = scan.nextLine().split(" ");

        for (String x : data){
            if (isNumber(x)){
                stackData.push(Integer.parseInt(x));
            } else {
                switch (x){
                    case "+": {
                        int digit1 = stackData.pop();
                        int digit2 = stackData.pop();
                        stackData.push(digit2 + digit1);
                        break;
                    }
                    case "-": {
                        int digit1 = stackData.pop();
                        int digit2 = stackData.pop();
                        stackData.push(digit2 - digit1);
                        break;
                    }
                    case "*": {
                        int digit1 = stackData.pop();
                        int digit2 = stackData.pop();
                        stackData.push(digit2 * digit1);
                        break;
                    }
                    case "/": {
                        int digit1 = stackData.pop();
                        int digit2 = stackData.pop();
                        stackData.push(digit2 / digit1);
                        break;
                    }
                }
            }
        }
        System.out.println(stackData.peek());
    }

    static boolean isNumber(String data){
        try {
            Integer.parseInt(data);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
