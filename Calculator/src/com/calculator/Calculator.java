package com.calculator;

import java.util.Scanner;
import java.lang.*;

public class Calculator {
	public static void main(String args[]) {
		
		while(true) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number");
		int num1= sc.nextInt();
		System.out.println("Enter second number");
		int num2= sc.nextInt();
		
		System.out.println("Select Operation \n 1.Add \n 2.Sub \n 3.Div \n 4.Mul  \n 5.Exit");
		int num3= sc.nextInt();
		
		   switch(num3){  
		    //Case statements  
		    case 1: int add= num1+num2;System.out.println("Addition is"+ add);  
		    break;  
		    case 2:int sub= num1-num2; System.out.println("Substraction is"+sub );  
		    break;  
		    case 3: int div= num1/num2;System.out.println("Division is" +div);  
		    break; 
		    case 4: int mul= num1*num2;System.out.println("Multiplication is" +mul);  
		    break; 
		    case 5: System.exit(0);
		    break; 
		    //Default case statement  
		    default:System.out.println("Wrong choice");  
		    }
		}
		}

}
