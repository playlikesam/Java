package Conditionals;
import java.util.Scanner;
public class YougestOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of Ram : ");
        int ram = sc.nextInt();
        System.out.print("Enter age of Shyam : ");
        int shyam = sc.nextInt();
        System.out.print("Enter age of Ajay : ");
        int ajay = sc.nextInt();

        if (ram<shyam && ram<ajay) System.out.println("Ram is Youngest.");
        else if (shyam<ram && shyam<ajay) System.out.println("Shyam is Youngest.");
        else System.out.println("Ajay is Youngest.");
    }
}
