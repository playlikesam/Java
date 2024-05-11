package loops;
import java.util.Scanner;
public class arithmeticProgression {
    public static void main(String[] args) {
        //This is for AP :
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n :");
        int n = sc.nextInt();
        //terms means the count of loops
        // 1 3 5 7 9.....n
        // an = a + (n-1)d
        for (int i = 1; i<=2*n-1; i+=2){
            System.out.println(i);
        }
    }
}
