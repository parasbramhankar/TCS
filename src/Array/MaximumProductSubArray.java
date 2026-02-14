package Array;

public class MaximumProductSubArray {
    public static void main(String[] args) {

        int []arr=new int[]{2,3,-2,-4};

        int min=arr[0];
        int max=arr[0];
        int ans=arr[0];

        for(int i=1;i<arr.length;i++){

            int curr=arr[i];

            int temp=Math.max(curr,Math.max(curr*min,curr*max));
            min=Math.min(curr,Math.min(curr*min,curr*max));

            max=temp;

            ans=Math.max(ans,max);
        }
    }
}
