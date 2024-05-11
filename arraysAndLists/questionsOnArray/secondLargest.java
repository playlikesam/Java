package questionsOnArray;
import java.util.Scanner;
public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();

        System.out.print("Enter Elements : ");
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for (int i=1; i<n; i++){
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println("Largest value is : " + max);

        int smax = Integer.MIN_VALUE;
        for (int i=1; i<n; i++){
            if (arr[i]!=max) {
                smax = arr[i];
            }
        }
        System.out.println("Second Largest value is : " + smax);
    }
}
