
import java.util.Scanner;

public class Palindrome {
     public static boolean isPalinDrome(String word){
         char[] charArr = word.toCharArray();
         int start = 0;
         int end = word.length()-1;
         while(start < end){
           if(charArr[start] != charArr[end]){
               return false;
           }
           start++;
           end--;
         } 
         return true;
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a String: ");
          String s = sc.nextLine();
          System.out.println("Check palindrome: " + isPalinDrome(s));
     }
    
}

