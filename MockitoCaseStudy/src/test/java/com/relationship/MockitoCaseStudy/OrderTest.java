package com.relationship.MockitoCaseStudy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OrderTest {
	
	@Mock
	Payment paymentMock;
	
	@InjectMocks
	Order order;
	
	@Test
	@DisplayName("Test successful payment")
	public void testSuccessfulPayment() {
		when(paymentMock.processPayment(2000.0)).thenReturn(true);
		String result = order.placeOrder(2000.0);
		assertEquals("Order Confirmed", result);
		verify(paymentMock).processPayment(2000.0);
	}
	
	@Test
	@DisplayName("Test Payment Failure")
	public void testPaymentFailure() {
		when(paymentMock.processPayment(1500.0)).thenReturn(false);
		RuntimeException rx = assertThrows(
				RuntimeException.class, ()-> 
				order.placeOrder(1500.0)
				);
		
		assertEquals("Payment Failed", rx.getMessage());
		verify(paymentMock).processPayment(1500.0);

	}
	
	@Test
	@DisplayName("Test Invalid Order")
	void testInvalidAmount() {
		IllegalArgumentException iex = assertThrows(
				IllegalArgumentException.class, () ->
				order.placeOrder(0.0));
		assertEquals("Invalid Order Amount",iex.getMessage());
//		verify(paymentMock).processPayment(0);
	}
}
