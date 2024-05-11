//Q.11 print multiplication of two matrices given by the user.

//idea :

// suppose we've 2 matrices given by the user and we've to multiply it.
// as we already knows how to multiply by using mathematics.
// so there was a formula to calculate the matrix multiplication
// suppose we're having 2 matrices a and b. The resultant matrix is c.
// matrix is of 2x3 of a and 3x4 of b. so the c will become 2x4.

// formula to be used :

// c[i][j] = a[i][0] x b[0][j] + a[i][1] x b[1][j] + a[i][2] x b[2][j];


package QuesOn2DarrList;
public class multiOf2Matrices {
    public static void print(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void main(String[] args){
        int[][] a = {{1,2,1},{2,1,2}};
        int[][] b = {{1,0,1,2},{2,1,0,0},{0,3,1,1}};

        if (a[0].length != b.length){
            System.out.println("Multiplication not possible !");
        }

        else {  // Multiplication is possible ;
            int[][] c = new int[a.length][b[0].length];
            for (int i=0; i<c.length; i++){
                for (int j = 0; j < c[0].length; j++) {

                    //c[i][j] = a[i][0] x b[0][j] + a[i][1] x b[1][j] + a[i][2] x b[2][j];
                    //replace x with *;

                    for (int k=0; k<b.length; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            print(a);
            print(b);
            print(c);
        }

    }
}
