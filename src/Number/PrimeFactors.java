package Number;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();

        ArrayList<Integer>arrList=new ArrayList<>();

        while(n%2==0){
            arrList.add(2);
            n/=2;
        }

        while(n%3==0){
            arrList.add(3);
            n/=3;
        }

        for(int i=5;i<=Math.sqrt(n);i+=6){
            while(n%i==0){
                arrList.add(i);
                n/=i;
            }

            while(n%(i+2)==0){
                arrList.add((i+2));
                n/=(i+2);
            }
        }

        System.out.println(arrList);
    }
}
