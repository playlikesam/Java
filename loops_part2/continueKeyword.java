package loops_part2;
import java.util.Scanner;
public class continueKeyword {
    public static void main(String[] args) {

        //Continue keyword is used to skip the particular iterations.
        //Wap to print odd numbersfrom one to 100.

        //100 iterations
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) System.out.println(i+" ");
//        }
//
//        //50 iterations
//        for (int i = 1; i <= 100; i+=2) {
//            if (i % 2 == 0) System.out.println(i+" ");
//        }

        //100 iterations(continue keyword)
        for (int i = 1; i <= 100; i+=2) {
            if (i % 2 == 0) continue;
            System.out.println(i+" ");
        }

    }
}
