package Conditionals;
import java.util.Scanner;
public class PrintingAbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        //The thing we want to do here is making the negative ones positive and positive ones remains same.
        if (n<0) System.out.println(-n);
        if (n>0) System.out.println(n);
    }
}
