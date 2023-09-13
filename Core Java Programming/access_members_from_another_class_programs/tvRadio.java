class tv
{
	public static int a = 10; 
	public static void news()
	{
		System.out.println("TV 9, TV 5, etc");
		System.out.println(a);
	}
}
class radio
{
	public int b = 20;
	public void fm()
	{
		System.out.println(b);
		System.out.println("98.3FM, 101.4FM, etc");
	}
}
class tvRadio 
{
	public static void main(String[] args) 
	{
	    tv.news();
		radio o1 = new radio();
		o1.fm();
	}
}