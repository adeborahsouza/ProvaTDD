package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.provaTDD.appModule.Search_Action;
import br.com.rsinet.hub_tdd.provaTDD.util.Constant;
import br.com.rsinet.hub_tdd.provaTDD.util.ExcelUtils;
import br.com.rsinet.hub_tdd.provaTDD.util.Print_Func;

public class Search_Test {
	private static Logger Log = Logger.getLogger("Teste de pesquisa");
	private static ChromeDriver driver;

	@BeforeMethod
	public static void openBrowser() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		Log.info("Iniciando o ChromeDriver.");
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\deborah.souza\\Downloads\\chromedriver_win32");

		Log.info("Maximizando a tela.");
		driver.manage().window().maximize();

		Log.info("Adicionando uma espera implicita.");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		Log.info("Acessando o site através da url.");
		driver.get("http://advantageonlineshopping.com");
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Planilha1");

	}

	@Test
	public void searchPositivo() throws Exception {
		Reporter.log("ChromeDriver inicializado com sucesso.");
		Log.info("Inicializando o método de pesquisa.");
		Search_Action.pesquisar(driver);
		Reporter.log("Pesquisa realizada com sucesso.");
		
		Print_Func.captureScreenShot(driver);

	}

	@AfterMethod
	public static void encerra() {
		Log.info("Encerrando o driver.");
		driver.quit();
	}

}