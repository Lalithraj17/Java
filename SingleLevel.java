//package Inheritance;

class father 
{
	String land="Land of 100 acres";
}
class son extends father
{
	String bike="XYZ bike";
}

public class SingleLevel 
{
	public static void main(String...args)
	{
		System.out.println("hello java");
		son s=new son();
		System.out.println(s.bike);
		System.out.println(s.land);
	}
}
