package Tree;

import java.util.Scanner;

/**
 * URL Soal: https://www.hackerrank.com/contests/binary-tree-indepth/challenges/treeeee
 */

class Node3 {
    int data;
    Node3 left, right;

    Node3(int data) {
        this.data = data;
    }

}

class BST2 {
    Node3 root;

    boolean isEmpty() {
        return this.root == null;
    }

    void insert(int newData) {
        Node3 newNode3 = new Node3(newData);
        if (isEmpty()) {
            root = newNode3;
        } else {
            Node3 temp = root;
            while (true) {
                if (newData > temp.data) {
                    if (temp.right == null) {
                        temp.right = newNode3;
                        break;
                    }
                    temp = temp.right;
                    continue;
                } else if (newData < temp.data) {
                    if (temp.left == null) {
                        temp.left = newNode3;
                        break;
                    }
                    temp = temp.left;
                    continue;
                }
                break;
            }
        }

    }

    int mystery(int newData) {
        int nilai = newData;
        Node3 temp = root;
        while (true) {
            if (temp == null) break;
            if (temp.data == newData) {
                if (temp.left != null) nilai += temp.left.data;
                if (temp.right != null) nilai += temp.right.data;
                break;
            } else if (temp.data > newData) {
                temp = temp.left;
                continue;
            } else {
                temp = temp.right;
                continue;
            }
        }

        return nilai;
    }
}

public class HRTreeeee {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BST2 tree = new BST2();

        String[] x = scan.nextLine().trim().split(" ");

        for (String angka : x) {
            tree.insert(Integer.parseInt(angka));
        }

        System.out.println(tree.mystery(scan.nextInt()));
    }
}
