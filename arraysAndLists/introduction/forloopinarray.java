package introduction;
import java.util.Scanner;
public class forloopinarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7]; //initialization and memory allocation in array.

        //now if we want to enter 5 values, then we will take inputs on for loop :

        //Taking inputs :
        System.out.print("Enter values : ");
        for (int i=0; i<=6; i++){
            arr[i] = sc.nextInt();
        }

        //Printing Outputs :
        System.out.println("Outputs are : ");
        for (int i=0; i<=6; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
