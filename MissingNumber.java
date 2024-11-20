public class MissingNumber {
    public static int findMissingNumber(int[] arr){
       int n = arr.length + 1;
       int sum = n*(n+1)/2;
       for (int i = 0; i < arr.length; i++) {
          sum -= arr[i];
       }
       return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,7,8};
        System.out.println(findMissingNumber(arr));
    }
}
