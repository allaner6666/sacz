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
	public void test_add_new_item() {
		program mft1 = new program();
		assertTrue(mft1.addNewItem("hello"));
		int count=mft1.showCurrentList();
		assertTrue(count==1);
		assertFalse(mft1.addNewItem("hello"));
		count=mft1.showCurrentList();
		assertTrue(count==1);
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
	
	@Test
	public void test_Mark_item()
	{
		program mft = new program();
		
		mft.findITemInTheList("itemtoFind1");
		ArrayList<String> testList3 = new ArrayList<String>();
		assertTrue("result", testList3.equals(mft.list));
		
		mft.showItemAsComplete("itemComplete1");
		ArrayList<String> testList4 = new ArrayList<String>();
		assertTrue("result", testList4.equals(mft.list));
	}
}
