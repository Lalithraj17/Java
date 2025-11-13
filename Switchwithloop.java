import java.util.*;
public class Switchwithloop {
    public static void main(String[] args) 
    {
    try (Scanner sc = new Scanner (System.in)) {
        boolean state = true; 
        while(state)
        {
            String n=sc.nextLine();
            switch (n)
                {
                    case "add" -> {
                        System.out.print("Enter num1 : ");
                        int a=sc.nextInt();
                        System.out.print("Enter num2 : ");
                        int b=sc.nextInt();
                        System.out.println("Addation "+a+" & "+b+" = "+(a+b));
                        state=true;
                    }

                    case "sub" -> {
                        System.out.print("Enter num1 : ");
                        int a=sc.nextInt();
                        System.out.print("Enter num2 : ");
                        int b=sc.nextInt();
                        System.out.println("Subration of "+a+" & "+b+" = "+(a-b));
                        state=true;
                    }

                    case "mit" -> {
                        System.out.print("Enter num1 : ");
                        int a=sc.nextInt();
                        System.out.print("Enter num2 : ");
                        int b=sc.nextInt();
                        System.out.println("Multiplication of "+a+" & "+b+" = "+(a*b));
                        state=true;
                    }

                    case "did" -> {
                        System.out.print("Enter num1 : ");
                        int a=sc.nextInt();
                        System.out.print("Enter num2 : ");
                        int b=sc.nextInt();
                        System.out.println("Division of "+a+" & "+b+" = "+(a/b));
                        state=true;
                    }

                    case "rem" -> {
                        System.out.print("Enter num1 : ");
                        int a=sc.nextInt();
                        System.out.print("Enter num2 : ");
                        int b=sc.nextInt();
                        System.out.println("Reminder of "+a+" & "+b+" = "+(a%b));
                        state=true;
                    }

                    case "end" ->                     {
                        System.out.print("END...");
                        state = false;
                    }
                    default -> {
                        System.out.println("invalid...");
                        state=true;
                    }
                }
            }
    }
    }
}
