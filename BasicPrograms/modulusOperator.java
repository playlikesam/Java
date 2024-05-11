package BasicPrograms;
import java.util.Scanner;
public class modulusOperator {
    public static void main(String[] args) {
        // % is considered as a modulus operator.
        // a % b = when a is divided by b, it gives a remainder.


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Modulus(Remainder) of and b :");
        System.out.println(a%b);
    }
}

//Important properties of modulus:
// 1. a % b  = a  (a<b).
// 2. a % (-b) = a % b (No Change).
// 3. (-a) % b = -(a % b).
