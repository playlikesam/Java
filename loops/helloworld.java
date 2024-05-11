package loops;
import java.util.Scanner;
public class helloworld {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n :");
        int n = sc.nextInt();
        int i;
        for (i=1;i<=n;i++){
            System.out.println("Hello World");
        }
    }
}
