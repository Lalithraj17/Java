import java.util.Arrays;

public class array1 {
    public static void main(String[] args) {
        int[] arr={2, 0, 3, 0, 0, 5, 0, 3, 5, 8, 12, 15};
    int count=0;
      int[] arr1=new int [arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                arr1[count]=arr[i];
                count++;
              }
            
        }
        System.out.println(Arrays.toString(arr1));
    }
}