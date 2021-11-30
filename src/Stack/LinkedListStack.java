package Stack;

import java.util.LinkedList;

/**
 * Class LinkedList yang cara kerjanya seperti stack
 */
class StackLinkedList {
    LinkedList<Integer> stack = new LinkedList<>();

    public void push(Integer data) {
        stack.addLast(data);
    }

    public Integer pop(){
        Integer data = stack.getLast();
        stack.removeLast();
        return data;
    }

    public Integer peek(){
        return stack.getLast();
    }

    public void show(){
        for (Integer data : stack){
            System.out.println(data);
        }
        System.out.println("============================");
    }
}

public class LinkedListStack {
    public static void main(String[] args) {
        StackLinkedList stackLinkedList = new StackLinkedList();
        stackLinkedList.push(5);
        stackLinkedList.push(7);
        stackLinkedList.show();
        Integer data = stackLinkedList.pop();
        System.out.println("hasil pop : " + data);
        stackLinkedList.push(3);
        stackLinkedList.show();
    }
}
