package ArrayList2D;
import java.util.ArrayList;
import java.util.List;
public class init {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(40); b.add(50);
        List<Integer> c = new ArrayList<>();
        c.add(60); c.add(70);
        List<List<Integer>> l = new ArrayList<>();
        l.add(a); l.add(b); l.add(c);

//        for (int i = 0; i < l.size(); i++) {          // for printing the whole 2D arraylist in one go...
//            System.out.println(l.get(i));
//        }

//        System.out.println(l.get(1).get(1));          // for specific one ele printing



        for (int i = 0; i < l.size(); i++) {            // for printing the whole array manually using for loops
            List<Integer> x = l.get(i);
            for (int j = 0; j < x.size(); j++) {
                System.out.print(x.get(j) + " ");
            }
            System.out.println();
        }
    }
}
