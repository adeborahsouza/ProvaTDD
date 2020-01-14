package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.provaTDD.appModule.Search_Action;
import br.com.rsinet.hub_tdd.provaTDD.util.Constant;
import br.com.rsinet.hub_tdd.provaTDD.util.ExcelUtils;

public class Search_Test {
	private static ChromeDriver driver;

	@BeforeMethod
	public static void openBrowser() throws Exception {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\deborah.souza\\Downloads\\chromedriver_win32");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("http://advantageonlineshopping.com");
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Planilha1");
	}

	@Test
	public void searchPositivo() throws Exception {
		Search_Action.pesquisar(driver);
		System.out.println("deu certo");
	}

	@AfterMethod
	public static void encerra() {
		driver.quit();
	}
	
}