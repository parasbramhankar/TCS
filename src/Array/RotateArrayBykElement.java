package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArrayBykElement {

    public static void main(String[] args) {
        int[]arr=new int[]{1,2,3,4,5};
        int n=arr.length;
        int k=2;

        rotate(arr,0,k-1);
        rotate(arr,k,n-1);
        rotate(arr,0,n-1);

        System.out.println(Arrays.toString(arr));

        System.out.println("Average: "+Arrays.stream(arr).average().getAsDouble());

    }

    public static void rotate(int[]arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
