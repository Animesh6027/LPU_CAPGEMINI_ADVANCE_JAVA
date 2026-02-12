package test.com.tyss;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;

import main.com.tyss.Calculator;   

public class CalculatorTest {
	
	Calculator calc = new Calculator();
	
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.subtract(5, 4));
    }

    @Test
    public void testIsEven() {
        Calculator calc = new Calculator();
        assertTrue(calc.isEven(4));
        assertFalse(calc.isEven(5));
    }

    @Test
    public void testMultiply() {
    	Calculator calc = new Calculator();
    	assertEquals(16, calc.multiply(4, 4));
    	
    	int result = calc.multiply(5, 2);
    	assertNotEquals(6, result);
    }
    
    @Test
    public void testCalculatorNotNull() {
    	Calculator calc = new Calculator();
    	assertNotNull(calc);
    }
    
    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.divide(10, 2));

        assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(10, 0);
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
        	calc.divide(10, -5);
        });
    }
    
    // ========== PARAMETERIZED TESTING ============
    
    @ParameterizedTest
    @CsvSource({
    	"2, 3, 5",
    	"0, 0, 0",
    	"-5, 10, 5",
    	"100, 200, 300"
    })
    public void testAddParameterized(int a, int b, int expected) {
    	assertEquals(expected, calc.add(a,b));
    }
    
    @ParameterizedTest
    @CsvSource({
    	"10,5,5",
    	"10,9,1",
    	"45,12,33"
    })
    public void testSubtractParameterized(int a, int b, int expected) {
    	assertEquals(expected, calc.subtract(a, b));
    }
    
    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8,10,12,14,-6})
    public void testIsEvenReturnsTrue(int number) {
    	assertTrue(calc.isEven(number));
    }
    
    @ParameterizedTest
    @ValueSource(ints = {1,3,5,7,9,11,-5,-9})
    public void testIsEvenReturnsFalse(int number) {
    	assertFalse(calc.isEven(number));
    }
    
    @ParameterizedTest
    @MethodSource("addTestData")
    public void testAddMethod(int a, int b, int expected) {
    	assertEquals(expected, calc.multiply(a, b));
    }
    private static Stream<Arguments> addTestData() {
    	return Stream.of(
    			Arguments.of(10,10,100),
    			Arguments.of(5,-5,-25),
    			Arguments.of(15,20,300)
    			);
    }
    
    @ParameterizedTest
    @CsvFileSource(files = "test-data/add.csv", numLinesToSkip = 1)
    public void testFromCsv(int a, int b, int expected) {
    	System.out.println("Simple @CsvFileSourceExists: " + a  + " + " + b);
    	assertEquals(expected, calc.add(a, b));
    }
    
    
    
}
