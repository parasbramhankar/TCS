package Array;

/*
Problem Statement: Given an unsorted array, remove duplicates from the array.

Input: arr[]={2,3,1,9,3,1,3,9}
Output: {2,3,1,9}
Explanation: Removed all the duplicate elements.

Input: arr[]={4,3,9,2,4,1,10,89,34}
Output: {4,3,9,2,1,10,89,34}
Explanation: Removed all the duplicate elements.



 */
/*
Approach:

1. Create a hashmap to maintain the occurance of the element
2. if the element already in the map then skip that elemet
3. if the element is not present then add into the result list and
   put it into the map

*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicateFromUnsortedArray {

    public static void main(String[] args) {

        int []arr=new int[]{2,3,1,9,3,1,3,9};

        Map<Integer,Boolean>seen=new HashMap<>();
        List<Integer>arrList=new ArrayList<>();

        for(int ele:arr){
            if(!seen.containsKey(ele)){
                arrList.add(ele);
                seen.put(ele,true);
            }
        }

        System.out.println(arrList);
    }

}


/*

 */
