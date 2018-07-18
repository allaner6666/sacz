import static org.junit.Assert.*;

import org.junit.Test;

public class jtest1 {

	@Test
	public void test_showlist() {
		program mft = new program();
		int count=mft.showCurrentList();
		assertTrue(count==0);
	}
	
	@Test
	public void test_add_new_item() {
		program mft1 = new program();
		assertEquals(true, mft1.addNewItem("hello"));
		int count=mft1.showCurrentList();
		assertTrue(count==1);
		assertEquals(false, mft1.addNewItem("hello"));
		count=mft1.showCurrentList();
		assertTrue(count==1);
	}
}
