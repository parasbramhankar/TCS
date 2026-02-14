package Array;

import java.util.ArrayList;

public class CheckIfArrayIsSubsetOfAnotherArray {
    public static void main(String[] args) {
        int []arr1= new int[]{1,3,4,5,2};
        int []arr2= new int[]{4,5,2};

        ArrayList<Integer>arrList=new ArrayList<>();

        for(int i:arr2){
            arrList.add(i);
        }

        boolean check=true;

        for(int i=0;i<arr1.length;i++){
            if(!arrList.contains(arr1[i])){
                check=false;
            }
        }

        if(check){
            System.out.println("arr1 is the subset of the arr2");
        }else{
            System.out.println("Not the subset");
        }
    }
}
