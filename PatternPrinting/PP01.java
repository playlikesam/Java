package PatternPrinting;
import java.util.Scanner;
public class PP01 {
    public static void main(String[] args){

//        Printing a 4x5 Rectangle.
//        for (int i=1; i<=4; i++){  //This loop Controls number of Rows.
//            System.out.println("*****"); //here we aren't using cols.
//        }


//        // This is the second method
//        for (int i=1; i<=3; i++){
//            for (int j=1; j<=5; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        // This is the Third method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m : ");
        int m = sc.nextInt();
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        for (int i=1; i<=m; i++){
            for (int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
