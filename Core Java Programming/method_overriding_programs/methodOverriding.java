class demo
{
	public void run()
	{
		System.out.println("Litish is running 5km/hr.");
	}
}
class sample extends demo
{
	public void run()
	{
		System.out.println("Lahari is running 2km/hr.");
	}
}
class methodOverriding 
{
	public static void main(String[] args) 
	{
		sample overriding = new sample();
		overriding.run();
		demo d1 = new demo();
		d1.run();
	}
}
