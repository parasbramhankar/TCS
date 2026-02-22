package PrepInsta;

import java.util.Scanner;

public class TotalIncomeOfDoctor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalIncome = 0;

        for (int i = 0; i < 20; i++) {

            String age= scanner.nextLine();

            if(age.isEmpty()){
                break;
            }

            int a=Integer.parseInt(age);

            if(a<=0 || a>120){
                System.out.println("Invalid Input");
                return;
            }

            if(a>0 && a<17){
                totalIncome+=200;
            }else if(a>=17 &&  a<=40){
                totalIncome+=400;
            }
            else if(a>40 && a<=120){
                totalIncome+=300;
            }
        }

        System.out.println("Total income: " + totalIncome + " INR");
        scanner.close();
    }
}

