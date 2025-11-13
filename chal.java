public class chal {
    // public static int demo(int[] a)
    // {
    //     int i=0,count=0;
    //     int n=a.length;
    //     while(i<n-1)
    //     {
    //         if(a[i]!=0 && a[i]<n)
    //         {
    //             i+=a[i];
    //             n-=i;
    //             count++;
    //         }
    //         else if(a[i]!=0 && a[i]>n)
    //         {
    //             i+=n;
    //             count++;
    //         }
    //         else if(a[i]==0)
    //         {
    //             return -1;
    //         }
    //     }
    //     return count;
    // }
    // public static void main(String[] args)
    // {
    //     int[] a={1, 4, 3, 2, 6, 7};
    //     int ar= demo(a);
    //     System.out.println(ar);
    // }
    
    public static void main(String[] args) 
    {
        int[] a={1, 5, 8, 10};
        int k=2;
        int i=0;
        int n=a.length;
        while(i<n)
        {
            if(a[i]-k<0)
            {
                a[i]+=k;
            }
            else
            {
                a[i]-=k;
            }
        }
        int max=a[0];
        int min=a[0];
        for (i=0; i < n; i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            else
            {
                min=a[i];
            }
        }
        System.out.println(max-min);
    }
}