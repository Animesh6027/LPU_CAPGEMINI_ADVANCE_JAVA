package test.com.tyss;
import org.junit.jupiter.api.Test;
import main.com.tyss.LoanService;
import static org.junit.jupiter.api.Assertions.*;

class LoanServiceTest {

    LoanService service = new LoanService();

    @Test
    void testValidEligibility() {
        assertTrue(service.isEligible(30, 40000));
    }

    @Test
    void testInvalidAgeLow() {
        assertFalse(service.isEligible(20, 30000));
    }

    @Test
    void testInvalidAgeHigh() {
        assertFalse(service.isEligible(61, 30000));
    }

    @Test
    void testInvalidSalary() {
        assertFalse(service.isEligible(30, 20000));
    }

    @Test
    void testValidEMI() {
        double emi = service.calculateEMI(120000, 2);
        assertEquals(5000, emi);
    }

    @Test
    void testInvalidLoanAmount() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.calculateEMI(0, 2);
        });
    }

    @Test
    void testInvalidTenure() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.calculateEMI(100000, 0);
        });
    }

    @Test
    void testPremiumCategory() {
        assertEquals("Premium", service.getLoanCategory(800));
    }

    @Test
    void testStandardCategory() {
        assertEquals("Standard", service.getLoanCategory(650));
    }

    @Test
    void testHighRiskCategory() {
        assertEquals("High Risk", service.getLoanCategory(500));
    }

    @Test
    void testBoundaryValuesWithAssertAll() {
        assertAll("Boundary Tests",
                () -> assertTrue(service.isEligible(21, 25000)),
                () -> assertTrue(service.isEligible(60, 25000)),
                () -> assertEquals("Standard", service.getLoanCategory(600)),
                () -> assertEquals("Premium", service.getLoanCategory(750)),
                () -> assertNotNull(service.getLoanCategory(700))
        );
    }
}

