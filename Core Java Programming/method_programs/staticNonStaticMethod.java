class staticNonStaticMethod 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		kick();
        staticNonStaticMethod o1 = new staticNonStaticMethod();
		o1.move();
		System.out.println("Main Ends");
	}
	public static void kick() 
	{
		System.out.println("Kick Football");
	}
	public void move() 
	{
		System.out.println("Move Car");
	}
}
