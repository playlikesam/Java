package questionsOnArray;
public class mergingtwoarrayss {
    public static void main(String[] args) {
        int[] a = {11,33,42};
        int[] b = {26,54,69};
        int[] c = new int[a.length+b.length];
        //we are using three pointers here:

        int i=0, j=0, k=0;
        //merging :
        while (i<a.length && j<b.length){
            if (a[i]<=b[j]){
                c[k] = a[i];
                i++; k++;
            }
            else {
                c[k] = b[j];
                j++; k++;
            }
        }
        if (i==a.length){
            //take ele from b only
            while (j<b.length){
                c[k] = b[j];
                j++; k++;
            }
        }
        if (j==b.length){
            //take ele form a only
            while (i<a.length){
                c[k] = a[i];
                i++; k++;
            }
        }
        for (int ele : c){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
