package loops;
import java.util.Scanner;
public class tableof19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number :");
//        int n = sc.nextInt();
        for (int i = 1; i<=190; i++){
            if (i%19 == 0) System.out.println(i);
        }

    }
}
