package arraylists;

import java.util.Arrays;

public class builtinMethods {
    public static void main(String[] args) {
        int[] arr = {30,10,40,23,89,34};
//        for (int i=0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        Arrays.sort(arr);
//        System.out.println();
//        for (int i=0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

        for (int x : arr){
            System.out.print(x + " ");
        }
        Arrays.sort(arr);
        System.out.println();
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
