package loops_part2;
import java.util.Scanner;
public class dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while (i<=10);
    }
}
