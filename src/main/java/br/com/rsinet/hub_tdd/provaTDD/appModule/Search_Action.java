package br.com.rsinet.hub_tdd.provaTDD.appModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;

public class Search_Action {

	
	public static void pesquisar(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		driver.manage().window().maximize();
		Home_Page.mobile_search(driver).click();
		Home_Page.escrevepesquisa(driver).sendKeys("HP Pavilion 15t Touch Laptop");
		Home_Page.escrevepesquisa(driver).sendKeys(Keys.ENTER);
//		
		wait.until(ExpectedConditions.urlContains("search"));
//		
		wait.until(ExpectedConditions.visibilityOf(Home_Page.produto(driver)));
		
		
		Home_Page.produto(driver).click();
		
		
		
	}

}
