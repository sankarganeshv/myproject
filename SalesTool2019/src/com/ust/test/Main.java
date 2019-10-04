package com.ust.test;
import com.ust.test.SalesData;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalesData objSales=new SalesData();
		System.out.println("filled");
		displayGreetings();
		objSales.display();
	}
	

	private static void  displayGreetings()
	{
		System.out.println("greetings");

	}

}
