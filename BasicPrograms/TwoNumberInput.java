package BasicPrograms;
import java.util.Scanner;
public class TwoNumberInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
//        int c = a+b;
        System.out.println("The addition of two numbers :"+(a+b));
    }
}
