package Conditionals;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Write a program to create a calculator that performs basic arithmetic opertations
        //using switch case and functions. The calculator should input two numbers and an operator
        //from user.

//        It's done with If-else statements :
//        int a = sc.nextInt();//num 1
//        char op = sc.next().charAt(0);//input for operator
//        int b = sc.nextInt();//num 2
//
//        if (op=='+') System.out.println(a+b);
//        if (op=='-') System.out.println(a-b);
//        if (op=='*') System.out.println(a*b);
//        if (op=='/') System.out.println(a/b);

        //now from switch case :

        int a = sc.nextInt();
        char op = sc.next().charAt(0);
        int b = sc.nextInt();
        switch (op){
                case '+':
                System.out.println(a+b);
                break;
                case '-':
                System.out.println(a-b);
                break;
                case '*':
                System.out.println(a*b);
                break;
                case '/':
                System.out.println(a/b);
                break; //break is used for exiting from the loop.

            default:
                System.out.println("Invalid Operator.");
        }
    }
}
