package strings;
public class containsandstartswith {
    public static void main(String[] args) {
        String s = "raghav";
        //the answer of functions contains() and startsWith() will be true of false only/-

        System.out.println(s.startsWith("rsgsga"));  //false
        System.out.println(s.startsWith("ra"));      //true

        System.out.println(s.contains("a")); //true
    }
}
