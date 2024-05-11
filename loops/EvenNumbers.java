package loops;
import java.util.Scanner;
public class EvenNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //For even numbers :
//        for (int i = 0; i<=100; i++){
//            if (i%2==0) System.out.println(i);
//        }

        //For Odd Numbers :
        for (int i = 1; i<=100; i++){
            if (i%2!=0) System.out.println(i);
        }
    }
}
