import static org.junit.Assert.*;

import org.junit.Test;

public class jtest1 {

	@Test
	public void test_showlist() {
		program mft = new program();
		mft.showCurrentList();
	}
	
	@Test
	public void test_add_new_item() {
		program mft = new program();
		assertEquals(true, mft.addNewItem("hello"));
		assertEquals(false, mft.addNewItem("hello"));
	}
}
