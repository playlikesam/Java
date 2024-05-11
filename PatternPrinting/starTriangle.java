package PatternPrinting;
import java.util.Scanner;
public class starTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){ //rows
            for (int j=1; j<=i; j++){ //Cols
                System.out.print("*"+" "); //without ln
            }
            System.out.println();
        }
    }
}
