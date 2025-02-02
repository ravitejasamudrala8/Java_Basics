//21.Write a program on method Overloading with static method and non static method

package assignments;

public class Assignment21 
{
	static void add()
	{
		System.out.println("addition1");
	}
	static void add(int a, int b)
	{
		System.out.println("addition2");
		System.out.println(a+ " " +b);
	}
	static void add(String name, char gender)
	{
		System.out.println("addition3");
		System.out.println(name+ " " +gender);
		
	}
	

	void student()
	{
		System.out.println("Student1 Details");
	}
	
	void student(int a, int b)
	{
		System.out.println("Student1 Details");
		System.out.println(a+ " " +b);
	}
	
	void student(String name, char gender)
	{
		System.out.println("Student1 Details");
		System.out.println(name+ " " +gender);
		
	}

	public static void main(String[] args) 
	{
		add();
		add(10,20);
		add("Sireesha", 'F');
		
		Assignment21 n1=new Assignment21();
		n1.student();
		n1.student(10, 20);
		n1.student("Sireesha", 'F');
		
	}
}
