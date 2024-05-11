package loops;
import java.util.Scanner;
public class hwGP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many terms : ");
        int n = sc.nextInt();

        //GP: 3,12,48,.....

        int a = 3;
        for (int i=1; i<=n; i++){
            System.out.println(a);
            a *= 4;
        }
    }
}
