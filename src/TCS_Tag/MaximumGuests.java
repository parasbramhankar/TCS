package TCS_Tag;

import java.util.Scanner;

/*
A party has been organised on a cruise. The party is organised for a limited time(T). The number of
guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as elements of the array. The
task is to find the maximum number of guests present on the cruise at any given instance within T hours.
Example 1:
Input:
5 ---> Value of T
[7,0,5,1,3] ---> E[], element of E[0] to E[N-1], where input each element is separated by new line
[1,2,1,3,4] -----> L[],element of L[0] to L[N-1], where input each element is separated by new line
Output:
8 -----> Maximum number of guests on cruise at an instance.
Explanation:
1
st hour
Entry: 7, Exit: 1
No. of guests on the ship: 6
2
nd hour:
1
st hour
Entry: 0, Exit: 2
No. of guests on the ship: 6 -2 = 4
Hour 3:
Entry: 5, Exit: 1
No. of guests on the ship: 4 + 5 -1 = 8
Hour 4:
22
Entry: 1, Exit: 3
No. of guests on the ship: 8 + 1 - 3 = 6
Hour 5:
Entry: 3, Exit: 4
No. of guests on the ship: 6 + 3 - 4 = 5
Hence, Maximum Number of guests within 5 hours is 8.

 */
public class MaximumGuests {

    public static int maximumGuests(int[]E,int[]L){
        int n=E.length;

        int max=Integer.MIN_VALUE;
        int count=0;

        for(int i=0;i<n;i++){
              count=count+E[i];
              count=count-L[i];
              max=Math.max(max,count);
        }

        return max;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();

        int[]E=new int[n];
        int[]L=new int[n];
        for(int i=0;i<n;i++){
            E[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            L[i]=scanner.nextInt();
        }

        int maxGuests=maximumGuests(E,L);

        System.out.println(maxGuests);
    }
}
