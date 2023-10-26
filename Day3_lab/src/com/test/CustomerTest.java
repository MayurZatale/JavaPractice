package com.test;
import java.util.Scanner;
import com.core.Customer;
import com.core.ValidationRule;
import com.exception.InValidInputException;

public class CustomerTest {

	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in)) {
			
//			Customer cObj=valideAll( String firstName, String lastName, String email, String password, double regAmount, String dob, String servicePlan)
			Customer cObj=ValidationRule.valideAll( sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next());
			System.out.println(cObj);
		}
		catch (InValidInputException e){
			
			System.out.println(e);
		}

	}

}
