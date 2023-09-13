abstract class BlankPresentation
{
	abstract public void title();
	public void slideSize()
	{
		System.out.println("Wide Screen size is 16:9.");
	}
}
class EnvironmentPresentation extends BlankPresentation
{
	public void title() 
	{
		System.out.println("Environment in Forest.");
	}
}
class WindowsOfficePresentation
{
	public static void main(String[] args) 
	{
		EnvironmentPresentation presentation = new EnvironmentPresentation();
		presentation.title();
		presentation.slideSize();
	}
}
