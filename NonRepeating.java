
import java.util.HashMap;
import java.util.Map;

public class NonRepeating {
    // public static int firstNonRepeatingCharacter(String str){
    //     Map<Character, Integer> map = new HashMap<>();
    //     char[] chars = str.toCharArray();
    //     for (char ch : chars) {
    //         map.put(ch, map.getOrDefault(ch, 0)+1);
    //     }
    //     for (int i = 0; i < chars.length; i++) {
    //         char ch = chars[i];
    //         if (map.get(ch) == 1) {
    //            return i;               
    //         }
    //     }
    //     return -1;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a string: ");
    //     String str = sc.nextLine();
    //     System.out.println(firstNonRepeatingCharacter(str));
    // }
    public static int firstNonRepeatingCharacter(String str){
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if(map.get(ch) == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "aacc";
        System.out.println(firstNonRepeatingCharacter(str));
    }
}
