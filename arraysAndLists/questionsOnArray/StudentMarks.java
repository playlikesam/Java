package questionsOnArray;
import java.util.Scanner;
public class StudentMarks {
    public static void main(String[] args){
        int[] arr = {88,35,25,15,75,5,62,45,34,3,78};
        int n = arr.length;
        for (int i=0; i<=n-1; i++){
            if (arr[i]<35) System.out.println("Roll Number " + i + " gets " + arr[i] + " marks which is less than 35 ");
//            else System.out.println(arr[i] + " This Student is above 35 marks. ");
        }
    }
}
