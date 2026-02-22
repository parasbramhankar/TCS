package PrepInsta;
/*
Problem Statement

FULLY AUTOMATIC VENDING MACHINE – dispenses your cuppa on just press of button. A vending machine can serve range of products as follows:

Coffee
    Espresso Coffee
    Cappuccino Coffee
    Latte Coffee
Tea
    Plain Tea
    Assam Tea
    Ginger Tea
    Cardamom Tea
    Masala Tea
    Lemon Tea
    Green Tea
    Organic Darjeeling Tea
Soups
    Hot and Sour Soup
    Veg Corn Soup
    Tomato Soup
    Spicy Tomato Soup
Beverages
    Hot Chocolate Drink
    Badam Drink
    Badam-Pista Drink
Write a program to take input for main menu & sub menu and display the name of sub menu selected in the following format (enter the first letter to select main menu):

Welcome to CCD
Enjoy your
Example 1:

Input:
c
1
Output
Welcome to CCD!
Enjoy your Espresso Coffee!

Example 2:
Input:
t
9
Output
INVALID INPUT


 */
import java.util.*;

public class VendingMachine {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        char choice=sc.next().toUpperCase().charAt(0);
        int subMenu=sc.nextInt();

        String result;

        switch(choice){
            case 'C':
                switch(subMenu){
                    case 1:result="Espresso Coffee"; break;
                    case 2:result="Cappuccino Coffee";break;
                    case 3:result="Latte Coffee";break;
                    default:result="Invalid Input"; break;
                }

                break;
            case 'T':
                switch(subMenu){
                    case 1:result="Plain Tea"; break;
                    case 2:result="Assam Tea"; break;
                    case 3:result="Ginger Tea"; break;
                    case 4:result="Cardamom Tea";break;
                    case 5:result="Masala Tea"; break;
                    case 6:result="Lemon Tea";break;
                    case 7:result="Green Tea";break;
                    case 8:result="Organic Darjeeling Tea";break;
                    default:result="Invalid Input";
                }
                break;
            case 'S':
                switch(subMenu){
                    case 1:result="Hot and Sour Soup"; break;
                    case 2:result="Veg Corn Soup"; break;
                    case 3:result="Tomato Soup"; break;
                    case 4:result="Spicy Tomato Soup";break;
                    default:result="Invalid Input";
                }
                break;
            case 'B':
                switch(subMenu){
                    case 1:result="Hot Chocolate Drink"; break;
                    case 2:result="Badam Drink"; break;
                    case 3:result="Badam-Pista Drink"; break;
                    default:result="Invalid Input";
                }
                break;

            default: result="Invalid Input";
                break;
        }

        if(result.equals("Invalid Input")){
            System.out.print("Invalid Input");
        }else{
            System.out.println("Welcome to CCD!");
            System.out.println("Enjoy your "+result);
        }

        sc.close();
    }
}

