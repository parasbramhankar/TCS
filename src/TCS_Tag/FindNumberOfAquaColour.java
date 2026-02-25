package TCS_Tag;

import java.util.Scanner;

public class FindNumberOfAquaColour {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str= scanner.next();
        int l=scanner.nextInt();


        int maxCount=Integer.MIN_VALUE;

        for(int i=0;i<str.length()-l;i+=l){
            int count=0;

            for(int j=i;j<i+l;j++){
                if(str.charAt(i)=='a'){
                    count++;
                }
            }
            if(count>maxCount){
                maxCount=count;
            }
        }

        System.out.println(maxCount);
    }
}
