package strings;
public class lowerUpperCase {
    public static void main(String[] args) {
        String s = "Raghav garg";
        s.toLowerCase(); // This cannot print lowercase alphabet, until we store it to a new variable
        String a = s.toLowerCase();
        System.out.println(a); //this will also print lower alphabets.
        System.out.println(s.toLowerCase()); // This can print lower alphabets.
        System.out.println(s); //this will not print the correct output.


        //now uppercase :
        System.out.println("Uppercase");
        System.out.println(s.toUpperCase());


        //now concatenation:
        System.out.println("Concatenation :");
        String b = "xyz";
        String c = "abc";
        String d = b.concat(c);
        System.out.println(d);
    }
}
