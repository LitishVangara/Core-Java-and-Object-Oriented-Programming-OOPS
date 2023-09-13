class NonStaticAbstractionProgram 
{
	public static void main(String[] args) 
	{
		Run o1 = new Run();
		Sample o2 = o1.getObject();
		o2.test();
	}
}
