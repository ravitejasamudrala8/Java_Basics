//String function using tocharArray

package assignments;

import java.util.Arrays;

public class StringFunction 
{
	public static void main(String[] args) {
		
    String input="sarayu";
   char[] output =input.toCharArray();
   System.out.println(Arrays.toString(output));
   
	//want to sort the name
	
   Arrays.sort(output);
   System.out.println(Arrays.toString(output));
    
	 
}
}
