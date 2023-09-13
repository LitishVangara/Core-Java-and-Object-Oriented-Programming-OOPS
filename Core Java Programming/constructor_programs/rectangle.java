class class1
{
	public int length;
	public int width;
	public class1 (int length, int width)
	{
		this.length = length;
		this.width = width;
	}
	public void dimensions()
	{
		System.out.println("[Length x Width] = ["+length+" x "+width+"]");
	}
}
class rectangle
{
	public static void main(String[] args) 
	{
		class1 o1 = new class1(10, 5);
		class1 o2 = new class1(8, 7);
		class1 o3 = new class1(15, 7);
		o1.dimensions();
		o2.dimensions();
		o3.dimensions();
	}
}
