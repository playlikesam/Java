package quesOn2Darr;
import java.util.Scanner;
public class Q1_storeRollNoAndMarksof4Students {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][2];

        System.out.println("Enter Roll numbers along with marks :" );
        //inp:
        for (int i=0; i<arr.length;i++){
            for (int j=0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //out:
        for (int[] ele : arr){
            for (int x : ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
