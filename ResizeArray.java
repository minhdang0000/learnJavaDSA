public class ResizeArray {
    public static void printArr(int[] arr){
       for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i]+" ");
       }
       System.out.println();
    }
    public static int[] resize(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }
    public static void main(String[] args) {
        int[] a =  {1,2,3,4};
        System.out.println(a.length);
        a = resize(a, 10);
        System.out.println(a.length);

    }
}
