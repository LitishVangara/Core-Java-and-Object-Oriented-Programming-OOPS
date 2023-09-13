abstract class Animal
{
	abstract public void roam();
	abstract public void hunt();
}
abstract class WildAnimal extends Animal
{
	public void roam()
	{
		System.out.println("Wildanimals are roaming around the Forest.");
	}
}
class Lion extends WildAnimal
{
	public void hunt()
	{
		System.out.println("Lion is the king in Hunting.");
	}
}
class AbstractMultiLevel 
{
	public static void main(String[] args) 
	{
		Lion animal = new Lion();
		animal.roam();
		animal.hunt();
	}
}
