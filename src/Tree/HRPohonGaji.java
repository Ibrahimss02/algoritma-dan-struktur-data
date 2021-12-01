package Tree;

import java.util.Scanner;

/**
 * URL Soal: https://www.hackerrank.com/contests/bst-asd-si-d/challenges/pohon-gaji/
 */

class Node5 {
    //do your magic here
    int gaji;
    String nama;
    Node5 kiri, kanan;

    Node5(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }
}
class BST5 {
    Node5 root;


    boolean isEmpty(){
        //do your magic here
        return root == null;
    }

    void insert(String nama,int newData){
        //do your magic here
        Node5 newNode5 = new Node5(nama, newData);

        if(isEmpty()) {
            root = newNode5;
        } else {
            Node5 temp = root;
            while(true) {
                if(newData < temp.gaji) {
                    if(temp.kiri == null) {
                        temp.kiri = newNode5;
                        break;
                    }
                    temp = temp.kiri;
                    continue;
                } else if (newData > temp.gaji) {
                    if (temp.kanan == null) {
                        temp.kanan = newNode5;
                        break;
                    }
                    temp = temp.kanan;
                    continue;
                }
            }
        }

    }
    private void inorderUtil(Node5 tmp){
        //do your magic here
        if(tmp == null) return;
        inorderUtil(tmp.kiri);
        System.out.println(tmp.nama + " bergaji " + tmp.gaji + " dollar");
        inorderUtil(tmp.kanan);
    }
    private void preorderUtil(Node5 tmp){
        //do your magic here;'
        if(tmp == null) return;
        System.out.println(tmp.nama + " bergaji " + tmp.gaji + " dollar");
        preorderUtil(tmp.kiri);
        preorderUtil(tmp.kanan);
    }
    private void postorderUtil(Node5 tmp){
        //do your magic here
        if(tmp == null) return;
        postorderUtil(tmp.kiri);
        postorderUtil(tmp.kanan);
        System.out.println(tmp.nama + " bergaji " + tmp.gaji + " dollar");
    }

    void inorder(){
        //do your magic here
        System.out.println("inorder =");
        inorderUtil(root);
        System.out.println();
    }
    void postorder(){
        //do your magic here
        System.out.println("postorder =");
        postorderUtil(root);
        System.out.println();
    }
    void preorder(){
        //do your magic here
        System.out.println("preorder =");
        preorderUtil(root);
        System.out.println();
    }
}

public class HRPohonGaji {
    public static void main(String[] args) {
        BST5 t = new BST5();
        //do your magic here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i < n; i++) {
            String nama = scan.next();
            int gaji = scan.nextInt();
            t.insert(nama, gaji);
        }
        //end your magic here
        t.inorder();
        t.postorder();
        t.preorder();
    }
}
