import java.util.Arrays;

public class selectionshort {
    public static void main(String[] args) {
    int []a={5, 10, 1, 2};
    int n = a.length;
    for(int i=0; i<n-1; i++){
        int min=i;
        for(int j=i+1; j<n; j++){
            if(a[j]<a[min]){ //change '<' or '>' for assinding  or desinding order
                min=j;
            }
        }
        int temp =a[min];
        a[min]=a[i];
        a[i]=temp;
    }
    System.out.println(Arrays.toString(a));
    }
}