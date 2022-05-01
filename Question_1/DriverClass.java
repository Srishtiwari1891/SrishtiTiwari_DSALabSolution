package com.greatlearning.dsa.lab3.driver;

import java.util.Scanner;

import com.greatlearning.dsa.lab3.balancecheck.BalanceCheckLogic;
public class DriverClass extends IllegalArgumentException {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		BalanceCheckLogic objBal= new BalanceCheckLogic();
		String exp;
		try {
			// Input String of Brackets to test
			System.out.println("Enter Expression to Check:");
			exp=sc.next();
			
			//Check for balanced brackets which return true or false
			if(objBal.checkBalance(exp))
				System.out.println("The entered String has Balanced Brackets");
			else
				System.out.println("The entered Strings do not contain Balanced Brackets");
		}
		catch (IllegalArgumentException e) {
			System.out.println("Please input only positive numbers");
			sc.next();
		}
		finally {
			//Close scanner object
			sc.close();
		}
	}

}
