package recursion;


public class TowerOfHanoi {
    static void towerOfHanoi(int n,char A,char B,char C){
        if(n==1){
            System.out.println("Move 1 From "+A+" to "+C);
            return;
        }
        towerOfHanoi(n-1,A,C,B);
        System.out.println("Move "+n+" from "+A+ " to "+C);
        towerOfHanoi(n-1,B,A,C);
    }

    public static void main(String[] args) {

        int n=3;

        towerOfHanoi(n,'A','B','C');
    }
}
