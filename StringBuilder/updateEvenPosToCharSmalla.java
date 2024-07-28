package StringBuilder;
import java.util.Scanner;
public class updateEvenPosToCharSmalla {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //taking inputs :
        System.out.println("Enter a String : ");
        String s = sc.nextLine();
        String t = "";
        for (int i=0; i<s.length(); i++){ //logic :
            if (i%2==0) t += 'a';
            else t += s.charAt(i);
        }
        System.out.println("Produced String : ");
        System.out.println(t);
    }
}

//Poor performance because of immutability, because when the char a is added to the string, a new string
//is generated and hence covers more space because everytime a new string is formed.