package introduction;
import java.util.Scanner;
public class initializationArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Size of array :
        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();

        //array declaration :
        int[] arr = new int[n];
        System.out.println("Enter values in the array : ");

        //Taking inputs :
        for (int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }

        //Printing outputs :
        System.out.println("Outputs are : ");
        for (int i=0; i<=n-1; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
