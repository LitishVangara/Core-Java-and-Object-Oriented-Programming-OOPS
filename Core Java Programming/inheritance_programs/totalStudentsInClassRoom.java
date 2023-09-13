class students 
{
	public int totalStudents = 40;
}
class classRoom extends students
{
	public void studentsInClassRoom()
	{
		System.out.println("There are "+totalStudents+" students in the Class Room.");
	}
}
class colleges extends classRoom
{
	public void college()
	{
		studentsInClassRoom();
		System.out.println("Class Rooms are present in Colleges.");
	}
}
class totalStudentsInClassRoom 
{
	public static void main(String[] args) 
	{
		colleges o1 = new colleges();
		o1.college();
	}
}
