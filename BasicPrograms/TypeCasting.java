package BasicPrograms;
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = (double)x; //typecasting
        System.out.println(y/2);
    }
}
