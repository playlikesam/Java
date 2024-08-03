package BinarySearch;
public class FindLowerBoundOfX {
    public static void main(String[] args){
        //   index : 0   1  2  3  4  5  6  7
        int[] arr = {10,20,30,30,40,50,60,70};
        System.out.print("Array : ");
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        int n = arr.length;
        int target = 30; //answer : 5
        System.out.println("Target : "+target);
        int lb = n;
        int lo=0, hi=n-1;
        while (lo<=hi){
            int mid = lo + (hi-lo)/2;
            if (arr[mid]>=target){
                lb = Math.min(lb,mid);
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        System.out.print("Lower Bound : " + lb);
    }
}
