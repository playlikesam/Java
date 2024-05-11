package loops_part2;
import java.util.Scanner;
public class usingOperations {
    public static void main(String[] args){

        //WaP to Count digits of a given number.
        // n = 96858; answer should be 5.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();

        int count = 0;
        while (n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
