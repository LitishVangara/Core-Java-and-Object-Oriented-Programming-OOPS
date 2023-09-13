class employee /*Super class*/
{
	public int id;
	public String name;
	public double annualIncome;
	public employee(int id, String name, double annualIncome)
	{
		this.id = id;
		this.name = name;
		this.annualIncome = annualIncome;
	}
	public void employeeDetails()
	{
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("AnnualIncome = "+annualIncome);
	}
}
