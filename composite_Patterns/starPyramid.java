package composite_Patterns;
import java.util.Scanner;
public class starPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++){ //For spaces
                System.out.print(" " + " ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}
