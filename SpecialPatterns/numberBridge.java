package SpecialPatterns;
import java.util.Scanner;
public class numberBridge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for (int i=1; i<=2*n-1; i++){
            System.out.print(i + " "); //top most line (123456789.....)
        }
        System.out.println();
        n--;
        int nsp = 1;
        for (int i=1; i<=n; i++){
            int a = 1;
            for (int j=1; j<=n+1-i; j++){ //stars
                System.out.print(a++ + " ");
            }
            for (int j=1; j<=nsp; j++){
                System.out.print(" " + " ");
                a++;
            }
            nsp+=2;
            for (int j=5; j<=n+5-i; j++){ //stars
                System.out.print(a++ + " ");
            }
            System.out.println();
        }

    }
}
