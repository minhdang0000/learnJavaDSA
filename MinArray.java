public class MinArray {
    public static int findMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i]+ " ");
        }
        System.out.println();
     }
     public static void main(String[] args) {
        int[] arr = {69,5,1,2,4,3,6,9,8,-5,13};
        
        System.out.println(findMin(arr));

     }
}
