import java.util.Arrays;

/**
 * Computes the next lexicographical permutation of the given integer array.
 *
 * Algorithm Explanation:
 *
 * 1) Traverse the array from right to left and find the first index 'ind'
 *    such that arr[ind] < arr[ind + 1].
 *    This is called the "break point".
 *
 *    Example:
 *    Input: 2 1 5 4 3 0 0
 *    Break point = index 1 (value = 1)
 *
 * 2) If no such index exists (ind == -1),
 *    it means the array is in descending order (largest permutation).
 *    In that case, reverse the entire array to get the smallest permutation.
 *
 *    Example:
 *    5 4 3 2 1 → 1 2 3 4 5
 *
 * 3) If break point exists:
 *    Traverse again from right to left and find the first element
 *    greater than arr[ind], then swap them.
 *
 *    Example:
 *    2 1 5 4 3 0 0
 *        ↑
 *    Swap 1 with 3
 *    → 2 3 5 4 1 0 0
 *
 * 4) Reverse the subarray to the right of ind
 *    to make it the smallest possible order.
 *
 *    Example:
 *    2 3 5 4 1 0 0
 *          ↓
 *    Reverse → 2 3 0 0 1 4 5
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 *
 * This algorithm modifies the array in-place.
 */




public class NextPermutation {

    public static void nextPermutation(int[]arr){
        int n=arr.length;
        int ind=-1;

        for(int i=n-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                ind=i-1;
                break;
            }
        }

        if(ind==-1){
            reverse(arr,0,n-1);
        }

        for(int i=n-1;i>ind;i--){
            if(arr[i]>arr[ind]){
                int temp=arr[ind];
                arr[ind]=arr[i];
                arr[i]=temp;
                break;
            }
        }

        reverse(arr, ind+1,n-1);
    }

    public static void reverse(int[]arr,int start,int end){

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }



    public static void main(String[] args) {
        int[]arr=new int[]{2,1,5,4,3,0,0};

        nextPermutation(arr);

        System.out.println(Arrays.toString(arr));
    }
}


