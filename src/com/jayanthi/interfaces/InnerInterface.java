package com.jayanthi.interfaces;


interface Bank
{
   void display();
   interface BankAtm  // by default every iner interface is public , sttic whether we are declared or not
   {
	   void cashWithDraw();
   }
	
}
public class InnerInterface implements Bank.BankAtm     // implementation for inner interface
{

	@Override
	public void cashWithDraw() {
		System.out.println("cash withdraw");
		
	}
	
	public static void main(String[] args) {
		Bank.BankAtm name = new InnerInterface();
		name.cashWithDraw();
	}

	/*@Override
	public void display() {                              //this is only for outer interface
		System.out.println("outer interface");*/
		
	}

