import java.util.*;
class array{
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        /*for(int i=6; i>1; i--){
            for(int j=1;  j<i ; j++){
                System.err.print("*");
            }
            System.err.println();
        }*/
        int[][] arr1 = {{1, 2, 3},{4, 5, 6}};
        int[][] arr4 = {{7, 8, 9},{10, 11, 12}};
        int[] arr = {6, 9, 7};
        int arr3[] = arr;
        int[] arr5 = new int[5];
        System.out.println(Arrays.toString(arr));    //Returns a string representation of a 1D array
        System.out.println(Arrays.deepToString(arr1));   //Returns a string representation of a 2D or nested array
        Arrays.sort(arr);   //Sorts the array in ascending order
        System.out.println(Arrays.toString(arr));
        int[] arr2=Arrays.copyOf(arr, 5);   //Copies the array to a new array of specified length
        System.out.println(Arrays.toString(arr2));
        int[] arr6=Arrays.copyOfRange(arr2,2, 7);  //Copies specified range from array
        System.out.println(Arrays.toString(arr6));
        System.out.println(Arrays.equals(arr3, arr));  //Returns true if both arrays have same elements in same order
        System.out.println(Arrays.deepEquals(arr4, arr1));  //Compares nested arrays for equality
        Arrays.fill(arr5, 6);  //Fills array with a given value
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.binarySearch(arr, 9));  //Searches for value using binary search (array must be sorted)
        //Arrays.asList(arr2);  //Converts an array to a List
        System.out.println(Arrays.toString(arr2));  
        System.out.println(Arrays.hashCode(arr));  //Returns hash code for the array
    }
}