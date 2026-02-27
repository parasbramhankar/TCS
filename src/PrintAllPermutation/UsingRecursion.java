package PrintAllPermutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UsingRecursion {

    public static void recursiveFunction(int[]arr,List<List<Integer>>ans,
                                         List<Integer>ds,boolean[]check){

        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0;i<arr.length;i++){

            if(!check[i]){
                check[i]=true;
                ds.add(arr[i]);

                recursiveFunction(arr,ans,ds,check);

                check[i]=false;
                ds.remove(ds.size()-1);
            }
        }

    }


    public static List<List<Integer>>findPermutation(int []arr){
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();

        boolean[]check=new boolean[arr.length];
        Arrays.fill(check,false);

        recursiveFunction(arr,ans,ds,check);

        return ans;
    }
    public static void main(String[] args) {
        int[]arr=new int[]{1,2,3,4,5};

        List<List<Integer>>ans=findPermutation(arr);

        System.out.println(ans);
    }
}
