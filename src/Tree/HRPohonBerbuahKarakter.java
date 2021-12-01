package Tree;

import java.util.Scanner;

/**
 * URL Soal: https://www.hackerrank.com/contests/bst-asd-si-d/challenges/pohon-berbuah-karakter
 */

class Node4 {
    //do your magic here
    char huruf;
    Node4 kiri, kanan;
    Node4(char huruf) {
        this.huruf = huruf;
    }
}

class BST4 {
    //do your magic here
    Node4 root;


    boolean isEmpty(){
        //do your magic here
        return root == null;
    }
    void insert(char newData){
        //do your magic here
        Node4 newNode4 = new Node4(newData);
        if(isEmpty()) {
            root = newNode4;
        } else {
            Node4 temp = root;
            while(true) {
                if(newData < temp.huruf){
                    if(temp.kiri == null) {
                        temp.kiri = newNode4;
                        break;
                    }
                    temp = temp.kiri;
                    continue;
                } else if(newData > temp.huruf) {
                    if(temp.kanan == null) {
                        temp.kanan = newNode4;
                        break;
                    }
                    temp = temp.kanan;
                    continue;
                }
                break;
            }
        }
    }

    private void inorderUtil(Node4 tmp){
        //do your magic here
        if(tmp == null) return;
        inorderUtil(tmp.kiri);
        System.out.print(tmp.huruf + ", ");
        inorderUtil(tmp.kanan);
    }
    private void preorderUtil(Node4 tmp){
        //do your magic here
        if(tmp == null) return;
        System.out.print(tmp.huruf + ", ");
        preorderUtil(tmp.kiri);
        preorderUtil(tmp.kanan);
    }
    private void postorderUtil(Node4 tmp){
        //do your magic here
        if(tmp == null) return;
        postorderUtil(tmp.kiri);
        postorderUtil(tmp.kanan);
        System.out.print(tmp.huruf + ", ");
    }

    void inorder(){
        //do your magic here
        System.out.print("inorder = ");
        inorderUtil(root);
    }
    void postorder(){
        //do your magic here
        System.out.print("postorder = ");
        postorderUtil(root);
    }
    void preorder(){
        //do your magic here
        System.out.print("preorder = ");
        preorderUtil(root);
    }
}

public class HRPohonBerbuahKarakter {
    public static void main(String[] args) {
        BST4 t = new BST4();
        //do your magic here
        Scanner scan = new Scanner(System.in);
        String kalimat = scan.nextLine().toLowerCase();
        kalimat = kalimat.replaceAll("\\s","");
        char[] huruf = kalimat.toCharArray();

        for (char x : huruf) {
            t.insert(x);
        }


        //end your magic here
        t.inorder();
        System.out.println();
        t.postorder();
        System.out.println();
        t.preorder();
    }
}
