class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts....");
		bag();
		Test o1 = new Test();
		o1.book();
		System.out.println("Main Ends....");
	}
	public static void bag() 
	{
		System.out.println("College Bag");
	}
	public void book() 
	{
		System.out.println("Core Java Programs Book");
	}
}
