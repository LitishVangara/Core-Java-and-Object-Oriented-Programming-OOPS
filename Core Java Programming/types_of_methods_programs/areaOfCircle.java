class areaOfCircle
{
	public static void main(String[] args) 
	{
		findArea(10.6);
	}
	public static void findArea(double diameter)
	{
        double radius = findRadius(diameter);
		double area = 3.14*radius*radius;
		System.out.println("The area of Circle is = "+area);
	}
	public static double findRadius(double diameter)
	{
        double radius = diameter/2;
		return radius;
	}
}
