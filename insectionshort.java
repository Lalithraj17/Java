import java.util.*;
public class insectionshort {
    public static void main(String[] args) 
    {
    int []a={5, 10, 1, 2};
    int n = a.length;
    try (Scanner sc = new Scanner(System.in)) {
        int k=sc.nextInt();
    for(int i=0; i<n; i++)
    {
        int b=a[i];
        int j=i-1;
        while(j>=0 && a[j]>b)
        {
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=b;
    }
    System.out.println(Arrays.toString(a));
    System.out.println(a[k-1]);
    }
    }
}