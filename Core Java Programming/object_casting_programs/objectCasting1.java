class threeDShapes
{
	public void shapes()
	{
		System.out.println("Three Dimensional Shapes.");
	}
}
class pyramid extends threeDShapes
{
	public void volume()
	{
		System.out.println("Diameter, Height is needed to find Volume of Pyramid.");
	}
}
class triangularPyramid extends threeDShapes
{
	public void volume()
	{
		System.out.println("Length, Width, Height is needed to find Volume of Triangular Pyramid.");
	}
}
class objectCasting1 
{
	public static void main(String[] args) 
	{
		threeDShapes o1 = (threeDShapes) new triangularPyramid();
		threeDShapes o2 = (threeDShapes) new pyramid();
		o1.shapes();
		o2.shapes();
		triangularPyramid o3 = (triangularPyramid) o1;
		pyramid o4 = (pyramid) o2;
		o3.shapes();
		o4.shapes();
		o3.volume();
		o4.volume();
	}
}
