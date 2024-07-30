package basicSortingAlgorithmsAndQuestions;
public class bubbleSort3rdQues {
    public static void print(int arr[]){
        System.out.print("Array : ");
        for (int ele : arr) {
            System.out.print(ele);
        }
        System.out.println();
    }
    //this is the maximum passes of bubble sort.
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        print(arr);
//        for (int x=1; x<n; x++){
//            for (int i=0; i<n-1; i++){
//                if (arr[i]>arr[i+1]){
//                    int temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//                }
//            }
//        }

//        //this is the optimized code : bubble sort 2
//        for (int x=0; x<n-1; x++){
//            for (int i=0; i<n-1-x; i++){
//                if (arr[i]>arr[i+1]){
//                    int temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//                }
//            }
//        }

        //this is the optimized code : bubble sort 3 fully optimized;
        for (int x=0; x<n-1; x++){
            boolean flag = true;
            for (int i=0; i<n-1-x; i++){
                if (arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = false;
                }
            }
            if (flag==true) break;
        }
        print(arr);
    }
}
