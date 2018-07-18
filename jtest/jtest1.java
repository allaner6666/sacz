import static org.junit.Assert.*;

import org.junit.Test;

public class jtest1 {

	@Test
	public void test_showlist() {
		program mft = new program();
		int count=mft.showCurrentList();
		assertTrue(count==0);
	}
}
