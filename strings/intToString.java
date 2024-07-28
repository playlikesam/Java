package strings;
import java.util.Scanner;
public class intToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an int : ");
        int i = sc.nextInt();
        String s = i+"";

        System.out.println("The converted int to string is : ");
        System.out.println(s);
    }
}
