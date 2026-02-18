package Number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AllDivisorsOfANumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        ArrayList<Integer>arrList=new ArrayList<>();

        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0) {
                arrList.add(i);

                if (i!=n/i) {
                    arrList.add(n / i);
                }
            }
        }

        Collections.sort(arrList);
        System.out.println(arrList);
    }
}
