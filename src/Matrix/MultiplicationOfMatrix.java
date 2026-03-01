package Matrix;

import java.util.Scanner;

public class MultiplicationOfMatrix {

    public static void multiplicationOfMatrix(int[][]arr,int[][]num){
        int n=arr.length;
        int[][]ans=new int[n][n];

        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){

                int sum=0;

                  for(int k=0;k<n;k++){
                     sum+=arr[i][k]*num[k][j];
                  }

                ans[i][j]=sum;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int [][]arr=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int [][]num=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        multiplicationOfMatrix(arr,num);

    }

}
