abstract class Electronic
{
	abstract public void laptop();
	public void laptopEc()
	{
		System.out.println("Laptop is a Electronic.");
	}
}
class Laptop extends Electronic
{
	public void laptop() 
	{
		System.out.println("Laptop is a Electronic Gadget.");
	}
}
class AbstractElectronic
{
	public static void main(String[] args) 
	{
		Laptop laptopElectronic = new Laptop();
		laptopElectronic.laptop();
		laptopElectronic.laptopEc();
	}
}
