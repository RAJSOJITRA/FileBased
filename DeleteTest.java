package LibraryPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeleteTest {

	@Test
	public void test() 
	{
		LibraryClass obj = new LibraryClass();
		String result = obj.read("QWERTYUIOPASDFGHJKLZXCVBNMQWERTY");
		assertEquals("Key not found",result);
	}

}
