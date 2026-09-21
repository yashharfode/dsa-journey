public class ReverseArray {

    public static void reverseArr(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 5, 3, 6, 9, 8, 1, 4 };
        reverseArr(arr);
        for (int i = 0; i<arr.length; i++){
            System.out.println("Reverse array is: "+ arr[i] +  " ");
        }
    }
}
