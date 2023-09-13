class methodWithArgumentType 
{
	public static void main(String[] args) 
	{
		test1(99);
		test2(true);
		methodWithArgumentType o1 = new methodWithArgumentType();
		o1.test3(95,'@');
	}
	public static void test1(int a)
	{
		System.out.println(a);
	}
	public static void test2(boolean b)
	{
		System.out.println(b);
	}
	public void test3(int c, char d)
	{
		System.out.println(c);
		System.out.println(d);
	}
}
