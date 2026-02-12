package test.com.tyss;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.com.tyss.StudentService;

public class StudentServiceTest {

    @Test
    public void testEligibleAge(){
        StudentService service = new StudentService();
        assertTrue(service.isEligible(18));
    }

    @Test
    public void testNotEligibleAge(){
        StudentService service = new StudentService();
        assertFalse(service.isEligible(17));
    }

    @Test
    public void testEqualAge(){
        StudentService service = new StudentService();
        assertEquals(true, service.isEligible(19));
    }

    @Test
    public void testNotEqualsAge() {
    	StudentService service = new StudentService();
    	assertNotEquals(false, service.isEligible(21));
    }
    
    @Test
    public void testNullAge(){
        StudentService service = new StudentService();
        assertNotNull(service.isEligible(18));
    }

    @Test
    public void testSameAge(){
        StudentService service = new StudentService();
        StudentService service2 = service;
        assertSame(service, service2);
    }

    @Test
    public void testDifferentAge(){
        StudentService service = new StudentService();
        StudentService service2 = new StudentService();
        assertNotSame(service, service2);
    }

    @Test
    public void testAllAges(){
        StudentService service = new StudentService();
        assertAll(
            () -> assertTrue(service.isEligible(18)),
            () -> assertFalse(service.isEligible(17)),
            () -> assertThrows(IllegalArgumentException.class, () -> {
                service.isEligible(-1);
            })
        );
    }

    @Test
    public void testNegativeAge(){
        StudentService service = new StudentService();
        assertThrows(IllegalArgumentException.class, () -> {
            service.isEligible(-5);
        });
    }

    @Test
    public void testFail() {
    	StudentService service = new StudentService();
    	if(!service.isEligible(18)) {
    		fail("Expected to be eligible");
    	}
    }
}
