package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.provaTDD.appModule.Register_Action;

public class Register_Test {
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	private static WebDriver driver;

	@BeforeMethod
	public static void openBrowser() {
		DOMConfigurator.configure("log4j.xml");
		Log.info("Iniciando o ChromeDriver.");
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\deborah.souza\\Downloads\\chromedriver_win32");

		Log.info("Maximizando a tela.");
		driver.manage().window().maximize();

		Log.info("Adicionando uma espera implicita.");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Log.info("Acessando o site através da url.");
		driver.get("http://advantageonlineshopping.com");
	}

	@Test(priority = 0)
	public void registerPositivo() {
		Reporter.log("ChromeDriver inicializado com sucesso.");

		Log.info("Chamando o método de registro.");
		Register_Action.registrar(driver);

		Reporter.log("Pesquisa realizada com sucesso.");

	}

//	@Test(priority = 1)
//	public void registerNegativo() {
//		// chama os metodos criados nas paginas de ação
//		Register_Action.registrar(driver);
//	}

	@AfterMethod
	public static void encerra() {
		Log.info("Encerrando o navegador.");
		driver.quit();
	}

}