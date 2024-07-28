package strings;
import java.util.Scanner;
public class charAtandlength {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter name");
        s = sc.nextLine();
        System.out.println(s.charAt(2)); // charAt() is used to print the characters present in the given str
        //expected output will be :
        // Saransh
        // 0123456
        // 2 : r
        System.out.println(s.length()); //.length() is used to print the length.
        //basically string is also an array.
    }

}
