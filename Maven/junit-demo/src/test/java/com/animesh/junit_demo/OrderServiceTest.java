package com.animesh.junit_demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.*;
import org.mockito.*;

public class OrderServiceTest {
	
	@Mock
	PaymentService paymentServiceMock;
	
	// Without @InjectMock, you'd need to write:
	// OrderService orderService = new OrderService(paymentServiceMock);
	
	@InjectMocks
	OrderService orderService;
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		System.out.println("\n=== Setting up fresh mocks for next test ===");
		
	}
	/*
	 Basic Test with STUBBING
	 */
	@Test
	@DisplayName("Test successful order Placement")
	void testPlaceOrder_Success() {
		// When and Then
		when(paymentServiceMock.processPayment(500.0)).thenReturn(false);
		
		String result = orderService.placeOrder(300.0);
		
		assertEquals("PAYMENT FAILED", result);
		verify(paymentServiceMock).processPayment(300.0);
	}
	
	/*
	 * STUBBING WITH ANY VALUE
	 * =======================
	 * */
	@Test
	@DisplayName("Test with any amount - mock returns true")
	void testPlaceOrder_AnyAmount() {
		when(paymentServiceMock.processPayment(anyDouble()))
			.thenReturn(true);
	}
	
	 /*
    📌 TESTING EXCEPTIONS
    =====================
    */
    @Test
    @DisplayName("Test when payment service throws exception")
    void testPlaceOrder_Exception() {
        /*
        📌 when().thenThrow() - SIMULATE FAILURES
        ==========================================
        */
        when(paymentServiceMock.processPayment(anyDouble()))
                .thenThrow(new RuntimeException("Bank API down!"));

        /*
        📌 assertThrows() - EXPECT EXCEPTION
        ====================================
        */
        RuntimeException exception = assertThrows(
                RuntimeException.class,
                () -> orderService.placeOrder(100.0)
        );

        assertEquals("Bank API down!", exception.getMessage());
        verify(paymentServiceMock).processPayment(anyDouble());
    }
}
