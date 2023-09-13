class student        /* Specialization    and independent classes */
{
	public String name;
	public student (String name)
	{
		this.name = name;
	}
	public void study()
	{
		System.out.println(name+" is Studying.");
	}
	public void prepare()
	{
		System.out.println(name+" is preparing for Exam.");
	}
	public void test()
	{
		System.out.println(name+" is taking Test.");
		System.out.println("                                          ");
		System.out.println("                                          ");
	}
}
class studentsName
{
	public static void main(String[] args) 
	{
		display (new student ("Litish"));
		display (new student ("Lahari"));
		display (new student ("Lohith"));
	}
	public static void display(student students)
	{
		students.study();
		students.prepare();
		students.test();
	}
}
