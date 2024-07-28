package StringBuilder;
public class useOfStringBuilder {
    public static void main(String[] args) {
        String s = "saransh";
        System.out.println(s);
        StringBuilder sb = new StringBuilder("sam"); //this is String
        System.out.println(sb.length());


        StringBuilder sa = new StringBuilder(20); //this is capacity.
        s = "Saransh Mishra";
        System.out.println(s);
    }
}
