
import java.util.Scanner;



public class Subsequence {
   public static boolean isSubsequence(String str, String substr){
    int i = 0;
    int j = 0;
    while (i < str.length() && j < substr.length()) {
        if (substr.charAt(j) == str.charAt(i)) {
            j++;
        }
        i++;
    }
    return j == substr.length();
   }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    System.out.print("Enter a sub string: ");
    String substr = sc.nextLine();
    System.out.println(isSubsequence(str, substr));
   }
}
