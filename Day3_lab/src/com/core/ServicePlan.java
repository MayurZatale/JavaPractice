package com.core;

public enum ServicePlan {
	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	private double servicePlanCharge;
	
	private ServicePlan(double servicePlanCharge) {
		this.servicePlanCharge=servicePlanCharge;
		
	}


	public double getServicePlanCharge() {
		return servicePlanCharge;
	}

	public String toString() {
		return name()+" Subscription Charges : "+servicePlanCharge ;
	}
	
	
}
