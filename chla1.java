import java.util.*;
class chla1{
    public static int chocolate(int[] n, int m)
    {
        if(n.length < m || m <= 0) {
            return -1;
        }
        Arrays.sort(n);
        int minDiff = Integer.MAX_VALUE; // handle positive integers
        // Integer MIN_VALUE // handle negative integers
        for(int i=0; i<n.length-m; i++){
            int c=n [i+m-1]- n[i];
            if(c < minDiff) {
                minDiff = c;
            }
        }
        return minDiff;
    }
    public static void main(String[] args){
        // try (Scanner sc = new Scanner(System.in)){
        // int mark = sc.nextInt();
        // if (mark >= 35)
        // {
        //     System.out.print("pass");
        // }
        // else {
        //     System.out.print("faill");
        // }
        // }
        int []a= {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;
        int result = chocolate(a, m);
        if(result == -1) {
            System.out.println("Not enough chocolates");
        }
        else {
            System.out.println("Minimum difference is: " + result);
        }
    }
}