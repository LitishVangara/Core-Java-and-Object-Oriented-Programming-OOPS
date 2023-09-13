class shape
{
	public void size()
	{
		System.out.println("Diameter is 5mm");
	}
	public void properties()
	{
		System.out.println("Properties are Radius, Diameter and Pi.");
	}
}
class circle extends shape
{
	public void properties()
	{
		System.out.println("Properties are Diameter and Pi.");
	}
}
class shapes 
{
	public static void main(String[] args) 
	{
		circle circleShape = new circle();
		circleShape.properties();
		circleShape.size();
	}
}
