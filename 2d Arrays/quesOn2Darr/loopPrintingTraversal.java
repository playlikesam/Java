package quesOn2Darr;
public class loopPrintingTraversal {
    public static void main(String[] args){
        //Consider the row no. be 'i' and col no. be 'j'
        int[][] arr = new int[3][3];
        arr[0][0] = 9;

        //output:
        for (int i=0; i<3; i++){ // 'i' for rows
            for (int j=0; j<3; j++){ // 'j' for cols
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); //this is for next line.
        }
    }
}
