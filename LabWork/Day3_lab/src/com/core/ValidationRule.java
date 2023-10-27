package com.core;

import java.time.LocalDate;

import com.exception.InValidInputException;

public class ValidationRule {

	//Method for Parsing & Validating service plan entered by user which is initially of String type in ServicePlan type.
	public static ServicePlan parseAndValidation(String servicePlan)throws InValidInputException {
		
//		if(ServicePlan.valueOf(servicePlan.toUpperCase())!=ServicePlan.plan.names()) {      should we use value() or write a getter
//			throw new InValidInputException("InValide Plan");
//		}
		return ServicePlan.valueOf(servicePlan.toUpperCase());
	
	}
	
	public static double validatePlanAmount(String servicePlan,double regAmount)throws InValidInputException{
		
		if(ServicePlan.valueOf(servicePlan.toUpperCase()).getServicePlanCharge()!=regAmount) {
			throw new InValidInputException("Invalide Amount");
		}
		return regAmount;
		
	}
	
	public static Customer valideAll( String firstName, String lastName, String email, String password, double regAmount, String dob, String servicePlan)throws InValidInputException {
		
		ServicePlan plan = parseAndValidation(servicePlan);
		
		double amount = validatePlanAmount(servicePlan,regAmount);
		
		return new Customer(firstName, lastName, email, password, amount, LocalDate.parse(dob), plan);
	}
	
	
}
