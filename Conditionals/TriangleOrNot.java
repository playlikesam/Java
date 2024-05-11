package Conditionals;
import java.util.Scanner;
public class TriangleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the three sides : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a+b>c && b+c>a && a+c>b){
            System.out.println("Yes it is a Triangle.");
        }
        else System.out.println("not a triangle.");
    }

}
//    Conditions for anything to be a triangle :
// 1. a+b>c.
// 2. b+c>a.
// 3. a+c>b.