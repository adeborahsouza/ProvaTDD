package br.com.rsinet.hub_tdd.provaTDD.appModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;

public class Home_Action {
	public static void logout(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.urlToBe("http://advantageonlineshopping.com/#/"));
		Home_Page.btnUser(driver).click();
		Home_Page.btnsignout(driver).click();

	}
}