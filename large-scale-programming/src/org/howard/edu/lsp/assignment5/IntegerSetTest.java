/**
 * @author Sydney Stokes
 */

package org.howard.edu.lsp.assignment5;

import org.howard.edu.lsp.assignment5.IntegerSet.IntegerSetException;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


class IntegerSetTest{
	
	IntegerSet test_set;

	@BeforeEach
	void setUp() throws Exception {
		test_set = new IntegerSet();
	}

	@Test
	@DisplayName("Test case for clear")
	void testClear() {
		test_set.add(5);
		test_set.add(8);
		test_set.add(3);
		test_set.clear();
		assertEquals(test_set.nums.size(), 0);
	}
	
	@Test
	@DisplayName("Test case for length")
	void testLength() {
		test_set.add(9);
		test_set.add(23);
		test_set.add(3);
		assertTrue(test_set.length() == 3);
	}
	
	@Test
	@DisplayName("Test case for equals")
	void testEquals() {
		IntegerSet test_setB = new IntegerSet();
		
		test_setB.add(78);
		test_setB.add(55);
		test_setB.add(3);
		test_set.add(78);
		test_set.add(55);
		test_set.add(3);
		assertTrue(test_set.equals(test_setB));
	}
	
	@Test
	@DisplayName("Test case for contains")
	void testContains() {
		test_set.add(1);
		assertTrue(test_set.contains(1));
	}
	
	@Test
	@DisplayName("Test case for largest")
	void testLargest() throws IntegerSetException {
		test_set.add(56);
		test_set.add(9);
		test_set.add(1);
		test_set.add(700);
		assertTrue(test_set.largest() == 700);
	}
	
	@Test
	@DisplayName("Test case for largest exception")
	void testLargestException() {
		assertThrows(IntegerSetException.class, () -> test_set.largest());
	}
	
	@Test
	@DisplayName("Test case for smallest")
	void testSmallest() throws IntegerSetException {
		test_set.add(56);
		test_set.add(9);
		test_set.add(1);
		test_set.add(700);
		assertTrue(test_set.smallest() == 1);
	}
	
	@Test
	@DisplayName("Test case for smallest exception")
	void testSmallestException() {
		assertThrows(IntegerSetException.class, () -> test_set.smallest());
	}
	
	@Test
	@DisplayName("Test case for add")
	void testAdd() {
		test_set.add(3);
		test_set.add(5);
		test_set.add(28);
		assertTrue(test_set.contains(28));

	}
	
	@Test
	@DisplayName("Test case for remove")
	void testRemove() {
		test_set.add(3);
		test_set.add(5);
		test_set.add(28);
		test_set.remove(28);
		assertFalse(test_set.contains(28));
		
	}
	
	@Test
	@DisplayName("Test case for union")
	void testUnion() {
		IntegerSet test_setB = new IntegerSet();
		IntegerSet test_setC = new IntegerSet();
	
		test_set.add(78);
		test_set.add(55);
		test_set.add(3);
		
		test_setB.add(4);
		test_setB.add(55);
		test_setB.add(6);
		
		test_setC.add(78);
		test_setC.add(55);
		test_setC.add(3);
		test_setC.add(4);
		test_setC.add(6);
		
		test_set.union(test_setB);
		
		assertTrue(test_set.equals(test_setC));
		
	}
	
	@Test
	@DisplayName("Test case for intersect")
	void testIntersect() {
		IntegerSet test_setB = new IntegerSet();
		IntegerSet test_setC = new IntegerSet();

		test_set.add(78);
		test_set.add(55);
		test_set.add(3);
		
		test_setB.add(4);
		test_setB.add(55);
		test_setB.add(6);
		
		test_setC.add(55);
		
		test_set.intersect(test_setB);
		
		assertTrue(test_set.equals(test_setC));
		
	}
	
	@Test
	@DisplayName("Test case for difference")
	void testDiff() {
		IntegerSet test_setB = new IntegerSet();
		IntegerSet test_setC = new IntegerSet();

		test_set.add(78);
		test_set.add(55);
		test_set.add(3);
		
		test_setB.add(4);
		test_setB.add(55);
		test_setB.add(6);
		
		test_setC.add(78);
		test_setC.add(3);
		
		test_set.diff(test_setB);
		
		assertTrue(test_set.equals(test_setC));
		
	}
	
	@Test
	@DisplayName("Test case for isEmpty")
	void testIsEmpty() {
		assertTrue(test_set.isEmpty());
	}
	
	@Test
	@DisplayName("Test case for toString")
	void testToString() {
		test_set.add(1);
		test_set.add(2);
		test_set.add(3);
		test_set.add(4);
		test_set.add(5);
		
		assertEquals(test_set.toString(), "1 2 3 4 5 ");
	}
	@AfterEach
	void tearDown() throws Exception {
		test_set = null;
	}
		
	
}