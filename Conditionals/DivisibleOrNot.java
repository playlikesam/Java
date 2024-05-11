package Conditionals;
import java.util.Scanner;
public class DivisibleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        double n = sc.nextInt();
        if (n%5 == 0){
            System.out.println("The number is divisible by 5");
        }
        else {
            System.out.println("No it's not divisible by 5");
        }
    }
}
