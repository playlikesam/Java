package questionsOnArray;
public class dutchFlagColours {
    public static void main(String[] args) {
        //Sort Array :
        int[] arr = {1,2,0,0,0,1,2,0,0,1,2,2};
        int n = arr.length;
        //Method 1 : two pass solution
        int noz = 0, noo = 0;
        int not;
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();

        for (int i=0; i<n; i++){
            if (arr[i]==0) noz++;
            if (arr[i]==1) noo++;
        }
        //setting values :
        for (int i=0; i<n;i++){
            if (i<noz) arr[i]=0;
            else if (i<noz+noo) arr[i]=1;
            else arr[i]=2;
        }
        //printing :
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
