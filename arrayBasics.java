

public class arrayBasics{
// here we will just be rviewing the basics of Java Arrays

//ARRAY BASICS ***************************
public static void main(String[] args) {
//1.1 Declare and initialize an array of intergers with 10 elements.
    int[] arr = new int[10];
//1.2 populate the array with values from 1 to 10
    for (int i =0; i < arr.length; i++){
        arr[i]  = i + 1; 
// 1.3: Print the array elements using a for loop.        
        System.out.println(arr[i]);
    } 
    
}

    
}

