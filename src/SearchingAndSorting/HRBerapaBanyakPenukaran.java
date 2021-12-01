package SearchingAndSorting;

import java.util.Scanner;

/**
 * URL Soal: https://www.hackerrank.com/contests/searching-n-sorting/challenges/berapa-banyak
 */

public class HRBerapaBanyakPenukaran {
    static void bubblesort(int[] data){
        int n = 0;
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data.length - 1 - i; j++) {
                if(data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                    n++;
                }
            }
        }
        System.out.println(n);

        for(int x : data) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    static void insertionSort(int[] data){
        int n = 0;
        for(int i = 1; i < data.length; i++) {
            int j = i-1;
            int temp = data[i];
            for(; (j >= 0 && data[j] > temp); j--) {
                data[j+1] = data[j];
                n++;
            }
            data[j+1] = temp;
            n++;
        }

        System.out.println(n);

        for(int x : data) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void selectionSort(int[] data){
        int n = 0;
        int max;
        int sorted = data.length - 1;
        for(int i = 0; i < data.length; i++) {
            max = 0;
            for(int j = 0; j <= sorted; j++) {
                if(data[j] > data[max]) {
                    max = j;
                }
            }
            int temp = data[max];
            data[max] = data[sorted];
            data[sorted] = temp;
            sorted--;
            n++;
        }

        System.out.println(n);

        for(int x : data) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] data = new int[n];
        for(int i = 0; i < data.length; i++) {
            data[i] = scan.nextInt();
        }

        int[] bubbleData = data.clone();
        bubblesort(bubbleData);
        int[] insertionData = data.clone();
        insertionSort(insertionData);
        selectionSort(data);
    }
}
