package quesOn2Darr;
public class sumofallelein2d {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4},{5,6}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
