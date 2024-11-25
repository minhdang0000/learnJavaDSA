public class MathChallenge {
    public static boolean MathChallenge(long num){
        while (num > 0) {
            long digit = num % 10;
            if(digit % 2 != 0){
                return false;
            }
            num /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        long num = 224424468;
        System.out.println(MathChallenge(num));
    }
}
