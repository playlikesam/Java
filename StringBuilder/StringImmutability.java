package StringBuilder;
public class StringImmutability {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s);
        s = s.substring(0,2) + 'y' + s.substring(3);
        System.out.println(s);
    }
}
