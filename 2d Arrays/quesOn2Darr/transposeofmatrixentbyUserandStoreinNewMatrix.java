package quesOn2Darr;
public class transposeofmatrixentbyUserandStoreinNewMatrix {
    public static void main(String[] args) {
        //transpose means cols wise printing :
        int[][] arr  = {{1,2},{3,4},{5,6}};
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {                       //This is row wise printing.
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //now printing for cols :

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Trans :");
        int[][] trans = new int[n][m];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                trans[j][i] = arr[i][j];
            }
            System.out.println();
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(trans[i][j]);
            }
            System.out.println();
        }
    }
}
