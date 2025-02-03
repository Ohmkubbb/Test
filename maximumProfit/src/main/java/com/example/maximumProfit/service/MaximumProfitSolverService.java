package com.example.maximumProfit.service;

import org.springframework.stereotype.Service;

@Service
public class MaximumProfitSolverService {
	
	public static int maxProfit (int[] prices) {
		int min = prices[0];
		int minIndex = 0;
		
		for (int i = 0; i < prices.length ; i++) {
			if (prices[i] < min) {
				min = prices[i]; 
				minIndex = i;
			}
		}
		
		int max = min;
		
		for (int j = minIndex+1; j < prices.length ; j++) {
			if (max < prices[j]) {
				max = prices[j];
			}
		}
		
		
		return max - min;
	}
	
	
	public static void main(String[] args) {
	    int[] pricesArrOne = {7, 1, 5, 3, 6, 4};
	    int[] pricesArrTwo = {7, 6, 4, 3, 1};
	    System.out.println(maxProfit(pricesArrOne)); 
	    
	    System.out.println(maxProfit(pricesArrTwo));
	}

}
