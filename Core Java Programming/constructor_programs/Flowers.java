class class1 
{
	public String flowerName;
	public class1(String z)
	{
		flowerName = z;
	}
	public void display()
	{
		System.out.println("Flower Name is = "+flowerName);
	}
}
class Flowers
{
	public static void main(String[] args) 
	{
		class1 o1 = new class1("Rose");
		class1 o2 = new class1("Jasmine");
		class1 o3 = new class1("Lily");
		class1 o4 = new class1("CauliFlower");
		o1.display();
		o2.display();
		o3.display();
		o4.display();
	}
}
