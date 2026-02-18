package PreviousYear;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable.
 * The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid string.
 * The string is considered valid if the number of ‘*’ and ‘#’ are equal.
 * The ‘*’ and ‘#’ can be at any position in the string.
 * Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the
 * input string.
 * ● (*>#): positive integer
 * ● (#>*): negative integer
 * ● (#=*): 0
 */
public class MinimumNumberOfStarAndHash {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String :");
        String str=sc.next();

        int count=0;

        for(char ch:str.toCharArray()){
            if(ch=='*'){
                count++;
            }
            else if(ch=='#'){
                count--;
            }
        }

        System.out.println(count);
    }
}
