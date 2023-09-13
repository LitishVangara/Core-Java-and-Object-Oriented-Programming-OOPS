class geometricShape
{
	public void shapes()
	{
		System.out.println("There are many types of Geometric Shapes.");
	}
}
class triangle extends geometricShape
{
	public void shape()
	{
		shapes();
		System.out.println("Triangle come under Geometric Shapes.");
	}
}
class rightAngledTriangle extends triangle
{
	public void anotherShape()
	{
		shape();
		System.out.println("Right Angled Triangle is a another Triangle.");
	}
}
class geometricShapes 
{
	public static void main(String[] args) 
	{
		rightAngledTriangle o1 = new rightAngledTriangle();
		o1.anotherShape();
	}
}
