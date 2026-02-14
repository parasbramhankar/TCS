package Array;

/*
Problem Statement: Given an array of N integers, the task is to replace each element of
the array by its rank in the array.

Examples
Input: 20 15 26 2 98 6
Output: 4 3 5 1 6 2
Explanation: When sorted,the array is 2,6,15,20,26,98. So the rank of 2 is 1,rank of 6 is 2,
rank of 15 is 3 and so.

Input: 1 5 8 15 8 25 9
Output: 1 2 3 5 3 6 4
Explanation :When sorted,the array is 1,5,8,8,9,15,25. So the rank of 1 is 1,rank of 5 is 2,rank of 8 is 3 and so.
 */


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReplaceEachElementWithItsRank {
    public static void main(String[] args) {
        int[]arr=new int[]{20,15,26,2,98,6};

        int[]sorted=Arrays.copyOf(arr,arr.length);
        Arrays.sort(sorted);
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(sorted[i],(i+1));
        }
        int[]result=new int[sorted.length];

        for(int i=0;i< arr.length;i++){
            result[i]=map.get(arr[i]);
        }

        System.out.println(Arrays.toString(result));
    }
}
