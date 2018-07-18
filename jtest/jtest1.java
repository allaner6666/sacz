import static org.junit.Assert.*;

import org.junit.Test;

public class jtest1 {

	@Test
	public void test_add_when_exists() {
		MyFirstTest mft = new MyFirstTest();
		mft.add("ABC", "Fundamental");
		
		assertEquals(-1 ,mft.add("ABC", "1234"));
	}
	@Test
	public void test_add_when_not_exists() {
		MyFirstTest mft = new MyFirstTest();
		assertEquals(0 ,mft.add("ABC", "1234"));
	}

	@Test
	public void test_retrieve_when_exist() {
		MyFirstTest mft = new MyFirstTest();
		mft.add("ABC", "Fundamental");
		assertEquals("Fundamental" ,mft.retrieve("ABC"));
	}
	
	@Test
	public void test_retrieve_when_not_exist() {
		MyFirstTest mft = new MyFirstTest();
		assertEquals(null ,mft.retrieve("123"));
	}

	@Test
	public void test_delete_when_exist() {
		MyFirstTest mft = new MyFirstTest();
		mft.add("ABC", "Fundamental");
		assertEquals("Fundamental" ,mft.delete("ABC"));
	}

	@Test
	public void test_delete_when_not_exist() {
		MyFirstTest mft = new MyFirstTest();
		assertEquals(null ,mft.delete("123"));
	}
}
