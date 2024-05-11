package arraylists;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class copyofa {
    public static void main(String[] args) {
        int[] arr = {12,45,67,6,77,6};
        System.out.print("arr : ");
        for (int element : arr){
            System.out.print(element + " ");
        }
        System.out.println();

        int[] nums = arr; //this is shallow copy
        nums[0] = 70;
        System.out.print("nums : " + arr[0]);

        System.out.println();

        int[] brr = Arrays.copyOf(arr, arr.length);
        brr[0] = 70;
        System.out.println("brr : " + arr[0]);

        System.out.println();

        int[] crr = new int[arr.length];
        for (int i=0; i<arr.length; i++){
            crr[i] = arr[i];
        }
        crr[0] = 100;
        System.out.println(arr[0]);


    }

}
