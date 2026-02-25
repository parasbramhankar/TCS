

/*Secure Lock System

Problem Statement:

A company has implemented a secure lock system where an N-digit PIN code is checked for validity. The lock will open if:

The sum of all digits in the PIN is divisible by 4.

Write a program to determine if the lock will open or remain locked.

Input Format:

The first line contains an integer T (number of test cases).

Each of the next T lines contains a string PIN representing the N-digit number.

Output Format:

Print "OPEN" if the PIN unlocks the system, otherwise print "LOCKED"





Input:

3
1234
1111
908172

Output:

LOCKED
OPEN
LOCKED
*/

import java.util.*;
public class SecuredLockSystem {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        String[]str=new String[n];

        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }


        for(int i=0;i<n;i++){

            String string=str[i];

            int sum=0;
            for(int j=0;j<string.length();j++){
                sum+=string.charAt(j)-'0';
            }

            if(sum%4==0){
                System.out.println("OPEN");
            }
            else{
                System.out.println("LOCKED");
            }

        }
    }
}
