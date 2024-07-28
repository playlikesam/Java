//take input a string buider and reverse it without using inbuilt function :
package StringBuilder;
public class hw {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("sam");
        int n = sb.length();
        int i = 0, j = 0;
        while (i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++; j--;
        }
        System.out.println(sb);
    }
}