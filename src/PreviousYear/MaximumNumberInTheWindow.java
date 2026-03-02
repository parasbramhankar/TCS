package PreviousYear;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * You are given an array of integers, arr,and an integer k.
 * Your task is to find and print the maximum number in each contiguous window of size k.
 * Sample test case 1:
 * Input:
 * arr = [1, 3, -1, -3, 5, 3, 6, 7] k=3
 * Output:
 * [3, 3, 5, 5, 6, 7]
 */

public class MaximumNumberInTheWindow {

    public static void main(String[] args) {
        int[]arr=new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int k=3;
        ArrayList<Integer>arrList=new ArrayList<>();
        int n=arr.length;

        for(int i=0;i<n-k+1;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }
            arrList.add(max);
        }
        System.out.println(arrList);
    }
}
