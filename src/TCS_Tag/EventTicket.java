package TCS_Tag;

import java.util.Scanner;

public class EventTicket {
    public static String function(String str){
        str=str.replace("EF","");
        str=str.replace("56","");
        str=str.replace("G","");

        return str;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str= scanner.next();

        String ans=function(str);
        System.out.println(ans);
    }
}
