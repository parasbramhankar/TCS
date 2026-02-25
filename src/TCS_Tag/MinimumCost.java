package TCS_Tag;

import java.util.PriorityQueue;
import java.util.Scanner;

/*
Given N gold wires, each wire has a length associated with it. At a time, only two adjacent small wres
assembled at the end of a large wire and the cost of forming is the sum of their length. Find the minimum
cost when all wires are assembled to form a single wire.
For Example:
Suppose, Arr[] = {7, 6, 8, 6, 1, 1}
{7, 6, 8, 6, 1, 1} - {7, 6, 8, 6, 2}, cost = 2
{7, 6, 8, 6, 2} - {7, 6, 8, 8}, cost = 8
{7, 6, 8, 8} - {13, 8, 8}, cost =13
{13, 8, 8} - {13, 16}, cost = 16
{13, 16} - {29}, cost = 29
2 + 8 + 13 + 16 + 29 = 68
Hence, the minimum cost to assemble all gold wires is : 68

 */
public class MinimumCost {

    public static int findTheMinimumCost(int[]arr){
        int n=arr.length;

        PriorityQueue<Integer>minHeap=new PriorityQueue<>();

        for(int i=0;i<n;i++){
            minHeap.add(arr[i]);
        }

        int totalCost=0;

        while(minHeap.size()>1){
            int ele1=minHeap.poll();
            int ele2=minHeap.poll();

            int merge=ele1+ele2;
            totalCost+=merge;

            minHeap.add(merge);
        }

        return totalCost;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();

        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }

        int sum=findTheMinimumCost(arr);

        System.out.println("Minimum sum: "+sum);
    }
}
