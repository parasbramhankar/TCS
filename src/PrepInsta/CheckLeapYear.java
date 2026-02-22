package PrepInsta;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int year= scanner.nextInt();

        if((year%4==0 && year%100!=0) || year%400==0){
            System.out.println("This is leap year");
        }
        else{
            System.out.println("this is not leap year");
        }

    }
}
