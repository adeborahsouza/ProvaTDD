package br.com.rsinet.hub_tdd.provaTDD.appModule;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;

public class Action {

	       public static void Cadastrar(WebDriver driver){

		Home_Page.btnUser(driver).click();

		Login_Page.txtbx_UserName(driver).sendKeys("testuser_1");

		Login_Page.txtbx_Password(driver).sendKeys("Test@123");

		Login_Page.btn_LogIn(driver).click();

	   }

	}
	
	

