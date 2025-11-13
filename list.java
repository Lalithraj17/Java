import java.util.Scanner;
public class list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numer of people: ");
        int n = sc.nextInt();
        String[] people = new String[n];
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of person " + (i + 1) + ": ");
            people[i] = sc.nextLine();
        }
        int[][] t = new int[n][100];
        for(int i=0; i<n; i++){
            for(int j=0; j<100; j++){
                System.out.println("Enter tokens held by person"+(i+1)+" :");
                t[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the person name :");
        String name = sc.nextLine();
        for (int i=0; i<n; i++){
            if(people[i].equals(name)){
                System.out.println("Tokens held by " + name + ":");
                for(int j=0; j<100; j++){
                    System.out.println(t[i][j]);
                }
            }
        }
    }
}