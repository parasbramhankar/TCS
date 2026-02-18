package PreviousYear;

/**
 * Given two integers, a and b, your task is to determine the sum of the cubes of
 * all numbers in the range from a to b.
 * sample test case
 * a = 4
 * b = 9
 * ouput: 1989
 */
public class SumOfCube {
    public static void main(String[] args) {
        int sumOfCube=0;
        int a=4;
        int b=9;

        for(int i=a;i<=b;i++){
            sumOfCube+=(int)(Math.pow(i,3));
        }
        System.out.println(sumOfCube);
    }
}
