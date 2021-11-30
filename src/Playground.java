import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }

}

class BST {
    Node root;

    boolean isEmpty() {
        return this.root == null;
    }

    void insert(int newData) {
        Node newNode = new Node(newData);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node temp = root;
            while (true) {
                if (newData > temp.data) {
                    if (temp.right == null) {
                        temp.right = newNode;
                        break;
                    }
                    temp = temp.right;
                    continue;
                } else if (newData < temp.data) {
                    if (temp.left == null) {
                        temp.left = newNode;
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
        Node temp = root;
        while (true) {
            if (temp == null) break;
            if (temp.data == newData) {
                if (temp.left != null) nilai += temp.left.data;
                if (temp.right != null) nilai += temp.right.data;
                break;
            } else if (temp.data > newData) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }

        return nilai;
    }

    void urut(Node tmp) {
        if (tmp == null) return;
        urut(tmp.left);
        System.out.print(tmp.data + ", ");
        urut(tmp.right);

    }
}

public class Playground {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BST tree = new BST();

        String[] x = scan.nextLine().trim().split(" ");

        for (String angka : x) {
            tree.insert(Integer.parseInt(angka));
        }

        System.out.println(tree.mystery(scan.nextInt()));
    }
}