package Number;

import java.util.Scanner;

public class FindNthRootOfNumber {

    public static int findTheNthRoot(int num,int n){
        int ans=-1;
        for(int i=1;i<=num;i++){

            long power=(long)Math.pow(i,n);

            if(power==num){
                ans=i;
                break;
            }

            if(power>num){
                break;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();

        int n= scanner.nextInt();

        int nthRoot=findTheNthRoot(number,n);

        System.out.println(nthRoot);
    }
}
