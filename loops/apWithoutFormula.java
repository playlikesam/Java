package loops;
import java.util.Scanner;
public class apWithoutFormula {
    public static void main(String[] args){
        //Without applying the formula.
        //Ap will be : 4,7,10,13,16.....
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 4;
        for (int i = 1; i<=n ; i++){
            System.out.println(a);
            a += 3;
        }
    }
}
