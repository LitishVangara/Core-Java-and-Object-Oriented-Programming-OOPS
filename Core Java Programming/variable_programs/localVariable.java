class localVariable
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts...");
		result();
        localVariable o1=new localVariable();
		o1.next();
		System.out.println("Main ends...");
	}
    public static void result() 
	{
	    int x=45;
		System.out.println(x);
	}
    public void next() 
	{
	    double a=3.4;
		System.out.println(a);
	}
}
