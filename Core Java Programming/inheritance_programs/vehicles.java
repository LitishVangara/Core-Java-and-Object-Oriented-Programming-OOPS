class vehicle
{
	public void typesOfVehicles()
	{
		System.out.println("There are many types of Vehicles.");
	}
}
class car extends vehicle
{
	public void cars()
	{
		typesOfVehicles();
		System.out.println("Cars come under Vehicles.");
	}
}
class fourwheeler extends car
{
	public void wheeler()
	{
		cars();
		System.out.println("Four Wheeler is a Car.");
	}
}
class vehicles 
{
	public static void main(String[] args) 
	{
		fourwheeler o1 = new fourwheeler();
		o1.wheeler();
	}
}
