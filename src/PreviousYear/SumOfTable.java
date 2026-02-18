package PreviousYear;


/***
 * Given a number N, your task is to calculate and print the sum of the table of N.
 * Sample test case 1:
 * Input:
 * N = 10
 * ouput: 550
 * Explanation: 55 * 10 = 550
 *
 * Sample test case 2:
 * Input: N = 68
 * N * sum(1-10) -> 55 * 68 = 3740
 * ouput:3740
 */
public class SumOfTable {
    public static void main(String[] args) {

        int n=68;

        int sumOf1To10=55;

        int num=sumOf1To10*n;

        System.out.println(num);
    }
}
