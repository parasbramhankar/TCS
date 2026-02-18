package BitManipulation;

import java.util.Scanner;

public class FlipAllTheBits {

    /*
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();

        StringBuilder sb=new StringBuilder("");

        while(num>0){
             int rem=num%2;
             sb.append(rem);
             num/=2;
        }
        sb.reverse();
        int pow=0;
        int ans=0;

        for(int i=sb.length()-1;i>=0;i--){

            char ch=sb.charAt(i);

            ch = ch=='1'?'0':'1';

            ans=ans+(int)Math.pow(2,pow)*(ch-'0');
            pow++;

        }

        System.out.println("Decimal number: "+ans);

    }
    */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int num= scanner.nextInt();
        int n=num;
        int count=0;

        while(n>0){
          n=n&(n-1);
          count++;
        }

        int a=0;

        while(count>0){
            a = a | 1;

        }



    }
}
