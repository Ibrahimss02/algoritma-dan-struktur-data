package Tree;

import java.util.Objects;
import java.util.Scanner;

/**
 * URL Soal: https://www.hackerrank.com/contests/binary-tree-indepth/challenges/details-about-a-tree
 */

class Node2 {
    int data;
    Node2 left, right;

    Node2(int data) {
        this.data = data;
    }

}
class BST3{
    Node2 root;

    boolean isEmpty(){
        return this.root == null;
    }
    void insert(int newData){
        Node2 newNode2 = new Node2(newData);
        if(isEmpty()) {
            root = newNode2;
        } else {
            Node2 temp = root;
            while(true) {
                if(newData < temp.data) {
                    if(temp.left == null) {
                        temp.left = newNode2;
                        break;
                    }
                    temp = temp.left;
                    continue;
                } else if (newData > temp.data) {
                    if(temp.right == null) {
                        temp.right = newNode2;
                        break;
                    }
                    temp = temp.right;
                    continue;
                }
                break;
            }
        }
    }

    void urut(Node2 tmp){
        if(tmp == null) return;
        urut(tmp.left);
        System.out.print(tmp.data + ", ");
        urut(tmp.right);

    }

    int kedalaman(Node2 node) {
        if(node == null) return 0;
        if(node.left == null && node.right == null) {
            return 1;
        }
        if(node.left != null && node.right != null) {
            int leftDepth = 1 + kedalaman(node.left);
            int rightDepth = 1 + kedalaman(node.right);

            return Math.max(leftDepth, rightDepth);
        }
        return 1 + kedalaman(Objects.requireNonNullElseGet(node.left, () -> node.right));
    }

}
public class HRDetailsAboutATree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BST3 tree = new BST3();

        while(scan.hasNextInt()) {
            tree.insert(scan.nextInt());
        }

        tree.urut(tree.root);
        System.out.print("\n" + tree.kedalaman(tree.root.left));
        System.out.print("\n" + tree.kedalaman(tree.root.right));

    }
}
