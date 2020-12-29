package LibraryPackage;

import static org.junit.Assert.*;

import org.json.simple.JSONObject;
import org.junit.Test;

public class CreateTest {

	@Test
	public void test()
	{
		JSONObject ob = new JSONObject();
		ob.put("VIKI", "18");
		LibraryClass obj = new LibraryClass();
		String result = obj.create("QWERTYUIOPASDFGHJKLZXCVBNMQWERTY", ob);
		assertEquals("Key added Successfully",result);
	}

}
