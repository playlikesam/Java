package strings;
public class printAllSubstrings {
    public static void main(String[] args){
        String s = "abcd";
        for (int i=0; i<s.length();i++){
            for (int j=i+1; j<5; j++){
                System.out.print(s.substring(i,j)+ " ");
            }
            System.out.println();
        }
    }
}
