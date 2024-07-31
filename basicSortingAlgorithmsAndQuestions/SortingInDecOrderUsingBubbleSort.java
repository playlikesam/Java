package basicSortingAlgorithmsAndQuestions;
public class SortingInDecOrderUsingBubbleSort {
    public static void print(int[] arr){
        System.out.print("Array : ");
        for (int ele :  arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args){
        int[] arr = {3,1,2,5,4};
        int n = arr.length;
        print(arr); //non sorted
        for (int x=1; x<n; x++){
            for (int i=0; i<n-1; i++){
                if (arr[i]<arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
            print(arr);//sorted
        }
    }
}
