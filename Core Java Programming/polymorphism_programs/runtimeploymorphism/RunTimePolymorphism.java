interface Animal
{
	void animalNoise();
}
class Lion implements Animal
{
	public void animalNoise()
	{
		System.out.println("Lion Noise.");
	}
}
class Tiger implements Animal
{
	public void animalNoise()
	{
		System.out.println("Tiger Noise.");
	}
}
class Cheetah implements Animal
{
	public void animalNoise()
	{
		System.out.println("Cheetah Noise.");
	}
}
class RunTimePolymorphism
{
	public static void sound (Animal noise) 
	{
		noise.animalNoise();
	}
	public static void main(String[] args) 
	{
		sound (new Lion());
		sound (new Tiger());
		sound (new Cheetah());
	}
}
