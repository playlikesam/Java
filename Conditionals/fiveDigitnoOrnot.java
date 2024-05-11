package Conditionals;
import java.util.Scanner;
public class fiveDigitnoOrnot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if (n>9999 && n<100000){
            System.out.println("It is a 5 digit number.");
        }
        else System.out.println("No it is not a five digit number.");
    }
}
