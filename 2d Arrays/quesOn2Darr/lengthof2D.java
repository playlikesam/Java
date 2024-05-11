package quesOn2Darr;
import java.util.Scanner;
public class lengthof2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][3];
        int m = arr.length;
        int n = arr[0].length;
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
