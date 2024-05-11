package loops_part2;
import java.util.Scanner;
public class PrimeOrnot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n :");
        int n = sc.nextInt();
        int x = 0;
        for (int i=2; i<=n-1; i++){
            if (n%i==0) {
                System.out.println("composite number.");
                x = 1;
                break;
            }
            if (n==1) {
                System.out.println("Neither Prime nor composite");
                break;
            }
            else {
                System.out.println("Prime number.");
                break;
            }

        }
    }
}
