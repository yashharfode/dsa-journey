public class Largestnum {

    public static int largestNum(int num[]) {
        int max = Integer.MIN_VALUE; // Represents -infinity
        int min = Integer.MAX_VALUE; // Represents +infinity

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("Smallest Number is: "+ min);

        return max;
    }

    public static void main(String[] args) {
        int num[] = {1, 7, 8, 9, 5, 3, 70, 62};
        System.out.println("Largest number is: " + largestNum(num));
    }
}
