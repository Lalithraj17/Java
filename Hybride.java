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
class daughter extends father
{
	String cosmetics="lipstick";
}

public class Hybride 
{
	public static void main(String[] args) 
	{
		son s=new son();
		daughter d=new daughter();
		System.out.println(s.bike);
		System.out.println(s.land);
		System.out.println(s.cycle);
		System.out.println(d.cosmetics);
		System.out.println(d.land);
		System.out.println(d.cycle);
	}
}
