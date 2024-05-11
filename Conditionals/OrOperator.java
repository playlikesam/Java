package Conditionals;
import java.util.Scanner;
public class OrOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if (n%5==0 || n%3==0){
            System.out.println("It is divisible by 3 or 5.");
        }
        else System.out.println("no it is not.");
    }
}
