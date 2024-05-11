package questionsOnArray;
import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {

        //Inputs :

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Array Elements : ");
        for (int i=0; i<n; i++){
                arr[i] = sc.nextInt();
        }

        System.out.print("Enter Target Element : ");
        int x = sc.nextInt();

        //Solution :
        boolean flag = false; //False means not found.
        for (int i=0; i<n; i++){
            if (arr[i]==x){
                flag = true;
                break;
            }
        }
        if (flag==true){
            System.out.println("Element Found");
        }
        else System.out.println("Element not Found");
    }
}
