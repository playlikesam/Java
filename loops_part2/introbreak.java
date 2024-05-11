package loops_part2;

import java.util.Scanner;

public class introbreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Break is used to terminate the loops.

        //WAP to check if a number is composite or not.
        //Composite meaning : the number which has more than one factors.

        System.out.print("Enter the n :");
        int n = sc.nextInt();

        for (int i=2; i<=n-1; i++){
            if (n%i==0) {
                System.out.println("Yes, it's a composite number.");
                break;
            }
            else System.out.println("No.");
            break;
        }

    }
}
