package basicSortingAlgorithmsAndQuestions;
public class CorrectBubbleSort {
    public static void print(int arr[]){
        System.out.print("Array : ");
        for (int ele : arr){
            System.out.print(ele + " ");
        }
    } //print method
    public static void main(String[] args) {
        int[] arr = {5,1,3,4,2};
        print(arr);
        System.out.println();
        int n = arr.length;
        for (int x=1; x<4; x++){
            for (int i=0; i<n-1; i++){
                if (arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        print(arr);
    }
}
