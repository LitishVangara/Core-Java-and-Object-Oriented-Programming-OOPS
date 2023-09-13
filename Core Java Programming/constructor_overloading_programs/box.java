class class1
{
	public double length;
	public double width;
	public double height;
	public class1 (double length, double width, double height)
	{
		this(length, width);
		this.height = height;
	}
	public class1 (double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	public void dimensionsOfBox()
	{
		if (height > 0.0)
		{
			System.out.println("--------------------Three Dimension Box.----------------------");
		}
		if (height == 0.0)
		{
		    System.out.println("---------------------Two Dimension Box.-----------------------");
		}
		System.out.println("Length of the Box = "+length);
		System.out.println("Width of the Box = "+width);
		if (height > 0.0)
		{
		    System.out.println("Height of the Box = "+height);
		}
		System.out.println("**************************************************************");
		System.out.println("                                                                 ");
		System.out.println("                                                                 ");
	}
}
class box
{
	public static void main(String[] args) 
	{
		System.out.println("-----------------------Box Dimensions.------------------------");
		System.out.println("                                                                 ");
		class1 o1 = new class1(15.8, 28.3);
		class1 o2 = new class1(22.5, 25.6, 29.6);
		class1 o3 = new class1(16.7, 18.9, 13.5);
		class1 o4 = new class1(15.3, 15.0, 29.8);
		o1.dimensionsOfBox();
		o2.dimensionsOfBox();
		o3.dimensionsOfBox();
		o4.dimensionsOfBox();
	}
}
