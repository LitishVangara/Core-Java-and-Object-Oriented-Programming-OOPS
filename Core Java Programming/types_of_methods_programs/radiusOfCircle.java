class radiusOfCircle 
{
	public static void circle(double diameter) 
	{
		double circleRadius = diameter/(2*3.14);
		System.out.println("The diameter of the Circle is = "+diameter+" m");
	    System.out.println("The radius of the Circle is = "+circleRadius+" m");
	}
	public static void main(String[] args) 
	{
		circle(2.5);
	}
}
