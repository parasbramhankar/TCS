package Array;

import java.util.*;

public class RepeatingElementInAnArray {
    public static void main(String[] args) {
        int []arr=new int[]{2,3,1,9,3,1,3,9};

        Map<Integer,Boolean> seen=new HashMap<>();
        List<Integer> arrList=new ArrayList<>();

        for(int ele:arr){
            if(seen.containsKey(ele)){
                if(!arrList.contains(ele)) {
                    arrList.add(ele);
                }
            }
            seen.put(ele,true);
        }

        System.out.println(arrList);
    }
}
