/**
 * @author Sydney Stokes
 */

package org.howard.edu.lsp.assignment5;

import org.howard.edu.lsp.assignment5.IntegerSet.IntegerSetException;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;


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
		test_set.add(32);
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
		test_set.add(32);
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
		
	}
	
	@Test
	@DisplayName("Test case for remove")
	void testRemove() {
		
	}
	
	@Test
	@DisplayName("Test case for union")
	void testUnion() {
		
	}
	
	@Test
	@DisplayName("Test case for intersect")
	void testIntersect() {
		
	}
	
	@Test
	@DisplayName("Test case for difference")
	void testDifference() {
		
	}
	
	@Test
	@DisplayName("Test case for isEmpty")
	void testEmpty() {
		assertTrue(test_set.isEmpty());
	}
	
	@Test
	@DisplayName("Test case for toString")
	void testString() {
		
	}
	@AfterEach
	void tearDown() throws Exception {
		test_set = null;
	}
		
	
}