package br.com.rsinet.hub_tdd.provaTDD.driverFactory;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	public static WebDriver startChrome() {
		DOMConfigurator.configure("log4j.xml");
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\deborah.souza\\Downloads\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		return driver;

	}

	public static void openWebSite(WebDriver driver) {

		driver.get("http://advantageonlineshopping.com/");
	}

	public static void closeChrome(WebDriver driver) {
		if (driver != null)

			driver.close();
		driver.quit();

	}
}