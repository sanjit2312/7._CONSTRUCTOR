package constructor;

public class Default_Constructor 
{

	public static void main(String[] args) 
	{
		Test obj=new Test();
	}
}
class Test
{
	int a;      //  Instance variable
	
	Test()      //  Default constructor
	{
		a=10;
		System.out.println("A= "+a);
		System.out.println("Default Constructor ");
		
	}
}