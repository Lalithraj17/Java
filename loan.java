import java.util.Scanner;
class stringcomper {
    public static void main(String[] args){
        try (Scanner sc = new Scanner (System.in)){
        int sa = sc.nextInt();
        int age = sc.nextInt();
        if( sa < 20000 || age < 25)
        {
            System.out.println("Eligible for  loan");
            int loan = sc.nextInt();
            if(loan <= 50000){
                System.out.println("Aviable");
            }
            else{
                System.out.println("Not Aviable");
            }
        }
        else{
            System.out.println("Not Eligible for  loan");
        }
        }
   }
}