package basicSortingAlgorithmsAndQuestions;
public class selectionSort {
    public static void print(int[] arr){
        System.out.print("Array : ");
        for (int ele : arr){
            System.out.print(ele + " ");
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {10,-4,20,1,-6,8};
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j=i; j<n; j++){
                if (arr[j]<min){
                    min = arr[j];
                    mindx = j;
                }
            }
            //swapping of first ele : arr[i] with selected minimum ele arr[mindx] :
            swap(arr, i, mindx);
        }
        //print method :
        print(arr);
    }
}
