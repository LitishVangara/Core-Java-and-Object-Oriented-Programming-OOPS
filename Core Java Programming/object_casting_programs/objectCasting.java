class ShyamSinghRoy
{
	public void writer()
	{
		System.out.println("Writing Articles.");
	}
}
class Gautham extends ShyamSinghRoy
{
	public void director()
	{
		System.out.println("Short Movies.");
	}
}
class objectCasting 
{
	public static void main(String[] args) 
	{
		ShyamSinghRoy ssr = (ShyamSinghRoy) new Gautham();
		ssr.writer();
		Gautham g1 = (Gautham) ssr;
		g1.writer();
		g1.director();
	}
}
