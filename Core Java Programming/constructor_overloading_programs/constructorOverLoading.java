class class1
{
	public boolean x;
	public char y;
	public double z;
	public String a;
	public String b;
	public int c;
	public class1(boolean x, char y)
	{
		System.out.println("Constructor Overloading with boolean and character Arguments.");
		System.out.println(x);
		System.out.println(y);
		System.out.println("--------------------------------------------------------------------------------");
	}
	public class1(String a, String b, int c)
	{
		System.out.println("Constructor Overloading with String, String and interger Arguments.");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("--------------------------------------------------------------------------------");
	}
	public class1(double z)
	{
		System.out.println("Constructor Overloading with double Argument.");
		System.out.println(z);
		System.out.println("--------------------------------------------------------------------------------");
	}
}
class constructorOverLoading
{
	public static void main(String[] args) 
	{
		class1 o1 = new class1(true, 'A');
		class1 o2 = new class1(false, 'D');
		class1 o3 = new class1("BaBa", "Lohith", 99);
		class1 o4 = new class1("Lahari", "Litish", 97);
		class1 o5 = new class1(18.9);
		class1 o6 = new class1(19.8);
	}
}
