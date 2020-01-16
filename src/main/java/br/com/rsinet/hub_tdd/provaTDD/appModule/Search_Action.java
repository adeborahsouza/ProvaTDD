package br.com.rsinet.hub_tdd.provaTDD.appModule;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;
import br.com.rsinet.hub_tdd.provaTDD.util.ExcelUtils;

public class Search_Action {
	private static Logger Log = Logger.getLogger("Classe de pesquisa");

	public static void pesquisar(WebDriver driver) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Log.info("Adicionando uma espera implicita.");

		wait.until(ExpectedConditions.visibilityOf(Home_Page.mobile_search(driver)));
		Log.info("Espera o elemento ser visível na página.");

		Home_Page.mobile_search(driver).click();
		Log.info("Clica no icone de pesquisa.");

		Home_Page.escrevePesquisa(driver).sendKeys(ExcelUtils.getCellData(1, 0));
		Log.info("Preenche a pesquisa com massa de dados do excel.");

		Home_Page.escrevePesquisa(driver).sendKeys(Keys.ENTER);
		Log.info("Pressiona Enter.");

		wait.until(ExpectedConditions.urlContains("search"));
		Log.info("Espera até que na url contenha a palavra search.");

		wait.until(ExpectedConditions.visibilityOf(Home_Page.produto(driver)));
		Log.info("Espera o elemento se tornar visível na página.");

		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].click();", Home_Page.produto(driver));
		Log.info("Clica no elemento.");

	}
	public static void pesquisarInvalido(WebDriver driver) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Log.info("Adicionando uma espera implicita.");

		wait.until(ExpectedConditions.visibilityOf(Home_Page.mobile_search(driver)));
		Log.info("Espera o elemento ser visível na página.");

		Home_Page.mobile_search(driver).click();
		Log.info("Clica no icone de pesquisa.");

		Home_Page.escrevePesquisa(driver).sendKeys(ExcelUtils.getCellData(4, 0));
		Log.info("Preenche a pesquisa com massa de dados do excel.");

		Home_Page.escrevePesquisa(driver).sendKeys(Keys.ENTER);
		Log.info("Pressiona Enter.");

		wait.until(ExpectedConditions.urlContains("search"));
		Log.info("Espera até que na url contenha a palavra search.");

		
		
	}
	

}
