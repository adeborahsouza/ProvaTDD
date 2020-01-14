package br.com.rsinet.hub_tdd.provaTDD.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.rsinet.hub_tdd.provaTDD.util.ExcelUtils;

public class Home_Page {

	private static WebElement element = null;

	public static WebElement btnUser(WebDriver driver) {
		// encontrando o elemento de user e clicando
		element = driver.findElement(By.id("menuUser"));
		return element;
	}

	public static WebElement mobile_search(WebDriver driver) {
		// encontrando o elemento lupa e clicando
		element = driver.findElement(By.id("menuSearch"));
		return element;
	}

	public static WebElement escrevepesquisa(WebDriver driver) {
		element = driver.findElement(By.id("autoComplete"));
		return element;
	}

	public static WebElement produto(WebDriver driver) throws Exception {
		element = driver.findElement(By.linkText(ExcelUtils.getCellData(1, 0)));
		return element;
	}

	public static WebElement pesquisahome(WebDriver driver) {
		element = driver.findElement(By.id("tabletsImg"));
		
		return element;
	}

	// para quando estiver logado
	public static WebElement btnsignout(WebDriver driver) {
		element = driver.findElement(By.className("option roboto-medium ng-scope"));
		return element;
	}

}
