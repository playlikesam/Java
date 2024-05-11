package questionsOnArray;
import java.util.Scanner;
public class largestValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an Array : ");
        int n = sc.nextInt();

        System.out.println("Enter the elements in Array : ");
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (int i=1; i<n; i++){
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println("Largest value is : " + max);
    }
}
