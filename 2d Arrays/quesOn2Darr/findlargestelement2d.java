package quesOn2Darr;
import java.util.Scanner;
public class findlargestelement2d {
//    public static void main(String[] args) {
//        int[][] arr = {{1,5,6},{2,-9,3},{5,10,3}};
//        int mx = Integer.MIN_VALUE;
//        int m = arr.length;
//        int n = arr[0].length;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n ; j++) {
//                mx = Math.max(mx,arr[i][j]);
//            }
//        }
//        System.out.println(mx);
//    }


    //now for finding minimum : Homework;
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int mx = Integer.MAX_VALUE;
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mx = Math.min(mx, arr[i][j]);
            }
        }
        System.out.println(mx);
    }
}
