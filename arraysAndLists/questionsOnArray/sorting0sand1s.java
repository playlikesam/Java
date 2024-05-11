package questionsOnArray;
import java.util.Arrays;
public class sorting0sand1s {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 0};
        int n = arr.length;
        System.out.print("Array : ");
        //method one : by using arrays.sort technique
//        Arrays.sort(arr);
//
//        for (int ele : arr){
//            System.out.print(ele + " ");
//        }
//        System.out.println();

        //method two :
        int noOfZeroes = 0;
        for (int i=0; i<n; i++){
            if (arr[i]==0) noOfZeroes++;
        }
        for (int i=0; i<n; i++){
             if (i<noOfZeroes) arr[i] = 0;
             else arr[i] = 1;
        }
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}

