package PreviousYear;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A chocolate factory is packing chocolates into the packets.
 * The chocolate packets here represent an array of N number of integer values.
 * The task is to find the empty packets(0) of chocolate and
 * push it to the end of the conveyor belt(array).
 *
 * Click here to see solution
 * Example 1 : N=8 and arr = [4,5,0,1,9,0,5,0].
 * There are 3 empty packets in the given set.
 * These 3 empty packets represented as O should be pushed towards
 */


public class ChocolateFactory {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n=scanner.nextInt();

        int[]array=new int[n];

        for(int i=0;i<n;i++){
            array[i]= scanner.nextInt();
        }

        int right=0;
        int left=0;

        while(right<n){

            if(array[right]!=0){
                array[left]=array[right];
                left++;
            }

            right++;
        }

        while(left<n){
            array[left]=0;
            left++;
        }

        System.out.println(Arrays.toString(array));
    }
}
