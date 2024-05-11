package Conditionals;
import java.util.Scanner;
public class GradeOfStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Student : ");
        int n = sc.nextInt();
        if (n>81 && n<=100) System.out.println("very good");
        else if (n>100) System.out.println("Marks cannot exceed to 100.");
        else if (n>61 && n<80) System.out.println("good");
        else if (n>41 && n<60) System.out.println("average");
        else System.out.println("fail");

    }
}
