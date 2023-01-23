package com.minibank.TestClasses;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.minibank.PageObjects.BaseClass;
import com.minibank.PageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void doLogin()
	{
		LoginPage lp=new LoginPage(driver);
		lp.setEleUname("mngr472771");
		lp.setElePass("zagEsUq");
		lp.setEleBtnLogin();
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("GTPL Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
}
