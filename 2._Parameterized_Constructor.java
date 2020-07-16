package constructor;

public class Parameterized_Constructor
{

	public static void main(String[] args)
	{
		Sanjit obj=new Sanjit(3,9);

	}

}
class Sanjit
{
	int x,y;      //  Instance variable
	
	Sanjit(int a,int b)      //  Parameterized constructor
	{
		x=a;
		y=b;
		System.out.println("X= "+x);
		System.out.println("Y= "+y);
		
	}
}