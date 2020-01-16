package br.com.rsinet.hub_tdd.provaTDD.appModule;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;
import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Login_Page;

public class Login_Action {
	private static Logger Log = Logger.getLogger(Logger.class.getName());

	public static void logar(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Log.info("Adicionando uma espera implicita.");

		Home_Page.btnUser(driver).click();
		Log.info("Clicando no elemento.");

	}

}
