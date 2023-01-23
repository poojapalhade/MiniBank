package com.minibank.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass 
{
	public WebDriver driver;
		public LoginPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy (name="uid")
		WebElement eleUname;

		@FindBy (name="password")
		WebElement elePass;
		
		@FindBy (name="btnLogin")
		WebElement eleBtnLogin;
		
		public WebElement getEleUname() {
			return eleUname;
		}

		public void setEleUname(String name) {
		eleUname.sendKeys(name);;
		}

		public WebElement getElePass() {
			return elePass;
		}

		public void setElePass(String Pass) {
			elePass.sendKeys(Pass);;
		}

		public WebElement getEleBtnLogin() {
			return eleBtnLogin;
		}

		public void setEleBtnLogin() {
			eleBtnLogin.click();
		}
}
