package br.com.rsinet.hub_tdd.provaTDD.execute;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;

public class Action {

	       public static void Execute(WebDriver driver){

		Home_Page.btnUser(driver).click();

		LogIn_Page.txtbx_UserName(driver).sendKeys("testuser_1");

		LogIn_Page.txtbx_Password(driver).sendKeys("Test@123");

		LogIn_Page.btn_LogIn(driver).click();

	   }

	}
	
	

