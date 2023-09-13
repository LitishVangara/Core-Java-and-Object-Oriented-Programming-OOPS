abstract class RamNotes
{
	abstract public void topic25();
	abstract public void topic31();
}
abstract class ShivaNotes extends RamNotes
{
	public void topic25()
	{
		System.out.println("Topic25 notes is completed.");
	}
}
class KrishnaNotes extends ShivaNotes
{
	public void topic31()
	{
		System.out.println("Topic31 notes is completed.");
	}
}
class NotesAbstractMultiLevel 
{
	public static void main(String[] args) 
	{
		KrishnaNotes notes = new KrishnaNotes();
		notes.topic25();
		notes.topic31();
	}
}
