package br.com.rsinet.hub_tdd.provaTDD.util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

public class Print_Func {
	public static void captureScreenShot(WebDriver driver) {

		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src,
					new File("C:\\Users\\emers\\Desktop\\"
							+ "Programação\\RSI\\workspace-hub-tdd\\ProjetoLoja\\screenshots\\"
							+ System.currentTimeMillis() + ".png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
