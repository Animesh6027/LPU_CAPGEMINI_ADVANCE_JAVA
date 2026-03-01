package test.com.tyss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.com.tyss.StudentService;

public class StudentServiceTest {
	
	StudentService st = new StudentService();
	
	@Test
	void testGrade() {
		assertEquals("Distinction", st.calculateGrade(80));
		assertEquals("First Class", st.calculateGrade(65));
		assertEquals("Second Class", st.calculateGrade(55));
		assertEquals("Fail", st.calculateGrade(40));
	}
	
	@Test
	void testPassStatus() {
		assertTrue(st.isPassed(75));
	}
	
	@Test
	void testFailStatus() {
		assertFalse(st.isPassed(45));
	}
	
	@Test
	void testInvalid() {
		assertThrows(IllegalArgumentException.class, () ->
		{st.calculateGrade(-10);});
		
		assertThrows(IllegalArgumentException.class, () -> {
			st.calculateGrade(120);
		});
	}
	
	@Test
	void testNotNull() {
		assertNotNull(st.calculateGrade(70));
	}
	

	
	
}
