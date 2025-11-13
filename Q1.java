import java.util.*;
class Q1 {
    public static void main(String [] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
        int a = sc.nextInt();
        if(a<50)
        {
            System.out.print("u need to improve");
        }
        else if (a<=50 && a<70)
        {
            System.out.print("good job");
        }
        else if (a<=70)
        {
            System.out.print("Excellent");
        }
    }
    }
}