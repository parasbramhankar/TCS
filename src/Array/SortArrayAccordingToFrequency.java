package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class SortArrayAccordingToFrequency {

    public static void main(String[] args) {
        int []arr=new int[]{5, 5, 4, 6, 4};

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int ele:arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        ArrayList<Integer>arrayList=new ArrayList<>();

        for(int ele:arr){
            arrayList.add(ele);
        }

        Collections.sort(arrayList, new Comparator<Integer>() {
            public int compare(Integer a,Integer b){
                int fA=map.get(a);
                int fB=map.get(b);

                if(fA!=fB){
                    return fB-fA;
                }
                else {
                    return a-b;
                }
            }
        });

        System.out.println(arrayList);
    }
}
