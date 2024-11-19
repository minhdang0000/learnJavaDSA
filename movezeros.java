public class movezeros {
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void moveZerosToEnd(int[] arr){
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,9,3,0,69,8,5,7,0,12,34,98};
        printArr(arr);
        moveZerosToEnd(arr);
        printArr(arr);
    }

}