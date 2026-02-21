package PrepInsta;

import java.util.Scanner;
/*
Problem Statement

We want to estimate the cost of painting a property. Interior wall painting cost is Rs.18 per sq.ft. and exterior wall painting cost is Rs.12 per sq.ft.

Take input as
1. Number of Interior walls
2. Number of Exterior walls
3. Surface Area of each Interior 4. Wall in units of square feet
Surface Area of each Exterior Wall in units of square feet

If a user enters zero  as the number of walls then skip Surface area values as User may don’t  want to paint that wall.

Calculate and display the total cost of painting the property
Example 1:
6
3
12.3
15.2
12.3
15.2
12.3
15.2
10.10
10.10
10.00
Total estimated Cost : 1847.4 INR
Note: Follow in input and output format as given in above example
 */
public class EstimatedCostOfPainting {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number of interior wall");
        int in= scanner.nextInt();



        System.out.println("Enter the number of exterior wall");
        int ex= scanner.nextInt();

        if(in<0 ||ex<0 ){
            System.out.println("Invalid input");
            System.exit(0);
        }
        else if(in==0 && ex==0 ){
            System.out.println("Estimated cost: 0.0 inr");

        }else {

            double[] wall1 = new double[in];
            double[] wall2 = new double[ex];

            for (int i = 0; i < in; i++) {
                wall1[i] = scanner.nextDouble();
            }

            for (int i = 0; i < ex; i++) {
                wall2[i] = scanner.nextDouble();
            }

            double sum1 = 0;
            double sum2 = 0;
            for (double ele : wall1) {
                sum1 += ele;
            }

            for (double ele : wall2) {
                sum2 += ele;
            }

            double estimatedCost = (sum1 * 18) + (sum2 * 12);

            System.out.println("Total cost: " + estimatedCost);
        }
    }
}
