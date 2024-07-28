package StringBuilder;
import java.util.Scanner;
public class takinginputInStringBuilders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println("string entered = "+sb);

        sb.setCharAt(1,'c'); //it will change the characters in index.
        System.out.println("char setted string = "+sb);
    }
}