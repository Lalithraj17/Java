import java.util.*;

public class boobleshort {
    public static void main(String[] args) {
        int []a={5, 10, 1, 2};
        int n = a.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n-i-1; j++)
            {
                if(a[j]<a[j+1])
                { //change '<' or '>' for assinding  or desinding order
                int temp =a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                }
            } 
        }
        System.out.println(Arrays.toString(a));
    }
}