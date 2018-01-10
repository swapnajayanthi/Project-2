package com.lambdaexpr.selenium;

interface Demo<T1, T2>
{
	boolean check(T1 t1, T2 t2);
}
public class Test2 {
boolean b;
	public static void main(String[] args) {
		Demo<String, String> b = (s1, s2)->{boolean b = s1.equalsIgnoreCase(s2); 
		return b;};
		boolean b1 = b.check("java", "selenium");
		System.out.println(b);
		Demo<int, int> b1 = (s1, s2)->{boolean c = true;
		if(s1==s2)
		{
			c = true;
		}
		else{
			c = false;
		}
		return c;};
		}
	

	}

}
