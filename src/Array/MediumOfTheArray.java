package Array;

import java.util.Arrays;

public class MediumOfTheArray {
    public static void main(String[] args) {
        int[]arr=new int[]{2,4,1,3,5,6};

        Arrays.sort(arr);
        int n=arr.length;


        if(n%2==0){
            int n1=n/2-1;
            int n2=n/2;

            System.out.println("Medium: "+(double)(arr[n1]+arr[n2])/2);
        }
        else{
            System.out.println("Medium: "+arr[n/2]);
        }
    }
}
