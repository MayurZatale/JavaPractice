package com.core;
import java.time.LocalDate;

public class Customer {
	
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private double regAmount;
	private LocalDate dob;
	private ServicePlan plan;
	
	private static int idGenerator=100;
	
//	static {
//		
//	}

	public Customer( String firstName, String lastName, String email, String password, double registrationAmount, LocalDate dob, ServicePlan plan) {
		super();
		this.customerId=idGenerator++;
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.password=password;
		this.regAmount=regAmount;
		this.dob=dob;
		this.plan=plan;
		
		
	}

	@Override
	public String toString() {
		return "Custormer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", password=" + password + ", regAmount=" + regAmount + ", dob=" + dob
				+ ", plan=" + plan + "]";
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof Customer) {
			Customer cust=((Customer)o);
			return this.email.equals(cust.email);
		}
		return false;
	}
	
	
}
