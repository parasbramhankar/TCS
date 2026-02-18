package Number;

import java.util.Scanner;

public class DigitsInFactorial {

    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();


        double sum=0;
        for(int i=1;i<=n;i++){
            sum+=Math.log10(i);
        }

        int numberOfDigitsInFactorial=(int)Math.ceil(sum);

        System.out.println("Total number of digits in the factorial of the number: "+numberOfDigitsInFactorial);
    }
}
