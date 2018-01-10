package com.jayanthi.interfaces;


class TestInner
{
	interface Test
	{
		void greetings();
	}
}

public class InnerInterfaceatClasslevel implements TestInner.Test {

	@Override
	public void greetings() {
		System.out.println("welcome to ramesh soft");
		
	}
public static void main(String[] args) {
	TestInner.Test test = new InnerInterfaceatClasslevel();
	test.greetings();
}
}
