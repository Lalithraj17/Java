import java.util.Scanner;
public class ternary 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("A = ");
            int a = sc.nextInt();
            System.out.print("B = ");
            int b = sc.nextInt();
            System.out.print("C = ");
            int c = sc.nextInt();
            System.out.print("D = ");
            int d = sc.nextInt();
            String e = ((a<b)&&(a>d))?((a<c)? "A is greater":"C is greater"):(((b>c)&&(b<d))? "B is greater":"D is greater");
            System.out.println(e);
        }
        
    } 
}