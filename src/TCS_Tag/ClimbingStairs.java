package TCS_Tag;

import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();

        if(n<=2){
            System.out.println(n);
        }

        int prev1=2;
        int prev2=1;

        for(int i=3;i<n;i++){
            int curr=prev1+prev2;

            prev2=prev1;
            prev1=curr;
        }

        System.out.println(prev1);


    }
}
