package constructor;

public class Constructor_Overloading 
{

	public static void main(String[] args) 
	{
		
		Mark obj1=new Mark(10);
		Mark obj2=new Mark(20.56f);
		Mark obj3=new Mark(10,20);

	}

}
class Mark
{
	int x,y,z;          //  Instance variable
	float f;            //  Instance variable
	
	Mark(int a)
	{
		x=a;
		System.out.println("X= "+x);
	}
	
	Mark(float b)
	{
		f=b;
		System.out.println("F= "+b);
	}
	
	Mark(int c,int d)
	{
		y=c;
		z=d;
		System.out.print("Y= "+y);
		System.out.println(", Z= "+z);
	}
	
}