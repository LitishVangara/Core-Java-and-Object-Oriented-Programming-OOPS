class class1
{
	public String name;
	public int age;
	public double tenth;
	public double inter;
	public double degree;
	public double masters;
	public class1 (String name, int age, double tenth, double inter, double degree, double masters)
	{
		this.name = name;
		this.age = age;
		this.tenth = tenth;
		this.inter = inter;
		this.degree = degree;
		this.masters = masters;
	}
	public class1 (String name, int age, double tenth, double inter, double degree)
	{
		this.name = name;
		this.age = age;
		this.tenth = tenth;
		this.inter = inter;
		this.degree = degree;
	}
	public void details()
	{
		System.out.println("-------------------------Students Details.-----------------------");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age+"years");
		System.out.println("10th : "+tenth+" %");
		System.out.println("Inter : "+inter+" %");
		System.out.println("Degree : "+degree+" %");
		if (masters != 0.0)
		{
			System.out.println("Masters : "+masters+" %");
		}
		System.out.println("*****************************************************************");
		System.out.println("                                                                 ");
		System.out.println("                                                                 ");
	}
}
class studentsDetails
{
	public static void main(String[] args) 
	{
		class1 o1 = new class1("Litish.", 22, 92.6, 80.0, 87.0);
		class1 o2 = new class1("Lahari.", 20, 89.5, 87.9, 82.5);
		class1 o3 = new class1("Lohith.", 21, 96.7, 88.8, 80.9, 89.9);
		class1 o4 = new class1("BaBA.", 23, 92.6, 85.7, 89.5, 80.5);
		class1 o5 = new class1("Vishnu.", 22, 89.5, 80.8, 90.8, 92.5);
		o1.details();
		o2.details();
		o3.details();
		o4.details();
		o5.details();
	}
}
