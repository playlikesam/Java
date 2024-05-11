package Conditionals;
import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args) {
        //Find out 'n' is even or odd using ternary operator.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        //Syntax for Ternary Operator :
        //Condition ? if true : if false

        System.out.println((n%2==0) ? "Even number" : "Odd number");

        //this one statement is used for even and odd.
    }
}
