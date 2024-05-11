package PatternPrinting;
import java.util.Scanner;
public class squareprinting {
    public static void main(String[] args){
        //Square printing;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the sq : ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print("* "); //without ln.
            }
            System.out.println(); //with ln for changing the line.
        }
    }
}
