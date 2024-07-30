package basicSortingAlgorithmsAndQuestions;

import java.util.Arrays;

public class bubbleSortAlogrithm {
    public static void print(int[] arr){
        System.out.print("array : ");
        for (int ele : arr){
            System.out.print(ele + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4};
//        Arrays.sort(arr); //this is method
        for (int i=0; i<arr.length-1; i++){
            if (arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        print(arr);
    }
}
