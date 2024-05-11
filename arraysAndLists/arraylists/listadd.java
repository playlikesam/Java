package arraylists;
import java.util.ArrayList;
public class listadd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + " " + list.size());
        list.add(10);
        System.out.println(list + " " + list.size());
        list.add(20);
        System.out.println(list + " " + list.size());
        list.add(30);
        System.out.println(list + " " + list.size());
        list.add(50);
        System.out.println(list + " " + list.size());
        list.remove(0);
        list.remove(1);
        System.out.println(list + " " + list.size());
        list.add(0,2);
        System.out.println(list + " " + list.size());

    }
}
