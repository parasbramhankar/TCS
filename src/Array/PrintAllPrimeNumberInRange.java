package Array;

import java.util.Arrays;
import java.util.Scanner;

public class PrintAllPrimeNumberInRange {

    public static void findPrime(int from,int to){
        boolean[]isPrime=new boolean[to+1];
        Arrays.fill(isPrime,true);

        for(int i=2;i*i<=to;i++){

            if(isPrime[i]){
                for(int p=i*i;p<=to;p+=i){
                    isPrime[p]=false;
                }
            }
        }

        for(int i=from;i<=to;i++){
            if(isPrime[i]) {
                System.out.print(i + " ");
            }
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter the Range");
        Scanner scanner=new Scanner(System.in);

        int from= scanner.nextInt();
        int to= scanner.nextInt();

        System.out.println("Prime number from "+from+" to "+to);
        findPrime(from,to);
    }
}
