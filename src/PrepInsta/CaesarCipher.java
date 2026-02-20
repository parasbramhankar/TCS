package PrepInsta;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter String: ");
        String str= scanner.nextLine();

        System.out.println("Enter the key :");
        int key=scanner.nextInt();

        if(key<0){
            System.out.println("Invalid input");
            System.exit(0);
        }

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str.length();i++){

            char c=str.charAt(i);
            char ch='\0';

            if(Character.isLetterOrDigit(c)){
                if(Character.isLetter(c)){
                    if(Character.isUpperCase(c)){
                        ch= (char) ((c-'A'+ key)%26+'A');
                    }else {
                        ch=(char)((c-'a'+key)%26+'a');
                    }
                }else if(Character.isDigit(c)){
                    ch=(char)((c-'0'+key)%10+'0');
                }
            }else{
                ch=c;
            }
            sb.append(ch);
        }

        System.out.println(sb.toString());

    }

}
