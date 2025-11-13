import java.util.Scanner;
public class listz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter no of row : ");
        // int n=sc.nextInt();
        // System.out.print("Enter no of coloum : ");
        // int m=sc.nextInt();
        // int[][] matrix= new int[n][m];
        // System.out.println("Enter A matrix : ");
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //     matrix[i][j]=sc.nextInt();
        //     }
        // }
        int[][] matrix = {
            {1, 3, 5, 7},
            
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        System.out.print("Enter number to search: ");
        int target = sc.nextInt();
        boolean f = false;
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                if (matrix[i][j]==target) {
                    f=true;
                    break;
                }
            }
        }
        System.out.println(f);
    }
}