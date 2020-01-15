package br.com.rsinet.hub_tdd.provaTDD.appModule;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;

public class ClickSearch_Action {
	private static Logger Log = Logger.getLogger(Logger.class.getName());

	public static void pesquisarinicio(WebDriver driver) {
		Log.info("Adicionando uma espera implicita.");
		WebDriverWait wait = new WebDriverWait(driver, 20);

		Log.info("Clicando no elemento.");
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].click();", Home_Page.pesquisahome(driver));

	}
}
