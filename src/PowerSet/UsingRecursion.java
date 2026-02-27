package PowerSet;

import java.util.Scanner;

public class UsingRecursion {

    public static void findSubset(String str,String s,int i){
        if(i==str.length()) {
            System.out.println(s);
            return;
        }

        findSubset(str,s,i+1);
        findSubset(str,s+str.charAt(i),i+1);
    }
    public static void main(String[] args) {
        String str="abcd";
        findSubset(str,"",0);
    }
}
