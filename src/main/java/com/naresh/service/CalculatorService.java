package com.naresh.service;

import org.springframework.stereotype.Component;

@Component("calculatorService")
public class CalculatorService {

	 public double add(double a, double b) {
	        double result = a + b;
	        System.out.println(a + " + " + b + " = " + result);
	        return result;
	    }

	    public double sub(double a, double b) {
	        double result = a - b;
	        System.out.println(a + " - " + b + " = " + result);
	        return result;
	    }

	    public double mul(double a, double b) {
	        double result = a * b;
	        System.out.println(a + " * " + b + " = " + result);
	        return result;
	    }

	    public double div(double a, double b) {
	        if (b == 0) {
	            throw new IllegalArgumentException("Division by zero");
	        }
	        double result = a / b;
	        System.out.println(a + " / " + b + " = " + result);
	        return result;
	    }
}
