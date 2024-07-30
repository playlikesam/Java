package basicSortingAlgorithmsAndQuestions;
public class checkArrayisSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,7,15,23,32,44};
        int n = arr.length;
        boolean flag = true;
        for(int i=0; i<n-1; i++){
            if (arr[i]>arr[i+1]){
                flag = false; //it means array is unsorted.
                break;
            }
        }
        if (flag==true) System.out.println("sorted");
        else System.out.println("unsorted");
    }
}
