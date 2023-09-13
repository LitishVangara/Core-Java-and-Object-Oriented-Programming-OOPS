class fourTimesStaticMethod
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		kick();
		kick();
		kick();
		kick();
		System.out.println("Main Ends");
	}
	public static void kick() 
	{
		System.out.println("Kick Football");
	}
}
