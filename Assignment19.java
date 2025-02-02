//19.Write a program to call a Non-Static Parametrized method 

package assignments;

public class Assignment19 
{
     void add(int a, int b)
     {
    	 System.out.println("Addition");
    	 System.out.println(a+ " " +b);
     }
     
     void student(String name,int a)
     {
    	 System.out.println("Student Details");
    	 System.out.println(name+ " " +a);
     }
	
	public static void main(String[] args) 
	{
		
		Assignment19 n1=new Assignment19();
		n1.add(10, 20);
		n1.student("Sarayu", 10);
	}
}
