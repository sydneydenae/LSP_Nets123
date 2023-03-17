package org.howard.edu.lsp.midterm.problem51;

import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.lsp.midterm.problem51.Range.EmptyRangeException;
import org.junit.jupiter.api.*;

class IntegerRangeTest {

	IntegerRange my_range;
	
	@BeforeEach
	void setUp() throws Exception {
		my_range = new IntegerRange(1, 5000);
	}

	@Test
	@DisplayName("Test for getLower")
	void testGetLower() {
		assertEquals(my_range.getLower(), 1);
	}
	
	@Test
	@DisplayName("Test for getUpper")
	void testGetUpper() {
		assertEquals(my_range.getUpper(), 5000);
	}
	
	@Test
	@DisplayName("Test for contains")
	void testContains() {
		//testing the contains functions
		assertTrue(my_range.contains(3400));
		assertFalse(my_range.contains(87234));
		assertTrue(my_range.contains(700));
	}
	
	@Test
	@DisplayName("Test for overlaps")
	void testOverlaps() throws EmptyRangeException {
		IntegerRange your_range;
		
		your_range = new IntegerRange(-300, 75);
		assertTrue(my_range.overlaps(your_range));
		assertTrue(your_range.overlaps(my_range));
		
		your_range = new IntegerRange(45, 200);
		assertTrue(my_range.overlaps(your_range));
		assertTrue(your_range.overlaps(my_range));
		
		your_range = new IntegerRange(-10, -3);
		assertFalse(my_range.overlaps(your_range));
		assertFalse(your_range.overlaps(my_range));
		
		
	}
	
	@Test
	@DisplayName("Test for EmptyRangeException")
	void testOverlapsException() {
		IntegerRange your_range = null;
		
		assertThrows(EmptyRangeException.class, () -> my_range.overlaps(your_range));
	}
	
	@Test
	@DisplayName("Test for size")
	void testSize() {
		IntegerRange your_range;
		
		your_range = new IntegerRange(100, 200);
		assertEquals(your_range.size(), 100);
		
		your_range = new IntegerRange(30, 74);
		assertEquals(your_range.size(), 44);
		
		your_range = new IntegerRange(99, 102);
		assertEquals(your_range.size(), 3);
		
		your_range = new IntegerRange(550, 652);
		assertEquals(your_range.size(), 102);
		
		assertEquals(my_range.size(), 4999);
	}
	
	@AfterEach
	void tearDown() throws Exception {
		my_range = null;
	}
}