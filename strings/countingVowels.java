package strings;
import java.util.Scanner;
public class countingVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : \n");
        String str = sc.nextLine();
        int n = str.length();
        char ch;
        int count = 0;
        for (int i=0; i<n; i++){
            ch = str.charAt(i);
            if (isVowel(ch)==true) count++;
        }
        System.out.println(count);
    }
    public static boolean isVowel(char ch){
        if (ch== 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') return true;
        else
            return false;
    }
}
