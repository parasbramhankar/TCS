package PreviousYear;

import java.util.Scanner;


/**
 * An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW).
 * A company manager wants to make the production of both types of vehicle according to the
 * given data below:
 * ● 1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
 * ● 2nd data, Total number of wheels = W
 * The task is to find how many two-wheelers and four-wheelers need to manufacture as
 * per the given data.
 *
 * Input: 5 14
 * output: 3 2
 */
public class HowManyTwoWheelerAndFourWheelersAreCreated {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int v= scanner.nextInt();
        int w= scanner.nextInt();

        if(v<0 || w<0 || w%2!=0 || w<2*v || w>4*v){
            System.out.println("Invalid input...!");
            System.exit(0);
        }


        int x=(4*v-w)/2;

        int y=v-x;

        System.out.println("Total number of two-wheelers: "+x);
        System.out.println("Total number of four-wheelers: "+y);
    }
}
