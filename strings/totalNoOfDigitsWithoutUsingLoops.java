package strings;
import java.util.Scanner;
public class totalNoOfDigitsWithoutUsingLoops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        String s = n + "";

        //also we can use IntegerToString() function :

        System.out.println("Total no of digits are : ");
        System.out.println(s.length());
    }
}