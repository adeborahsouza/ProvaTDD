package br.com.rsinet.hub_tdd.provaTDD.appModule;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;

public class Home_Action {
	private static Logger Log = Logger.getLogger(Logger.class.getName());

	public static void logout(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Log.info("Adicionando uma espera implicita.");

		wait.until(ExpectedConditions.urlToBe("http://advantageonlineshopping.com/#/"));
		Log.info("Espera a url desejada.");

		Home_Page.btnUser(driver).click();
		Log.info("Clicando no elemento.");

		Home_Page.btnSignout(driver).click();
		Log.info("Clicando no elemento.");

	}
}