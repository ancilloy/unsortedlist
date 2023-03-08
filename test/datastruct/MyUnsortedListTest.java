package datastruct;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyUnsortedListTest {

	@Test
	public void emptyTest1() {
		MyUnsortedList<Integer> l = MyUnsortedList.of();
		assertTrue("New list is empty", l.isEmpty());
	}
	@Test
	public void emptyTest2() {
		MyUnsortedList<Integer> l = MyUnsortedList.of();
		l.append(12);
		l.append(42);
		assertFalse("Appended list is not empty", l.isEmpty());
	}
	@Test
	public void emptyTest3() {
		MyUnsortedList<Integer> l = MyUnsortedList.of(12, 42);
		
		l.pop();
		l.pop();
		assertTrue("Emptied list is empty", l.isEmpty());
	}


	@Test
	public void sizeTest1() {
		MyUnsortedList<Integer> l = MyUnsortedList.of();
		assertEquals("New list size is 0", 0, l.size());
	}
	@Test
	public void sizeTest2() {
		MyUnsortedList<Integer> l = MyUnsortedList.of();
		l.prepend(12);
		assertEquals("Prepended list size increases ", 1, l.size());
	}
	@Test
	public void sizeTest3() {
		MyUnsortedList<Integer> l = MyUnsortedList.of(12);
		l.append(36);
		assertEquals("Appended list size increases ", 2, l.size());
	}
	@Test
	public void sizeTest4() {
		MyUnsortedList<Integer> l = MyUnsortedList.of(12, 36);
		l.insert(24, 1);
		assertEquals("Inserted list size increases ", 3, l.size());
	}
	@Test
	public void sizeTest5() {
		MyUnsortedList<Integer> l = MyUnsortedList.of(12, 24, 36);
		l.remove(1);
		assertEquals("Removed list size decreases ", 2, l.size());
	}
	@Test
	public void sizeTest6() {
		MyUnsortedList<Integer> l = MyUnsortedList.of(12, 36);
		l.popLast();
		assertEquals("PopLasted list size decreases ", 1, l.size());
	}
	@Test
	public void sizeTest7() {
		MyUnsortedList<Integer> l = MyUnsortedList.of(12);
		l.pop();
		assertEquals("Popped list size decreases ", 0, l.size());
	}
	
	
	@Test
	public void ofTest() {
		MyUnsortedList<Integer> l = MyUnsortedList.of(12, 24, 36);
		int n;

		n = l.pop();
		assertEquals("Of test part 1", 12, n);
		n = l.pop();
		assertEquals("Of test part 2", 24, n);
		n = l.pop();
		assertEquals("Of test part 3", 36, n);
	}
	
	
	@Test
	public void insertionTest1() {
		MyUnsortedList<Integer> l = MyUnsortedList.of();

		l.prepend(36);
		l.prepend(24);
		l.prepend(12);
		assertEquals("Insertion test with prepend", MyUnsortedList.of(12, 24, 36), l);
	}
	@Test
	public void insertionTest2() {
		l = MyUnsortedList.of();
		l.append(36);
		l.append(24);
		l.append(12);
		assertEquals("Insertion test with append", MyUnsortedList.of(36, 24, 12), l);
	}
	@Test
	public void insertionTest3() {
		l = MyUnsortedList.of(36, 24, 12);
		l.insert(30, 1);
		l.insert(18, 3);
		assertEquals("Insertion test with insert", MyUnsortedList.of(36, 30, 24, 18, 12), l);
	}
	
	
	@Test
	public void deletionTest() {
		MyUnsortedList<Integer> l = MyUnsortedList.of(36, 30, 24, 18, 12);
		
		int n = l.pop();
		assertEquals("Deletion test with pop (list)",  MyUnsortedList.of(30, 24, 18, 12), l);
		assertEquals("Deletion test with pop (value)", 36,                                n);
	}
	@Test
	public void deletionTest() {
		MyUnsortedList<Integer> l = MyUnsortedList.of(30, 24, 18, 12);
		
		int n = l.popLast();
		assertEquals("Deletion test with popLast (list)",  MyUnsortedList.of(30, 24, 18), l);
		assertEquals("Deletion test with popLast (value)", 12,                            n);
	}
	@Test
	public void deletionTest() {
		MyUnsortedList<Integer> l = MyUnsortedList.of(30, 24, 18);
		n = l.remove(1);
		assertEquals("Deletion test with remove (list)",  MyUnsortedList.of(30, 18), l);
		assertEquals("Deletion test with remove (value)", 24,                        n);	
	}
}
