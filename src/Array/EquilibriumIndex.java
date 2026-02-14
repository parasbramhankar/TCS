package Array;

/*
Problem Statement: Given a 0-indexed integer array nums,
find the leftmost equilibrium Index.

An equilibrium Index is an index at which sum of elements on its left is
equal to the sum of element on its right. That is,
nums[0] + nums[1] + ... + nums[equilibriumIndex-1] == nums[equilibriumIndex+1] + nums[equilibriumIndex+2] + ... + nums[nums.length-1]. If equilibriumIndex == 0, the left side sum is considered to be 0. Similarly, if equilibriumIndex == nums.length - 1, the right side sum is considered to be 0.

Return the leftmost equilibrium Index that satisfies the condition, or -1 if there is no such index.
 */
public class EquilibriumIndex {
/* BruteForce:
    public static void main(String[] args) {
        int []arr=new int[]{2, 3, -1, 8, 4};
        int equilibrium=0;

        for(int i=0;i< arr.length;i++){
            int left=0;
            int right=0;

            for(int j=0;j<i;j++){
                left+=arr[j];
            }

            for(int j=i+1;j<arr.length;j++){
                right+=arr[j];
            }

            if(left==right){
                equilibrium=i;
                break;
            }
        }

        System.out.println("Equilibrium index: "+equilibrium);
    }
 */

    public static void main(String[] args) {
        int []arr=new int[]{2, 3, -1, 8, 4};
        int equilibrium=-1;

        int totalSum=0;
        for(int ele:arr){
            totalSum+=ele;
        }
        int left=0;
        int right=totalSum;
        for(int i=0;i< arr.length;i++){

            right-=arr[i];

            if(left==right){
                equilibrium=i;
                break;
            }

            left+=arr[i];
        }

        System.out.println("Equilibrium Index: "+equilibrium);


    }
}
