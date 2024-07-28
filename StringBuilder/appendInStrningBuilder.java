package StringBuilder;
import java.util.Scanner;
public class appendInStrningBuilder {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("sam");
        sb.append("max");
        System.out.println(sb); //this will add max to sam

        char[] ch = {'s','a','m'};
        sb.append(ch);
        System.out.println(sb);

        StringBuilder t = new StringBuilder("pqr");
        sb.append(t);
        System.out.println(sb);
    }
}
