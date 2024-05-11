package quesOn2Darr;
import java.util.Scanner;
public class foreachloopin2D {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6}};

        //printing with for each loop :
        for (int[] ele : a){
            for (int x : ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

