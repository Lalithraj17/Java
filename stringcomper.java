import java.util.Scanner;

class stringcomper{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in)){
        String a = sc.nextLine();
            switch (a)
            {
                case "red" -> System.out.println("Stop");
                case "yellow" -> System.out.println("ready to go");
                case "green" -> {
                    System.out.println("Go");
                }
                default ->
                {
                    System.out.println("invalid...");
                }
            }
        }
    }
}