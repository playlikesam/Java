package PatternPrinting;
import java.util.Scanner;
public class NumberSq {
    public static void main(String[] args){
        //Number Square :
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value : ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){ // rows
            for (int j=1; j<=n; j++){ // Cols
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}
