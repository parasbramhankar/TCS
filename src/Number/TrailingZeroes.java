package Number;

import java.util.Scanner;

public class TrailingZeroes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n= scanner.nextInt();

        int count=0;

/* Method 1: Here we traverse from 1 to n
             keeping n intact

        for(int i=5;i<=n;i*=5){
            count+=n/i;
        }

 */

 /* Method 2: In this method reducing the value of n by dividing the n by 5 */
        while(n>0){
            n/=5;
            count+=n;
        }

        System.out.println(count);
    }
}
