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
	public void outline()
	{
		System.out.println("Outline thickness is 5mm.");
	}
}
class rectangle extends shape
{
	public void fill()
	{
		System.out.println("Fill with Orange Colour.");
	}
	public void outline()
	{
		System.out.println("Outline thickness is 2mm.");
	}
}
class triangle extends shape
{
	public void rotate()
	{
		System.out.println("Rotate in Anti-Clockwise.");
	}
}
class twoDShapes
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
