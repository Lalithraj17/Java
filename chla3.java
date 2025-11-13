public class chla3 {
    public static void rev(int[] n, int ind){
        if(ind < 0) return ; 
        System.out.print(n[ind]);
        System.out.print(" ");
        rev(n,ind-1);
    }
    // public static void rev(String n, int ind){
    //     if(ind < 0) return ;
    //     System.out.print(n.charAt(ind));
    //     rev(n,ind-1);
    // }
    public static void main(String[]args){
        // int[] a={1, 4, 3, 6, 2, 1};
        // int[] b=new int[a.length];
        // int n=1,m=3;
        // for(int i=0; i<a.length; i++){
        //     if(a[i]<=n){
        //         b[i]=a[i];
        //     }
        //     else if(a[i]>n && a[i]<=m){
        //         b[i]=a[i];
        //     }
        //     else if(a[i]<m){
        //         b[i]=a[i];
        //     }
        // }
        // System.out.println(Arrays.toString(b));
        int[] a={10, 20, 30, 40, 50};
        int ind = a.length- 1;
        rev(a, ind);
    }
}
