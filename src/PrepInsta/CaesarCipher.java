package PrepInsta;


import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str= scanner.nextLine();

        System.out.println("Enter key: ");
        int key=scanner.nextInt();

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                if(Character.isLetter(ch)){
                    if(Character.isUpperCase(ch)){
                        ch=(char)((ch-'A'+key)%26+'A');
                    }else{
                        ch=(char)((ch-'a'+key)%26+'a');
                    }
                }else{
                    ch=(char)((ch-'0'+key)%10+'0');
                }
                sb.append(ch);
            }else{
                sb.append(ch);
            }
        }

        System.out.println(sb.toString());

    }

}
