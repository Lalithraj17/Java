import java.util.Scanner;

interface calci 
{
	void add();
	void sub();

}
class cal implements calci
{
	int a=10,b=5;
        @Override
	public void add() 
    {
		System.out.println("output of cal1 " +a+b);
	
	}
        @Override
	public void sub() 
    {
		int p=10,q=5;
		int r=p-q;
		System.out.println("output of cal " +r);
	}
}
class cal1 implements calci
{
	Scanner s =new  Scanner(System.in);
        @Override
	public void add() 
    {
		int a,b,c;
		System.out.print("input of cal1 a ");
		a=s.nextInt();
		System.out.print("input of cal1 b ");
		b=s.nextInt();
		c=a+b;
		System.out.println("output of cal1 " +c);
	}
        @Override
	public void sub() 
    {
		int a,b,c;
		System.out.print("input of cal1 a ");
		a=s.nextInt();
		System.out.print("input of cal1 b ");
		b=s.nextInt();
		c=a-b;
		System.out.println("output of cal1 " +c);
	
	}
}
public class intreface 
{
    public static void main(String [] args ) 
    {
		cal r =new cal();
		cal1 r1 =new cal1();
		r.add();
		r.sub();
		r1.add();
		r1.sub();
	}
}