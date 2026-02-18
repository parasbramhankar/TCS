package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortNumberInDecreasingOrder {
    public static void main(String[] args) {
        int []arr=new int[]{4,4,1,1,5,3,6,1,5,8,8,6,9};

        ArrayList<Integer>arrList=new ArrayList<>();

        for(int ele:arr){
            arrList.add(ele);
        }

        Collections.sort(arrList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        System.out.println(arrList);

    }
}
