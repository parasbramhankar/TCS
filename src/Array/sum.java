package Array;

import java.util.Arrays;

public class sum {

    public static void main(String[] args) {
        int[]arr=new int[]{1,2,3,4,5};

        System.out.println("sum: "+ Arrays.stream(arr).sum());
    }
}
