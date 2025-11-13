import java.util.*;
class Oddeven
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
        int a = sc.nextInt();
        if (a%2==0)
        {
            System.out.print("EVEN");
        }
        else 
        {
            System.out.print("ODD");
        }
        }
    }
}