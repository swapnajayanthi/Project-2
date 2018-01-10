package com.jayanthi.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DependsOnMethods {
@BeforeSuite
public void dmain()
{
 System.out.println("dmain");
}
@AfterSuite
public void amain()
{
 System.out.println("amain");
}
@Test
public void bmain()
{
 System.out.println("bmain");
}
@Test(dependsOnMethods="bmain")
public void cmain()
{
 System.out.println("cmain");
}
@Test
public void gmain()
{
 System.out.println("gmain");
}

}
