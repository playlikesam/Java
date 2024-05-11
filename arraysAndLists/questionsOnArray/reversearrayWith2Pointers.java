package questionsOnArray;
import java.util.Arrays;
public class reversearrayWith2Pointers {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7};
//        int n = arr.length;
//
//        for (int ele : arr){
//            System.out.print(ele + " ");
//        }
//        System.out.println();
//
//        //reversing array :
//
//        for (int i=0; i<n; i++) {
//            int j = n-1-i;
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            if (arr[i] == arr[j]){
//                break;
//            }
//        }
//        for (int ele : arr){
//            System.out.print(ele + " ");
//        }
//        System.out.println();
//    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        int i=0, j=n-1;
        while (i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

}
