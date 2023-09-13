class twoNonStaticVariable
{
	public int y = 100;
	public int z = 99; 
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		twoNonStaticVariable o1 = new twoNonStaticVariable();
        System.out.println(o1.y);
        System.out.println(o1.z);
        System.out.println("Main Ends");
	}
}
