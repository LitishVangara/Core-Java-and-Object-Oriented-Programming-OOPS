class class1
{
	public static double pi = 3.14;
	public int r;
	public class1 (int z)
	{
		r = z;
	}
	public void findArea()
	{
        double area = pi*r*r;
		System.out.println("Area of circle = "+area);
	}
}
class circle
{
	public static void main(String[] args) 
	{
		class1 o1 = new class1(10);
		class1 o2 = new class1(5);
		class1 o3 = new class1(12);
		o1.findArea();
		o2.findArea();
		o3.findArea();
	}
}
