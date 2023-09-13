class methodWithReturnType 
{
	public static void main(String[] args) 
	{
		int x = test1(99);
		int y = test2(100);
		methodWithReturnType o1 = new methodWithReturnType();
		int z = o1.test3(101);
	}
	public static int test1(int a)
	{
        int i = a;
		System.out.println(i);
		return 0;
	}
	public static int test2(int b)
	{
	    int j = b;
		System.out.println(j);
		return 0;
	}
	public int test3(int c)
	{
		int k = c;
		System.out.println(k);
		return 0;
	}
}
