package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindAllSymmetricPairsInTheArrayOfPairs {

    public static void main(String[] args) {
        int[][]arr=new int[][]{{1,2},{2,1},{3,4},{4,5},{5,4}};
        int n=arr.length;
        ArrayList<int[]>arrayList=new ArrayList<>();
/*

BruteForce:
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i][0]==arr[j][1] && arr[i][1]==arr[j][0]){
                    arrayList.add(new int[]{arr[j][0],arr[j][1]});
                }
            }
        }
 */

        Map<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<n;i++){
            int first=arr[i][0];
            int second=arr[i][1];

            if(map.containsKey(second) && map.get(second)==first)
            {
                arrayList.add(new int[]{first,second});
            }
            map.put(first,second);
        }

     //Display
        for(int[]nums:arrayList){
            System.out.print(Arrays.toString(nums));
        }

    }
}
