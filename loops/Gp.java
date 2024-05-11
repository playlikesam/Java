package loops;
import java.util.Scanner;
public class Gp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n :");
        int n = sc.nextInt();

        //Display GP : 1,2,4,8,16
        int a = 1;
        for (int i=1; i<=n; i++){
            System.out.println(a);
            a = a*2; //Or a *= 2;
        }
    }
}
