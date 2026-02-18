package BitManipulation;

import java.util.Scanner;

public class SwapTheNeighbouringBIts {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int num= scanner.nextInt();

        int ans=(num & 0xAAAAAAAA)>>1 | (num & 0x55555555)<<1;

        System.out.println(ans);
    }
}
