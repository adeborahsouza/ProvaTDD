package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsinet.hub_tdd.provaTDD.appModule.Search_Action;
import br.com.rsinet.hub_tdd.provaTDD.appModule.Register_Action;
import br.com.rsinet.hub_tdd.provaTDD.appModule.Login_Action;
import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;

public class POM_TC {
	private static WebDriver driver = null;

	@BeforeClass
	public static void openBrowser() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\deborah.souza\\Downloads\\chromedriver_win32");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void register() {
		driver.get("http://advantageonlineshopping.com");

		// chama os metodos criados nas paginas de ação
		Register_Action.registrar(driver);
	}

		@Test
		public void pesquisa() {
			driver.get("http://advantageonlineshopping.com");
		Search_Action.pesquisar(driver);
		}
		
	

	@AfterClass
	public static void encerra() {
//		driver.quit();
	}

}
