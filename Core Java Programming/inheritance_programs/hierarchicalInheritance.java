class F
{
	public double i = 1.1;
}
class G extends F
{
	public double j = 0.9;
	public void info()
	{
		System.out.println(j);
		System.out.println(i);
	}
}
class H extends F
{
	public double k = 0.8;
	public void display()
	{
		System.out.println(k);
	}
}
class hierarchicalInheritance 
{
	public static void main(String[] args) 
	{
		H o1 = new H();
		G o2 = new G();
		o1.display();
		o2.info();
	}
}
