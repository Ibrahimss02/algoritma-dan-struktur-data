package SearchingAndSorting;

import java.util.Scanner;

/**
 * URL Soal: https://www.hackerrank.com/contests/searching-n-sorting/challenges/mencari-data
 */

public class HRMencariData {
    static void sort(int[] data){
        for(int i = 0; i < data.length-1; i++) {
            for(int j = i + 1; j < data.length; j++) {
                if(data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }

    public static int binarySearch(int[] data,int target){
        int left = 0;
        int right = data.length - 1;

        while(left <= right) {
            System.out.println(left + " " + right);
            int midIdx = (left + right) /2;
            if(data[midIdx] == target) {
                return midIdx;
            } else if(data[midIdx] > target) {
                right = midIdx - 1;
            } else {
                left = midIdx + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int many=read.nextInt();
        int[] data=new int[many];
        for (int i = 0; i < many; i++) {
            data[i]=read.nextInt();
        }
        int target=read.nextInt();
        sort(data);
        System.out.println(binarySearch(data, target));

    }
}
