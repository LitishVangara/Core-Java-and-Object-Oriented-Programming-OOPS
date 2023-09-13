class nonStaticVariable
{
	public int y = 100; 
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		nonStaticVariable o1 = new nonStaticVariable();
        System.out.println(o1.y);
        System.out.println("Main Ends");
	}
}
