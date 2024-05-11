package loops_part2;
import java.util.Scanner;
public class infiniteloop {
    public static void main(String[] args) {
//        while ('a'<'b')
//            System.out.println("Malayalam is a palindrome");

        //HW :

//        int i = 10;
//        while (i=20)
//            System.out.println("A computer buff.");

        //HW 2 :

        int x=4, y=0;
        while (x>0){
            x--;
            y++;
            if (x==y)
                continue;
            else
                System.out.println(x+""+y);
        }

//        int x=1,y=2;
//        System.out.println(x+""+y);//this will concatenate the two numbers.
    }

}
