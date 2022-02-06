package com.project.searchemail;

import java.util.ArrayList;
import java.util.Scanner;


public class SearchEmail {
	public static void main(String args[]) {
		ArrayList<String> email = new ArrayList<String>();
	    email.add("saurabh@gmail.com");
	    email.add("shubham@gmail.com");
	    email.add("prasad@gmail.com");
	    email.add("umar@gmail.com");
	    email.add("prasenjeet@gmail.com");
	    System.out.println(email.get(0));
	  
	    Scanner sc =new Scanner(System.in);
	    System.out.println("Enter Email Id to Search");
	    String str= sc.nextLine(); //reads string.
	  
	    

	    for(int i=0; i<email.size();i++) {
	    	if(email.get(i).equals(str)) {
	    		System.out.println("found :"+email.get(i));
	    		break;
	    	}else {
	    		System.out.println("Not found");
	    		break;
	    	}
	    	
	    }

	    
	}

}
