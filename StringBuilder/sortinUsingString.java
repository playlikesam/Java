package StringBuilder;

import java.util.Arrays;

public class sortinUsingString {
    public static void main(String[] args) {
        String s = "saransh";
        char[] ch = s.toCharArray();
        for (char ele : ch){
            System.out.print(ele);
        }
        System.out.println();
        Arrays.sort(ch);
        System.out.print("Sorted char array : ");
        for (char ele : ch){
            System.out.print(ele);
        }
        System.out.println();

        //this is most important concept in string builders :

        StringBuilder sb = new StringBuilder("mishra");
        char[] arr = sb.toString().toCharArray();
        Arrays.sort(ch);
        System.out.println("Sorting in Stringbuilders : ");
        for (char mst : ch){
            System.out.print(mst);
        }
    }
}
