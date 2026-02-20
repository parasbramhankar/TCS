package PrepInsta;

import java.util.HashMap;
import java.util.Scanner;

public class OddBallons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers of balloons: ");
        int n = scanner.nextInt();

        char[] balloons = new char[n];

        System.out.println("Enter the balloons' colour: ");

        for (int i = 0; i < n; i++) {
            balloons[i] = scanner.next().charAt(0);
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : balloons) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char ans = '0';

        for (int i = 0; i < n; i++) {
            int ele = map.get(balloons[i]);

            if (ele % 2 != 0) {
                ans = balloons[i];
                break;
            }
        }

        if (ans != '0'){
            System.out.println("Odd colour: " + ans);
        }else{
            System.out.println(" all are even");
        }
    }
}
