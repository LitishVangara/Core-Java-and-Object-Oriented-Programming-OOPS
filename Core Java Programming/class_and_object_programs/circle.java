class secondClass
{
	public static double pi = 3.14;
	public int r = 5;
	public void findArea()
	{
        double area = pi*r;
		System.out.println("Area of circle = "+area);
	}
}
class circle
{
	public static void main(String[] args) 
	{
		secondClass o1 = new secondClass();
		secondClass o2 = new secondClass();
		secondClass o3 = new secondClass();
		o1.findArea();
		o2.findArea();
		o3.findArea();
	}
}
