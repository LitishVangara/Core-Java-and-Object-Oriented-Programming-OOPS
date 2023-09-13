class addition 
{
	public static void add() 
	{
		int c = 5 + 6;
		System.out.println(c);
	}
	public void sub()
	{
		int c = 5 - 6;
		System.out.println(c);
	}
}
class add 
{
	public static void main(String[] args) 
	{
		addition.add();
		addition o1 = new addition();
		o1.sub();
	}
}