public class LinearSearch {

    public static int linearSearch(int marks[], int key){
        for (int i=0; i<marks.length; i++) {
            if(marks[i] == key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {

        int marks[] = {4,5,9,7,2,6,9,3,17,55,23,68,74};
        int key = 7;

        int index = linearSearch(marks, key);
        if (index == -1) {
            System.out.println("NOT FOUND");
            
        } else {
            System.out.println("Key is at index: " + index);
        }

        
    }
}
