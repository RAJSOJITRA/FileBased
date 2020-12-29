package LibraryPackage;
import org.json.simple.JSONObject;
import java.util.*;

public class LibraryClass 
{
	HashMap<String,JSONObject> hm = new HashMap<String,JSONObject>();
	public String create(String key,JSONObject obj)
	{
		int i,flag=0;
		String ans = "";
		if(hm.containsKey(key)==true)
		{
			return "Key is already present";
		}
		else 
		{
			if(key.length()!=32)
			{
				flag++;
				return "Invalid Key";
			}
			else 
			{
				for(i=0;i<key.length();i++)
				 {
					 int k = key.charAt(i);
					 if(k<65 || k>90)
					 {
						 flag++;	
						 return "Invalid key";
					 }
				 }
			}
			if(flag==0)
			{
				hm.put(key, obj);
				ans = "Key added Successfully";
			}
		}
		return ans;
	}
	public String read(String key)
	{
		String ans = "";
		int flag=0;
		if(hm.containsKey(key)==true)
		{
			System.out.println(hm.get(key));
			ans = "Key found Successfully";
			flag++;
		}
		if(flag==0)
		{
			ans = "Key not found";
		}
		return ans;		
	}
	public String Delete(String key)
	{
		String ans = "";
		int flag=0;
		if(hm.containsKey(key)==true)
		{
			System.out.println(hm.remove(key));
			ans = "Key removed Successfully";
			flag++;
		}
		if(flag==0)
		{
			ans = "Key not found";
		}
		return ans;
	}

}
