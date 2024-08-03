package BinarySearch;
public class Find1stAndLastPosition {
    public static void main(String[] args) {
        int arr[] = {10,10,20,20,20,20,20,30,30,30,40,40};
        int target = 20;
        //Enter first and last position.
        //       20,20,20,20,20
        //       2, 3, 4, 5, 6
        //       fp         lp
        int lp=0;
        int n = arr.length;
        int fp = n; // first position.
        int lo = 0, hi = n-1;

        //finding lower bound for the first position of target :
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if (arr[mid]>=target){
                fp = Math.min(fp,mid);
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        System.out.println("First Position : " + fp);

        lp = arr.length-1; // last position :
        int low=0, high=n-1;
        while (lo<=hi){
            int middle = low+(high-low)/2;
            if (arr[middle]>target){
                lp = Math.min(lp,middle);
                high = middle - 1;
            }
            else low = middle+1;
        }
        System.out.println("Last Position : "+lp);
    }
}
