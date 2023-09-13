class animal
{
	public void roam()
	{
		System.out.println("Animals roam around the Forest.");
	}
}
class lion extends animal
{

}
class wildAnimal 
{
	public static void main(String[] args) 
	{
		animal o1 = (animal) new lion();
		o1.roam();
	}
}