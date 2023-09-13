class Animal
{
	public void roam()
	{
		System.out.println("Animals are roaming around the Forest.");
	}
}
class WildAnimal extends Animal
{
	public void roam()
	{
		System.out.println("WildAnimals are roaming around the Forest.");
	}
}
class Lion extends Animal
{
}
class Tiger extends Animal
{
	public void roam()
	{
		System.out.println("Tiger is roaming around the Forest.");
	}
}
class AnimalOverriding 
{
	public static void roaming (Animal animals)
	{
		animals.roam();
	}
	public static void main(String[] args) 
	{
		roaming (new WildAnimal());
		roaming (new Lion());
		roaming (new Tiger());
	}
}
