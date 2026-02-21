package PrepInsta;
/*
Problem Statement

A City Bus is a Ring Route Bus which runs in circular fashion.That is, Bus once starts at the Source Bus Stop, halts at each Bus Stop in its Route and at the end it reaches the Source Bus Stop again.
If there are n  number of Stops and if the bus starts at Bus Stop 1, then after nth Bus Stop, the next stop in the Route will be Bus Stop number 1 always.
If there are n stops, there will be n paths.One path connects two stops. Distances (in meters) for all paths in Ring Route is given in array Path[] as given below:
Path = [800, 600, 750, 900, 1400, 1200, 1100, 1500]
Fare is determined based on the distance covered from source to destination stop as  Distance between Input Source and Destination Stops can be measured by looking at values in array Path[] and fare can be calculated as per following criteria:

If d =1000 metres, then fare=5 INR
(When calculating fare for others, the calculated fare containing any fraction value should be ceiled. For example, for distance 900n when fare initially calculated is 4.5 which must be ceiled to 5)
Path is circular in function. Value at each index indicates distance till current stop from the previous one. And each index position can be mapped with values at same index in BusStops [] array, which is a string array holding abbreviation of names for all stops as-
“THANERAILWAYSTN” = ”TH”, “GAONDEVI” = “GA”, “ICEFACTROY” = “IC”, “HARINIWASCIRCLE” = “HA”, “TEENHATHNAKA” = “TE”, “LUISWADI” = “LU”, “NITINCOMPANYJUNCTION” = “NI”, “CADBURRYJUNCTION” = “CA”

Given, n=8, where n is number of total BusStops.
BusStops = [ "TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA" ]

Write a code with function getFare(String Source, String Destination) which take Input as source and destination stops(in the format containing first two characters of the Name of the Bus Stop) and calculate and return travel fare.

Example 1:
Input Values
ca
Ca
Output Values
INVALID OUTPUT

Example 2:
Input Values
NI
HA
Output Values
23.0 INR
Note: Input and Output should be in format given in example.
Input should not be case-sensitive and output should be in the format   INR
 */

import java.util.Scanner;

public class GetFare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the source:");
        String source = scanner.next().toUpperCase();

        System.out.println("Enter the destination: ");
        String destination = scanner.next().toUpperCase();
        double fare = getFare(source, destination);


        if (fare == -1) {
            System.out.println("Invalid input");
        } else {
            System.out.println("Total fare: " + fare);
        }


    }

    public static double getFare(String source, String destination) {
        int[] path = new int[]{800, 600, 750, 900, 1400, 1200, 1100, 1500};
        String[] busStops = new String[]{"TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA"};

        int sourceInd = -1;
        int destinationInd = -1;

        for (int i = 0; i < busStops.length; i++) {

            if (busStops[i].equals(source)) {
                sourceInd = i;
            }

            if (busStops[i].equals(destination)) {
                destinationInd = i;
            }
        }

        if (sourceInd == -1 || destinationInd == -1 || sourceInd == destinationInd) {
            return -1;
        }
        int index = sourceInd;

        int sum = 0;

        while (index != destinationInd) {
            index = (index + 1) % path.length;
            sum += path[index];
        }

        return Math.ceil((sum / (double) 1000) * 5);
    }
}
