package Conditionals;
import java.util.Scanner;
public class Origin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x : ");
        int x = sc.nextInt();
        System.out.print("Enter value of y : ");
        int y = sc.nextInt();

        if (x>0 && y>0) System.out.println("Lies in 1st Quadrant.");
        else if (x>0 && y<0) System.out.println("Lies in 2nd Quadrant.");
        else if (x<0 && y<0) System.out.println("Lies in 3rd Quadrant.");
        else System.out.println("Lies in 4th Quadrant.");
    }
}
