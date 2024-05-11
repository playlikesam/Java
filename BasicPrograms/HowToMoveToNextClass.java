package BasicPrograms;

public class HowToMoveToNextClass {
    public static void main(String[] args) {
        System.out.print("This is First Line");
        System.out.print("This is also First Line");

//        In the Above Line "ln" is not Written, and that is why it is not moved to second line.

        System.out.println("This is Second Line");
        System.out.println("This is Third Line");

//        In the Above Line "ln" is not Written, and that is why it is not moved to second line.

        System.out.println("This is 4th line\n");
        System.out.println("This is 5th line");

//        the above line is written with backslash, so it will print the above 2 in different lines
    }
}
