package StringBuilder;
import java.util.Scanner;
public class usingInsertAndDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println("Entered String : "+sb);
        sb.deleteCharAt(1); //this will delete char present at certain index
        System.out.println("remaining String : "+sb);

        sb.append(" Good Morning");
        sb.delete(2,6);
        System.out.println("after deleted String"+sb);

        sb.insert(1, 23);
        System.out.println("Inserted String : "+sb);
    }
}
