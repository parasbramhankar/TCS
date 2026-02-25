package TCS_Tag;

import java.util.Arrays;
import java.util.Scanner;

public class ChocolateFactory {

    public static void moveAllZerosToEnd(int[]arr){
        int n=arr.length;

        int left=0;
        int right=0;

        while(right<n){
            if(arr[right]!=0){
                arr[left]=arr[right];
                left++;
            }
            right++;
        }

        while(left<n){
            arr[left]=0;
            left++;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();

        int[]chocolate=new int[n];

        for(int i=0;i<n;i++){
            chocolate[i]=scanner.nextInt();
        }

        moveAllZerosToEnd(chocolate);

        System.out.println(Arrays.toString(chocolate));
    }
}
