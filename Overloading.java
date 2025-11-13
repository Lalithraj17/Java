//package Polymorphism;

class father
{
	String land="100 Acers";
	void fun(int a)
	{
		System.out.println("Given number is "+a);
	}
}
class son extends father
{
	String land="80 Acers";
	void fun()
	{
		System.out.println(land);
	}

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }
}
public class Overloading 
{
	public static void main(String[] args) 
	{
		son s=new son();
		s.fun(5);
	}
}
