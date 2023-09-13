class addition
{
	public static void add (int i, int j)
	{
		System.out.println(i+j);
	}
	public static void add (double i, int j)
	{
		System.out.println(i+j);
	}
	public static void add (int i, int j, int k)
	{
		System.out.println(i+j+k);
	}
}
class CompileTimePolymorphism 
{
	public static void main(String[] args) 
	{
		addition.add(5, 6);
		addition.add(5.5, 6);
		addition.add(5, 6, 6);
	}
}
