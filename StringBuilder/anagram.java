package StringBuilder;
import java.util.Arrays;
import java.util.Scanner;
public class anagram {
    public static void main(String[] args) {
        boolean t = true;
        boolean f = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1 : ");
        String s = sc.nextLine();
        System.out.print("Enter String 2 : ");
        String str = sc.nextLine();

        char[] a = s.toCharArray();
        char[] b = str.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i=0; i<a.length; i++){
            if (a[i]!=b[i]) System.out.println("False");
        }
        System.out.println("true");
    }
}
