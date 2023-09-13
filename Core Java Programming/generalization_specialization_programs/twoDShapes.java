class shape
{
	public void rotate()
	{
		System.out.println("Rotate in Clockwise.");
	}
	public void fill()
	{
		System.out.println("Fill with Blue Colour.");
	}
	public void outline()
	{
		System.out.println("Outline thickness is 1mm.");
	}
}
class circle extends shape
{	
}
class rectangle extends shape
{	
}
class triangle extends shape
{
}
class twoDShapes         /* Generalization       and Inheritance */
{
	public static void display(shape Shapes)
	{
		Shapes.rotate();
		Shapes.fill();
		Shapes.outline();
	}
	public static void main(String[] args) 
	{
		display (new circle());
		display (new rectangle());
		display (new triangle());
	}
}
