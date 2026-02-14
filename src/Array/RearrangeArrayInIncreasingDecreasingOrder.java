package Array;
/*
Problem Statement: Rearrange a given array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order

Input: [8 7 1 6 5 9]
Output: [1 5 6 9 8 7]
Explanation: First three elements are in the ascending order and next three elements are in the descending order.
Input: [4 2 8 6 15 5 9 20]
Output: [2 4 5 6 20 15 9 8]
Explanation: First four elements are in the ascending order and next four elements are in the descending order.
 */
/*
Approach:
1. Sort the Array in ascending order
2. reverse the other half of the array
 */

import java.util.Arrays;

public class RearrangeArrayInIncreasingDecreasingOrder {

    public static void main(String[] args) {
        int[]arr=new int[]{4, 2, 8, 6, 15, 5, 9, 20};

        Arrays.sort(arr);

        int low=0;

        int high=arr.length-1;

        low=((low+high)/2)+1;

        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            high--;
            low++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
