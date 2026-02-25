package TCS_Tag;

import java.util.Scanner;

public class DecimalToBinaryAndToggle {

    /*
    public static int decimalToBinary(int num){

        StringBuilder sb=new StringBuilder();

        while(num>0){
           int rem=num%2;
           sb.append(Integer.toString(rem));
           num/=2;
        }

        int number=0;

        for(int i=0;i<sb.length();i++){
            int digit=sb.charAt(i)-'0';
            digit=digit==0 ? 1:0;
            number+=(int)Math.pow(2,i)*digit;
        }

        return number;

    }

   */

    public static int decimalToBinaryAndToggle(int num){
        int bits=0;
        int temp=num;

        while(temp>0){
            bits++;
            temp=temp>>1;
        }

        int mask=(1<<bits)-1;

        return mask-num;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();

        int ans=decimalToBinaryAndToggle(num);

        System.out.println(ans);
    }
}
