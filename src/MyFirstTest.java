import java.util.*;

public class MyFirstTest {
	 private HashMap<String,String> a = new HashMap<String,String>();    
	 public int add(String title, String Content) {
		 	if(a.containsKey(title))
		 		return -1;
		 	else
		 	{
		 		a.put(title, Content);
		 		return 0;
		 	}
	 }
	public String retrieve(String Title) {
		if(a.containsKey(Title))
			return a.get(Title);
		return null;
	}
	
	public String delete(String title) {
		return a.remove(title);
	}
}
