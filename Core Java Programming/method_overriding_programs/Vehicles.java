class Vehicle
{
	public void speed()
	{
		System.out.println("Speed is 50Km/hr.");
	}
}
class Car extends Vehicle
{
	public void speed()
	{
		System.out.println("Speed is 60Km/hr.");
	}
}
class Vehicles 
{
	public static void main(String[] args) 
	{
		Vehicle vechiles = (Vehicle) new Car();
		vechiles.speed();
	}
}
