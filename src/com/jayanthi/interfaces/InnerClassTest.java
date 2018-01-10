package com.jayanthi.interfaces;

import com.jayanthi.interfaces.Bank1.BankAtm1;

interface Bank1
{
	void display();
	abstract class BankAtm1
	{
		abstract void cashWithDraw1();
	}
}
public class InnerClassTest extends BankAtm1
{

	@Override
	void cashWithDraw1() {
		System.out.println("cash withdraw");
	}

		public static void main(String[] args) {
			InnerClassTest i = new InnerClassTest();
			i.cashWithDraw1();
		}
}
