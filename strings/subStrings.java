package strings;
import java.util.Scanner;
public class subStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Substrings : \n");

        String s = "abcd";
        s = s.substring(1);
        System.out.println(s);

        String a = "Saransh";
        a = a.substring(1,4);
        System.out.println(a);
    }
}
