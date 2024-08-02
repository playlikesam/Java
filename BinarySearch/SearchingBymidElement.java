package BinarySearch;
import java.util.Scanner;
public class SearchingBymidElement {
    public static void print(int[] arr){
        System.out.print("Array : ");
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //Enter a sorted array else binary search will not work;
        int[] arr = {10,15,21,34,81, 105, 180, 500, 614};
        print(arr);
        Scanner sc = new Scanner(System.in);
        System.out.print("Target : ");
        int target = sc.nextInt();
        int n = arr.length;
        int lo = 0, hi = n-1;
        boolean flag = false; //not present.
        while (lo<=hi){
            int mid = (lo+hi)/2;
            if (arr[mid]==target){
                flag = true; break;
            }
            else if (arr[mid]>target) hi=mid-1;
            else if (arr[mid]<target) lo=mid+1;
        }
        if (flag==true) System.out.println("Target Found");
        else System.out.println("Target not Found");
    }
}