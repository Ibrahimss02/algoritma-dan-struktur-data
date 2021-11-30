package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

class Kereta{
    LinkedList<String>[] kereta;

    Kereta(int manyGerbong){
        kereta = new LinkedList[manyGerbong];
        for (int i = 0; i < kereta.length; i++){
            kereta[i] = new LinkedList();
        }
    }
    void insertPenumpang(int nomerGerbong,String nama){
        kereta[nomerGerbong].add(nama);
    }
    void printDaftarPenumpang(){
        for (int i = 0; i < kereta.length; i++){
            if (kereta[i].size() != 0){
                System.out.printf("Gerbong ke %d berisi %d orang dengan nama:\n", i+1, kereta[i].size());
                for (int j = 0; j < kereta[i].size(); j++){
                    System.out.printf("% d. %s\n", j+1, kereta[i].get(j));
                }
            }
        }
    }
}

public class HRSehariDiKAI {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        int banyakGerbong = read.nextInt();
        read.nextLine();
        Kereta krl = new Kereta(banyakGerbong);
        String input;
        try{
            while ((input = read.nextLine()) != null) {
                String[] splittedInput = input.split(" ");
                krl.insertPenumpang(Integer.parseInt(splittedInput[0])-1, splittedInput[1]);
            }
        }
        catch(Exception ignored){

        }
        krl.printDaftarPenumpang();
        read.close();
    }
}

