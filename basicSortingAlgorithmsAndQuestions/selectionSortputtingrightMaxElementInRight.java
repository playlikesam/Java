package basicSortingAlgorithmsAndQuestions;
public class selectionSortputtingrightMaxElementInRight {
    public static void print(int[] arr){
        System.out.println("Array : ");
        for (int ele : arr){
            System.out.print(ele);
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){
        int[] arr = {3,5,1,4,2};
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            int max = Integer.MAX_VALUE;
            int maxind = -1;
            for (int j=n; j<i; j--){
                if (arr[j]>max){
                    max = arr[j];
                    maxind = j;
                }
            }
            swap(arr, i, maxind);
        }
        print(arr);
    }
}
