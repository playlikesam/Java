package Conditionals;
import java.util.Scanner;
public class LogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter An Integer :");
        int n = sc.nextInt();
        if (n>99 && n<1000){
            System.out.println("it is a three digit number.");
        }
        else System.out.println("Not a three digit Number.");
    }
}