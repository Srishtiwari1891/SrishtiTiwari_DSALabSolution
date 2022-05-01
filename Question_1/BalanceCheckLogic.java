package com.greatlearning.dsa.lab3.balancecheck;

import java.util.Stack;

public class BalanceCheckLogic {

	public boolean checkBalance(String exp) {
		//Initialize Stack
		Stack<Character> stack = new Stack<Character>();
		char chr;
		//Traverse through the exp that contains brackets to be checked
		for(int i=0;i<exp.length();i++)					
		{
			chr= exp.charAt(i);
			
			//Read opening brackets one by one and push into the stack
			if(chr=='(' || chr=='[' || chr=='{'){ 
				stack.push(chr);
				continue;
			}
			
			//Check for EmptyStack and return if true
			if(stack.isEmpty()) 				
				return false;
			
			//Check for each closing bracket and pop the stack if the opening the stack has corresponding opening bracket
			switch(chr) { 						
				case ')':
						if(stack.pop()!='(')
							return false;
						break;
				
				case ']':
						if(stack.pop()!='[')
							return false;
						break;
				
				case '}':
						if(stack.pop()!='{')
							return false;
						break;
			}
		}

		//Check for Empty Stack and return true or false
		return(stack.isEmpty());
	}
}
