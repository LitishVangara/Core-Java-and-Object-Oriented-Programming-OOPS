class mainStaticMethodOverLoading
{
	public static void main(int x, int y) 
	{
		int z = x+y;
		System.out.println("Sum of "+x+" and "+y+" is = "+z);
	}
	public static void main(String[] args) 
	{
		main(6,4);
	}
}