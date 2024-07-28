package strings;
public class indexofandCompareto {
    public static void main(String[] args) {
        String s = "Saras";
        System.out.println(s.indexOf('r'));
        System.out.println(s.lastIndexOf('a'));

        //Compare to:
        //lexographical meaning is dictionary
        System.out.println("compare to :\n");

        String a = "abc";
        String b = "dbc";
        System.out.println(a.compareTo(b));
    }
}
