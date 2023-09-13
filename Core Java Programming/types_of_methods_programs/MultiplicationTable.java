class MultiplicationTable 
{
	public static void multiply(int x) 
	{
		for (int y=1;y<=10;y++)
		{
			int z=x*y;
		    System.out.println(x+" x "+y+" = "+z);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Table Starts");
		multiply(4);
		System.out.println("Table Ends");
	}
}
