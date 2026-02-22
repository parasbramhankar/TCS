package PrepInsta.String;

import java.util.Scanner;

public class ChangeString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str1= scanner.next();
        String str2= scanner.next();
        String str3= scanner.next();
        
        if(str1.length()>5){
            System.out.println("Invalid input");
            return;
        }if(str2.length()>5){
            System.out.println("Invalid input");
            return;
        }if(str3.length()>5){
            System.out.println("Invalid input");
            return;
        }

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str1.length();i++){
            if("aeiou".indexOf(str1.charAt(i))>-1 || "AEIOU".indexOf(str1.charAt(i))>-1){
                sb.append('%');
            }else{
                sb.append(str1.charAt(i));
            }
        }
        for(int i=0;i<str2.length();i++){
            if("aeiouAEIOU".indexOf(str2.charAt(i))==-1 ){
                sb.append('#');
            }else{
                sb.append(str2.charAt(i));
            }
        }
        sb.append(str3.toUpperCase());

        System.out.println(sb.toString());

    }
}
