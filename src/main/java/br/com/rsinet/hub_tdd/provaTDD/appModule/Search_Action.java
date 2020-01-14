package br.com.rsinet.hub_tdd.provaTDD.appModule;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;
import br.com.rsinet.hub_tdd.provaTDD.util.ExcelUtils;

public class Search_Action {

	public static void pesquisar(WebDriver driver) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.visibilityOf(Home_Page.mobile_search(driver)));
		Home_Page.mobile_search(driver).click();
		Home_Page.escrevepesquisa(driver).sendKeys(ExcelUtils.getCellData(1, 0));
		Home_Page.escrevepesquisa(driver).sendKeys(Keys.ENTER);
////		
		wait.until(ExpectedConditions.urlContains("search"));
////		
		wait.until(ExpectedConditions.visibilityOf(Home_Page.produto(driver)));
//
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].click();", Home_Page.produto(driver));

	}

}
