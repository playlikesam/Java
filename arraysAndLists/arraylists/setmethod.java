package arraylists;

import java.util.ArrayList;

public class setmethod {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(3);
        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);
        System.out.println("Size of array is : " + arr.size()); // Prints the size of the array.
        System.out.println(arr);
        arr.set(1,30); // sets the value 30 in index 1.
        System.out.println(arr);
        arr.add(80); // adds an extra element in the array as it is dynamic and capacity can be modified.
        System.out.println(arr);
        System.out.println("Now Size of array is : " + arr.size()); //Prints the size of the array.
    }
}
