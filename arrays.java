
public class arrays {
    //array basics:
    //javac arrays.java
    //java arrays.java



    //1. Declare and initialize 
    public static void main(String[] args) {
        // Example usage of methods
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = findMax(testArray);
        System.out.println("The maximum value in the array is: " + max);
        //******TESTING FIND MIN */
        int[] testArray1 = {10,3,4,1,2};
        int min = findMin(testArray1);
        System.out.println("The minimum value in the array is: " + min);
    }
    
    public static int findMax(int[] array) {
        int max = array[0];// you just start off with thefirst element being the max
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];// you just start off with thefirst element being the max
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static double calculateAverage(int[] array) {
        // Implementation
        return 0;
    }

    public static void reverseArray(int[] array) {
        // Implementation
       
    }

    public static void sortArrayAscending(int[] array) {
        // Implementation
    }

    public static void sortArrayDescending(int[] array) {
        // Implementation
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        return array1;
    }

    public static int[] removeDuplicates(int[] array) {
        return array;
    }

    public static void rotateArrayLeft(int[] array, int positions) {
        // Implementation
    }

    public static void rotateArrayRight(int[] array, int positions) {
        // Implementation
    }

    public static void print2DArray(int[][] array) {
        // Implementation
    }

    public static int[][] transposeMatrix(int[][] array) {
        return array;
    }
}
