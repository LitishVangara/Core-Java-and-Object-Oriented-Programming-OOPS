class volumeOfTheBox
{
	public static void box(double length, double width, double height) 
	{
	    double boxVolume = length*width*height;
		System.out.println("The Length of the Box is = "+length+" cm");
		System.out.println("The Width of the Box is = "+width+" cm");
		System.out.println("The Height of the Box is = "+height+" cm");
	    System.out.println("The Volume of the Box is = "+boxVolume+" cm");
	}
	public static void main(String[] args) 
	{
		box(10.5,2.6,1.3);
	}
}
