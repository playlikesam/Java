package arraylists;
import java.util.ArrayList;
public class basicsofArrayLists {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);

        //Printing using the name of the array :

        System.out.println(arr); //This will display the loop in a beautiful manner.

        //Manually printing using loops :

        for (int i=0; i<6; i++){
            System.out.print(arr.get(i) + " "); //this will print the array with one space between each element.
        }
    }
}
