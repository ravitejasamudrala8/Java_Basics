package assignments;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class MapProgram 
{
  public static void main(String[] args) 
	{
	Map<String,Character> m1=new HashMap<String,Character>();
		m1.put("student1", 'f');
		m1.put("student2", 'm');
		m1.put("student3", 'f');
		m1.put("student4", 'm');
		m1.put("student5", 'f');
		m1.put("student6", 'm');
		
		
	//	Set<String>s1=	m1.keySet();
		System.out.println("Fetching all keys->");
		for(String key   :m1.keySet())
		{
			System.out.println(key);
		}
		System.out.println("Fetching all values->");
		for(Character value   :m1.values())
		{
			System.out.println(value);
		}
		System.out.println("Fetching all key and values->");

	Set<Entry<String,Character>>	kv=			m1.entrySet();
		
		Iterator<Entry<String,Character>> i1=kv.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
		}
}
