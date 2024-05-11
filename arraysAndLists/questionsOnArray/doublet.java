package questionsOnArray;
import java.util.Scanner;
import java.util.ArrayList;
public class doublet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int k = sc.nextInt();

        int[] arr = new int[k];
        System.out.println("Enter Elements : ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        int x = 9; //targeted sum
        int n=arr.length;
        for(int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if (arr[i] + arr[j]==x){
                    System.out.println(arr[i] + " " + arr[j]);
                    break;
                }
            }
        }
    }
}
