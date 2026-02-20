package PrepInsta;
/*

A party has been organised on cruise. The party is organised for a limited time(T). The number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as elements of the array. The task is to find the maximum number of guests present on the cruise at any given instance within T hours.

Example 1:
Input :

5    -> Value of T
[7,0,5,1,3]  -> E[], Element of E[0] to E[N-1], where input each element is separated by new line
[1,2,1,3,4]   -> L[], Element of L[0] to L[N-1], while input each element is separate by new line.
Output :
8     -> Maximum number of guests on cruise at an instance.
 */
import java.util.Scanner;

public class MaximumNumberOfGuests {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number of hr ");
        int hr= scanner.nextInt();

        int[]e=new int[hr];
        int []l=new int[hr];

        System.out.println("Entering Guest: ");
        for(int i=0;i<hr;i++){
            e[i]= scanner.nextInt();
        }

        System.out.println("Leaving Guest: ");
        for(int i=0;i<hr;i++){
            l[i]= scanner.nextInt();
        }

        int maxGuest=Integer.MIN_VALUE;

        int totalGuest=0;

        for(int i=0;i<hr;i++){
            totalGuest=totalGuest+e[i]-l[i];
            if(maxGuest<totalGuest){
                maxGuest=totalGuest;
            }
        }

        System.out.println("The maximum number of guests present on the cruise at any given instance within T hours."+maxGuest);


    }
}
