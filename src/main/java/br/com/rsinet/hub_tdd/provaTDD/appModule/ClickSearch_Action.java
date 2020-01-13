package br.com.rsinet.hub_tdd.provaTDD.appModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;
import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Login_Page;

public class ClickSearch_Action {

		public static void pesquisahome(WebDriver driver) {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			Home_Page.pesquisahome(driver).click();

		
	}
}
