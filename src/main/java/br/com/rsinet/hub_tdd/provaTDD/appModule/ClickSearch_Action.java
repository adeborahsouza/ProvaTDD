package br.com.rsinet.hub_tdd.provaTDD.appModule;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;

public class ClickSearch_Action {

	public static void pesquisarinicio(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 20);

		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].click();", Home_Page.pesquisahome(driver));

	}
}
