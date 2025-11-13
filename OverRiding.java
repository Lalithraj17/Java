//package Polymorphism;

class father
{
	String land="100 Acers";
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

public class OverRiding {

	public static void main(String[] args) 
	{
		son s=new son();
		s.fun();
	}

}
