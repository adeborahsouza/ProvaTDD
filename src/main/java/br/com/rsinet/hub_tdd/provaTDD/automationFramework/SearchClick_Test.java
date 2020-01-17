package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.provaTDD.appModule.ClickSearch_Action;
import br.com.rsinet.hub_tdd.provaTDD.driverFactory.DriverManager;
import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;
import br.com.rsinet.hub_tdd.provaTDD.util.Print_Func;

public class SearchClick_Test {
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	private static WebDriver driver;

	@BeforeMethod
	public static void openBrowser() {
		driver = DriverManager.startChrome();
		Log.info("Iniciando o ChromeDriver.");
	}

	@Test(priority = 0)
	public void searchHomePositivo() {
		DriverManager.openWebSite(driver);

		Reporter.log("ChromeDriver inicializado com sucesso.");
		ClickSearch_Action.pesquisarinicio(driver);
		Log.info("Inicializando o método de pesquisa pela página inicial.");

		assertEquals(Home_Page.prodProcurado(driver).getText().toUpperCase()
				.contains(Home_Page.produtoPesquisado(driver).getText()), true);

		Reporter.log("Pesquisa realizada com sucesso.");
		Print_Func.captureScreenShot(driver);
		Log.info("Print da tela.");
	}

	@Test(priority = 1)
	public void searchHomeNegativo() {
		DriverManager.openWebSite(driver);

		Reporter.log("ChromeDriver inicializado com sucesso.");
		// chama os metodos criados nas paginas de ação
		ClickSearch_Action.pesquisarinicioInvalido(driver);
		assertEquals(Home_Page.prodDetails(driver).getText().contains("Folio"), false);
		Log.info("Verifica se o produto contem Folio.");
		Print_Func.captureScreenShot(driver);
		Log.info("Print da tela.");
	}

	@AfterMethod
	public static void encerra() {
		DriverManager.closeChrome(driver);
		Log.info("Encerrando o driver.");
	}

}