package datastructures;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class LinkedListTests {
	LinkedList list;
	
	@Before 
	public void setup() {
		list = new LinkedList();
	}
	
	@Test
	public void testPush() {
		list.push("A");
		
		assertEquals(1, list.size());
		assertEquals("A", list.get(0));
	}
	
	@Test 
	public void testPush2() {
		list.push("A");
		list.push("B");
		
		assertEquals(2, list.size());
		assertEquals("B", list.get(0));
		assertEquals("A", list.get(1));
	}
	
	@Test 
	public void testRemove() {
		list.push("A");
		list.push("B");
		list.push("C");
		
		assertEquals(3, list.size());
		assertEquals("B", list.remove(1));
		assertEquals(2, list.size());
		assertEquals("A", list.get(1));
	}
	
}
