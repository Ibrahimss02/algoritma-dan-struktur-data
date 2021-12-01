package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    int data;
    Node2 left, right;

    Node(int data) {
        this.data = data;
    }
}
class CBTree{
    Node2 root;

    boolean isEmpty(){
        return root == null;
    }

    void insert(int newData){
        Node2 newNode2 = new Node2(newData);

        if (isEmpty()) {
            root = newNode2;
        } else {
            Queue<Node2> q = new LinkedList<>();
            q.add(root);

            while (!q.isEmpty()) {
                Node2 temp = q.poll();

                if (temp.left == null) {
                    temp.left = newNode2;
                    break;
                } else {
                    q.add(temp.left);
                }
                if (temp.right == null) {
                    temp.right = newNode2;
                    break;
                } else {
                    q.add(temp.right);
                }
            }
        }
    }

    void LevelOrder(){
        if (isEmpty()) {
            System.out.println("CBT Kosong!");
        } else {
            Queue<Node2> q = new LinkedList<>();

            q.add(root);
            while (!q.isEmpty()) {
                Node2 temp = q.poll();
                System.out.print(temp.data + "->");

                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
            System.out.println();
        }
    }
    void printAtLevel(Node2 node, int level){
        //write your magic here!
        if(level == 1) {
            System.out.print(node.data + "->");
            return;
        }
        Queue<Node2> q = new LinkedList<>();
        q.add(root);

        int index = 1;
        while (!q.isEmpty()) {
            Node2 temp = q.poll();

            if(index >= Math.pow(2, level-1) && index < Math.pow(2, level)) {
                System.out.print(temp.data + "->");
            }

            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
            index++;
        }
    }
    void A(Node2 xn){
        if (xn == null) return;
        A(xn.left);
        System.out.printf("%d->", xn.data);
        A(xn.right);

    }
    void B(Node2 xn) {
        if (xn == null) return;
        System.out.printf("%d->", xn.data);
        B(xn.left);
        B(xn.right);
    }

}


public class CodelabTree {
    public static void main(String[] args) {
        //write your magic here!
        Scanner scan = new Scanner(System.in);
        CBTree t = new CBTree();

        int n =scan.nextInt();

        for(int i = 0; i<n ; i++){
            t.insert(scan.nextInt());
        }
        int level = scan.nextInt();
        //end your magic here
        t.LevelOrder();
        t.printAtLevel(t.root, level);
        System.out.println();
        t.A(t.root);
        System.out.println();
        t.B(t.root);
        System.out.println();
    }
}