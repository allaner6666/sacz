import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class jtest1 {

	@Test
	public void test_showlist() {
		program mft = new program();
		int count=mft.showCurrentList();
		assertTrue(count==0);
	}
	
	@Test 
	public void test_deleteItem()
	{
		program mft = new program();
		
		mft.list.add("item1");
		ArrayList<String> testList = new ArrayList<String>();
		testList.add("item1");	
		assertTrue("result", testList.equals(mft.list));
		
		mft.deleteItem("item1");
		ArrayList<String> testList2 = new ArrayList<String>();
		assertTrue("result", testList2.equals(mft.list));
	}
}
