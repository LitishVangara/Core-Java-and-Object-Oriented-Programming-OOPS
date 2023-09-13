class fiveTimesUsingForLoopStaticMethod
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		for (int a=1;a<=5;a++)
		{
			kick();
		}
		System.out.println("Main Ends");
	}
	public static void kick() 
	{
		System.out.println("Kick Football");
	}
}
