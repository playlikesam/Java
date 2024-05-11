package loops_part2;
import javax.security.sasl.SaslClient;
import java.util.Scanner;
import java.util.SequencedSet;

public class WAPprintSumofDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Wap to print sum of digits of a given number.

        System.out.println("Enter n :");
        int n = sc.nextInt();

        int sum=0;
        while (n!=0){
            int a = n%10;
            sum = sum+a;
            n = n/10;
        }
        System.out.println(sum);

    }

}
