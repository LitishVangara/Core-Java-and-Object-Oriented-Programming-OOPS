class animal
{
	public void roam()
	{
		System.out.println("Roam around the Forest.");
	}
}
class wildanimal extends animal
{
	public void hunt()
	{
		System.out.println("Hunt for Food.");
	}
}
class lion extends wildanimal
{
	public void rule()
	{
		System.out.println("Rule the forest.");
	}
}
class Animals1 
{
	public static void main(String[] args) 
	{
		wildanimal o1 = (wildanimal) new lion();
		o1.roam();
		o1.hunt();
		animal o2 = (animal) o1;
		o2.roam();
		wildanimal o3 = (wildanimal) o2;
		o3.roam();
		o3.hunt();
		lion o4 = (lion) o3;
		o4.roam();
		o4.hunt();
		o4.rule();
	}
}
