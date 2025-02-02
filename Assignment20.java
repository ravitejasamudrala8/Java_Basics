//20.Write a program on the Constructor

package assignments;

public class Assignment20 
{
	Assignment20()
	{
		System.out.println("Addition1");
	}
	
	Assignment20(int a, int b)
	{
		System.out.println("Addition2");
		System.out.println(a+ " " +b);
	}
	Assignment20(String name, char gender)
	{
		System.out.println("Addition3");
		System.out.println(name+ " " +gender);
	}
	public static void main(String[] args) 
	{
		new Assignment20();
		new Assignment20(10,20);
		new Assignment20("Sireesha", 'F');
		
		
	}
}
