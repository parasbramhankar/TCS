package PreviousYear;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Given an integer array arr[] of size N and an integer K,
 * find all contiguous subarrays whose sum is equal to K.
 *
 * Return or print each such subarray.
 */
public class ContiguousSubArraySum {

    /* BruteForce:


    public static ArrayList<ArrayList<Integer>> findSubArray(int[]arr,int target){
        int n= arr.length;
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();

        for(int i=0;i<n;i++){
           int sum=0;
           for(int j=i;j<n;j++){
               sum+=arr[j];
               if(sum==target){
                   ArrayList<Integer>arrList=new ArrayList<>();

                   for(int k=i;k<=j;k++){
                       arrList.add(arr[k]);
                   }
                   ans.add(arrList);
               }
           }
        }

        return ans;
    }

  */

    public static ArrayList<ArrayList<Integer>> findSubArray(int[] arr, int target) {

        int n = arr.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        int sum = 0;

        // prefix sum 0 occurs before array starts
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            int rem = sum - target;

            if (map.containsKey(rem)) {
                for (int start : map.get(rem)) {
                    ArrayList<Integer> arrList = new ArrayList<>();

                    for (int k = start + 1; k <= i; k++) {
                        arrList.add(arr[k]);
                    }

                    ans.add(arrList);
                }
            }

            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }

        return ans;
    }


    public static void main(String[] args) {
        int[]arr=new int[]{3, 4, -7, 1, 3, 3, 1, -4};
        int target=7;

        ArrayList<ArrayList<Integer>>arrayList=findSubArray(arr,target);

        System.out.println(arrayList);

    }
}
