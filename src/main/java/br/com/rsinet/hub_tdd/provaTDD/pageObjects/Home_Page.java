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

	public static WebElement escrevePesquisa(WebDriver driver) {
		element = driver.findElement(By.id("autoComplete"));
		return element;
	}

	public static WebElement produto(WebDriver driver) throws Exception {
		element = driver.findElement(By.linkText(ExcelUtils.getCellData(1, 0)));
		return element;
	}

	public static WebElement pesquisaHome(WebDriver driver) {
		element = driver.findElement(By.id("tabletsImg"));

		return element;
	}

	// para quando estiver logado
	public static WebElement btnSignout(WebDriver driver) {
		element = driver.findElement(By.className("option roboto-medium ng-scope"));
		return element;
	}

	public static WebElement txtUser(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"menuUserLink\"]/span"));
		return element;
	}

	public static WebElement produtoPesquisado(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"Description\"]/h1"));
		return element;
	}

	public static WebElement produtoInexistente(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"searchPage\"]/div[3]/div/label/span"));
		return element;
	}

	public static WebElement prodProcurado(WebDriver driver) {
		element = driver.findElement(By.linkText("HP Pro Tablet 608 G1"));
		return element;
	}

	public static WebElement prodDetails(WebDriver driver) {
		element = driver.findElement(By.id("details_10"));
		return element;
	}

}
