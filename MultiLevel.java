//package Inheritance;
class Grandfather 
{
	String cycle="cycle";
}
class father extends Grandfather
{
	String land="Land of 100 acres";
}
class son extends father
{
	String bike="XYZ bike";
}

public class MultiLevel 
{

	public static void main(String[] args) 
	{
		son s=new son();
		System.out.println(s.bike);
		System.out.println(s.land);
		System.out.println(s.cycle);
	}

}
