class animal
{
	public void roam()
	{
		System.out.println("Rome around the Forest.");
	}
}
class tiger extends animal
{
	public void hunt()
	{
		System.out.println("Hunt for Food.");
	}
}
class deer extends animal
{
	public void escape()
	{
		System.out.println("Escape from WildAnimals.");
	}
}
class Animals 
{
	public static void main(String[] args) 
	{
		animal o1 = (animal) new tiger();
		o1.roam();
		tiger o2 = (tiger) o1;
		o2.hunt();
		o2.roam();
		animal o3 = (animal) new deer();
		o3.roam();
		deer o4 = (deer) o3;
		o4.escape();
		o4.roam();
	}
}
