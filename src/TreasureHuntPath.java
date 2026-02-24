/*
🏴‍☠️ Treasure Hunt – Story Based Problem
A pirate named Arjun is searching for a hidden treasure on a mysterious island.
The island is represented as a 2D coordinate plane. Arjun starts his journey at position (0, 0).
He receives a secret instruction string from an old map.
Each character in the string represents a movement:
'U' → Move 1 step North (Up)
'D' → Move 1 step South (Down)
'L' → Move 1 step West (Left)
'R' → Move 1 step East (Right)
Arjun follows the instructions one by one in the exact order given.

Given the instruction string:
Determine Arjun’s final position on the island.
Calculate how far he is from his starting point using Manhattan Distance.
Determine whether he returned back to the starting point.
If the instruction contains any character other than 'U', 'D', 'L', or 'R', print "Invalid Instructions".

 */

import java.util.Arrays;
import java.util.Scanner;

public class TreasureHuntPath {

    public static int[] findTheCoordinates(String str){
        int x=0;
        int y=0;

        if(str.isEmpty()){
            return new int[]{0,0};
        }

        for(char ch:str.toCharArray()){
            switch (ch){
                case 'U'->y++;
                case 'D'->y--;
                case 'R'->x++;
                case 'L'->x--;
            }
        }

        return new int[]{x,y};
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String str= scanner.next();

        int[]coordinates=findTheCoordinates(str);

        System.out.println(Arrays.toString(coordinates));
    }
}
