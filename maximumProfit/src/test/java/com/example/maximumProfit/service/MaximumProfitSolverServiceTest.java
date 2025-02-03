package com.example.maximumProfit.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaximumProfitSolverServiceTest {

	private MaximumProfitSolverService service = new MaximumProfitSolverService();
	
	@Test
	public void testMaxProfit() {
		
		assertEquals(5, service.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(0, service.maxProfit(new int[]{7, 6, 4, 3, 1}));
		
	}
}
