package quesOn2Darr;
import java.util.Scanner;
public class takingIPfrmUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int m = sc.nextInt();
        System.out.println("Enter cols : ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        System.out.println("now Enter the elements : ");

        //Inputs :
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("2D array is :");

        //Outputs :
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
