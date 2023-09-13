class staticNonStatic
{
	public static int a;    //global variable with main datatypes
	public static double b;
	public static char c;
	public static String d;
	public static boolean e;
	public int f;
	public double g;
	public char h;
	public String i;
	public boolean j;
	public static void main(String[] args) 
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		staticNonStatic o1=new staticNonStatic();
		System.out.println(o1.f);
		System.out.println(o1.g);
		System.out.println(o1.h);
		System.out.println(o1.i);
		System.out.println(o1.j);
	}
}
