class nonStaticMethod 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
        nonStaticMethod o1 = new nonStaticMethod();
		o1.move();
		System.out.println("Main Ends");
	}
	public void move() 
	{
		System.out.println("Move Car");
	}
}
