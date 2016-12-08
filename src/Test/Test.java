package Test;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import Pages.PlayGame;


public class Test extends PlayGame {
	public static void main(String args[]) throws InterruptedException, AWTException{
		System.setProperty("webdriver.chrome.driver", "C:\\ABTO\\ECLIPSE\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		WebDriver driver = new ChromeDriver(options);
		Test firsttest = new Test();
		firsttest.PlayOneTicket(driver);
		driver.close();

}
}
