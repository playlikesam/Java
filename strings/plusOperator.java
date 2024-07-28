package strings;
public class plusOperator {
    public static void main(String[] args) {
        String s = "abc";
        s = s.concat("xyz");
        s = s + 10;
        s = s + 'z';
        s = 10 + s;
        System.out.println(s);
    }
}
