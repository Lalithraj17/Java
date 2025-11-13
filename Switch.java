import java.util.Scanner;
public class Switch {
    public static void main(String[] args)
    {
    boolean state = true; 
    while(state){
        try(Scanner sc = new Scanner (System.in)){
        char n=sc.next().charAt(0);
        switch (n)
            {
                case '+':
                {
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    System.out.println("Addation of two no "+a+"+"+b+" = "+(a+b));
                } 
                case '-':
                {
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    System.out.println("Subration of two no "+a+"-"+b+" = "+(a-b));
                }
                case 'x':
                {
                    state = false;
                }
                default :
                {
                    System.out.println("invalid...");
                }
            }
        }
    }
    }
}
