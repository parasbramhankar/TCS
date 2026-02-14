package Array;

import java.util.Arrays;
import java.util.Stack;

public class SortAccordingToAnArray {


    public static void main(String[] args) {
        int[]a=new int[]{2, 1, 2, 3, 4};

        int[] b=new int[]{2,1,2};


        function(a,b);

        System.out.println(Arrays.toString(a));

    }

    public static void function(int[]a,int[] b){

        int max=Arrays.stream(a).max().getAsInt();

        int[]freq=new int[max+1];

        for(int x:a){
            freq[x]++;
        }

        int ind=0;
        for(int x:b){
            while(x<=max && freq[x]>0){
                a[ind]=x;
                freq[x]--;
                ind++;
            }
        }

        for(int i=0;i<a.length;i++){
            while(freq[i]>0){
                a[ind]=i;
                freq[i]--;
            }
        }
    }
}


