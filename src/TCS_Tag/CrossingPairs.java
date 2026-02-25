package TCS_Tag;

import java.util.Scanner;
/*
Given an array Arr[] of size T, contains binary digits.
Where
0 represents a biker running to the north.
1 represents a biker running to the south.
The task is to count crossing bikers in such a way that each pair of crossing bikers (N, S), where 0<=N<S<T,
is passing when N is running to the north and S is running to the south.
23
Constraints:
<=N<S<T
Example -1:
Input:
5. -> Number of elements i.e. T
0. -> Value of 1st element
1. -> Value of 2nd element
0. -> Value of 3rd element
1. -> Value of 4th element
1. -> Value of 5th element
Output:
5
Explanation:
The 5 pairs are (Arr[0], Arr[1]), (Arr[0], Arr[3]), (Arr[0], Arr[4]), (Arr[2], Arr[3]) and (Arr[2], Arr[4]).
Note that in all pairs first element is 0, second element is 1 and index of first element is smaller than index
of second element.
The Input format for testing:
First input line: Accept a single positive integer value for T representing the size of Arr[].
Second input line:: Accept N number of integer values (0 or 1) separated by a new line.
Output Format for Testing:
The output must be a non-negative integer number only (See the output format in example).
Additional messages in the output will result in the failure of test cases.

 */
/*
public class CrossingPairs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[]arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }

        int count=0;

        for(int i=0;i<n-1;i++){
            if(arr[i]==0) {
                for (int j = i + 1; j<n;j++){
                    if(arr[j]==1){
                        count++;
                    }
                }
            }

        }
        System.out.println(count);

    }
}
*/
/**
 * 🔥 Better Approach (O(n))
 *
 * Instead of checking every pair:
 *
 * Count how many 0s you’ve seen so far.
 *
 * Every time you see a 1, add the number of previous 0s to the result.
 *
 * Why?
 *
 * Because every 1 forms a crossing pair with all previous 0s
 *
 *
 *
 */


public class CrossingPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int countZero = 0;
        long crossingPairs = 0;   // use long if input can be large

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();

            if (value == 0) {
                countZero++;
            } else if (value == 1) {
                crossingPairs += countZero;
            }
        }

        System.out.println(crossingPairs);
    }
}