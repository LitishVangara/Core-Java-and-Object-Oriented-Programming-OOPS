class class1
{
	public int id;
	public String name;
	public int salary;
	public double experience;
	public class1 (int id, String name, int salary, double experience)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.experience = experience;
	}
	public class1 (int id, String name, int salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void details()
	{
		System.out.println("-------------------------Employee Details.-----------------------");
		System.out.println("Employee ID : "+id+".");
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary+"Rs.");
		if (experience != 0.0)
		{
			System.out.println("Years of Experience : "+experience+" years.");
		}
		System.out.println("*****************************************************************");
		System.out.println("                                                                 ");
		System.out.println("                                                                 ");
	}
}
class employeeDetails
{
	public static void main(String[] args) 
	{
		class1 o1 = new class1(220221, "Litish.", 42000);
		class1 o2 = new class1(220222, "Lahari.", 40000);
		class1 o3 = new class1(210245, "Lohith.", 80000, 2.5);
		class1 o4 = new class1(230218, "BaBa.", 90000, 3.5);
		class1 o5 = new class1(240402, "Vishnu.", 75000, 2.0);
		o1.details();
		o2.details();
		o3.details();
		o4.details();
		o5.details();
	}
}
