package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.provaTDD.appModule.Search_Action;
import br.com.rsinet.hub_tdd.provaTDD.driverFactory.DriverManager;
import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;
import br.com.rsinet.hub_tdd.provaTDD.util.Constant;
import br.com.rsinet.hub_tdd.provaTDD.util.ExcelUtils;
import br.com.rsinet.hub_tdd.provaTDD.util.Print_Func;

public class Search_Test {
	private static Logger Log = Logger.getLogger("Teste de pesquisa");
	private static WebDriver driver;

	@BeforeMethod
	public static void openBrowser() throws Exception {
		driver = DriverManager.startChrome();
		Log.info("Iniciando o ChromeDriver.");
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Planilha1");

	}

	@Test(priority = 0)
	public void searchPositivo() throws Exception {
		DriverManager.openWebSite(driver);
		Reporter.log("ChromeDriver inicializado com sucesso.");
		Log.info("Inicializando o método de pesquisa.");
		Search_Action.pesquisar(driver);
		Reporter.log("Pesquisa realizada com sucesso.");
		assertEquals(Home_Page.produtoPesquisado(driver).getText().contains(ExcelUtils.getCellData(1, 0).toUpperCase()),
				true);
		Print_Func.captureScreenShot(driver);
		Log.info("Print da tela.");
	}

	@Test(priority = 1)
	public void searchNegativo() throws Exception {
		DriverManager.openWebSite(driver);
		Reporter.log("ChromeDriver inicializado com sucesso.");
		Log.info("Inicializando o método de pesquisa.");
		Search_Action.pesquisarInvalido(driver);
		Reporter.log("Pesquisa realizada com sucesso.");
		assertEquals(Home_Page.produtoInexistente(driver).getText().contains("No results for"), true);
		Print_Func.captureScreenShot(driver);
		Log.info("Print da tela.");
	}

	@AfterMethod
	public static void encerra() {
		DriverManager.closeChrome(driver);
		Log.info("Encerrando o driver.");

	}

}