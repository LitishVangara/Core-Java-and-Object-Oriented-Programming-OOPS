class superClass
{
	public void superClassDisplay()
	{
		System.out.println("Non - Static Method in Super Class");
	}
}
class subClass extends superClass
{
	public void subClassDisplay()
	{
		superClassDisplay();
		System.out.println("Non - Static Method in Sub Class");
	}
}
class singleLevelInheritance 
{
	public static void main(String[] args) 
	{
		subClass o1 = new subClass();
		o1.subClassDisplay();
	}
}
