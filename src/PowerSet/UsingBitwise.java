package PowerSet;

import javax.security.sasl.SaslClient;

public class UsingBitwise {
    public static void main(String[] args) {
        String str="abcd";

        int n=str.length();

        int pSize=(int)Math.pow(2,n);

        for(int i=0;i<pSize;i++){

            for(int j=0;j<n;j++){

                if((i & (1<<j))!=0){
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }



    }
}
