package Conditionals;
import java.util.Scanner;
public class CpSp {
    public static void main(String[] args) {
        double p,l;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price : ");
        double cp = sc.nextDouble();
        System.out.print("Enter Selling Price : ");
        double sp = sc.nextDouble();

        if (cp<sp){
            p = sp-cp;
            System.out.println("Seller has made Profit of "+p);
        }
        else if (cp>sp){
            l = cp-sp;
            System.out.println("Seller has incurred a loss of "+l);
        }
        else {
            System.out.println("Seller sells at no profit no loss.");
        }
    }
}
