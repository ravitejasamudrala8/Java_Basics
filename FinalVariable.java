package assignments;

public class FinalVariable
{
	final int x=10;
	
	void modify() {
		x=20;
		System.out.println(x);
	}
	public static void main(String[] args) 
	{
		
		FinalVariable n1=new FinalVariable();
		n1.modify(); 
	}
}


