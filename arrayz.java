import java.util.Scanner;
public class arrayz {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row count : ");
        int n = sc.nextInt();
        System.out.print("Enter column count : ");
        int m = sc.nextInt();
        int[][] arr1 = new int[n][m];
        System.out.println("Enter A matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Items in spiral order :");
        int t = 0, b = n - 1;
        int l = 0, r = m - 1;
        while (t <= b && l <= r) {
            for (int i = l; i <= r; i++) {
                System.out.print(arr1[t][i] + " ");
            }
            t++;
            for (int i = t; i <= b; i++) {
                System.out.print(arr1[i][r] + " ");
            }
            r--;
            if (t <= b) {
                for (int i = r; i >= l; i--) {
                    System.out.print(arr1[b][i] + " ");
                }
                b--;
            }
            if (l <= r) {
                for (int i = b; i >= t; i--) {
                    System.out.print(arr1[i][l] + " ");
                }
                l++;
            }
        }
        sc.close();
    }
}
