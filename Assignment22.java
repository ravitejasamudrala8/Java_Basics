//22.Write a program on method Overloading and consturctor overloading

package assignments;

public class Assignment22 
{
	static void add()
	{
		System.out.println("Addition1");
	}

	static void add(int a, int b)
	{
		System.out.println("Addition2");
		System.out.println(a+b);
	}

	static void add(String name, char ch)
	{
		System.out.println("Addition3");
		System.out.println(name+ " " +ch);
	
	}

	 void student()
	{
		System.out.println("Addition4");
		
	}

	 void student(int a , int b)
	{
		System.out.println("Addition5");
		System.out.println(a+b);

		
	}

	 void student(String name, char ch)
	{
		System.out.println("Addition6");
		System.out.println(name+ " " +ch);
	}
       Assignment22()
       {
	
    	   System.out.println("Constructor1");
        }
       
       Assignment22(int a, int b)
       {
	
    	   System.out.println("Constructor2");
   		System.out.println(a+b);

        }
       
       Assignment22(String name, char ch)
       {
	
    	   System.out.println("Constructor3");
    	   System.out.println(name+ " " +ch);
        }
	 
	public static void main(String[] args) 
	{
		add();
		add(10,20);
		add("Sarayu",'F');
		Assignment22 n1=new Assignment22();
		n1.student();
		n1.student(10,20);
		n1.student("Sarayu", 'F');
		new Assignment22();
		new Assignment22(10,20);
		new Assignment22("Sarovar",'F');
		
	}
}
