
public class arrays {
    //array basics:
    //javac arrays.java
    //java arrays.java



    //1. Declare and initialize 
    public static void main(String[] args) {
        // // Example usage of methods
        // int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // int max = findMax(testArray);
        // System.out.println("The maximum value in the array is: " + max);
        // //******TESTING FIND MIN */
        // int[] testArray1 = {10,3,4,1,2};
        // int min = findMin(testArray1);
        // System.out.println("The minimum value in the array is: " + min);

        int[] testArray = {5, 3, 8, 1, 9, 2, 7, 4, 6, 10};
        System.out.println("Original array:");
        for(int i =0; i < testArray.length; i++){
            System.out.println(testArray[i]);
        }
        

        sortArrayAscending(testArray);
        System.out.println("Sorted array in ascending order:");
        for(int i =0; i < testArray.length; i++){
            System.out.println(testArray[i]);
        }
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
        double average = 0.0;
        double total = 0;
        for( int i =0; i < array.length; i++){
            total += array[i];
        }
        average = total/ array.length;
        return average;
    }
 
    public static void reverseArray(int[] array) {
        // we need to reverse the array
        int len = array.length;
        for( int i =0; i < len/2;i++){
            int temp = array[i];
            array[i] = array[len-i-1];
            array[len-i-1] = temp;
        }
        
       
    }

    public static void sortArrayAscending(int[] array) {
        // Implementation so it goes smaller to bigger
        //the first for loop focuses on the first number and then the second loop iterates through all of the numbers after it until 
        //num1 has been compared to every other number in thearray 
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
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
