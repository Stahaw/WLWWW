package Pages;

import java.awt.AWTException;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class BuyTickets {
	public void BuyTicketsthroughGamepage(WebDriver driver) throws InterruptedException, AWTException{
		Login_page test1 = new Login_page();
		test1.login2(driver);
		driver.findElement(By.xpath(".//*[@id='sticky-navigation']/div/div[3]/ul/li[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='play-game-container']/section[2]/div[2]/div/a")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/form/div[3]/div[1]/div[6]/div[3]/div/div[2]/input")).click();
		

	
		
	}
	public void BuyTicketsthroughPrizepage(WebDriver driver) throws InterruptedException, AWTException{
		Login_page test1 = new Login_page();
		test1.login2(driver);
		driver.findElement(By.xpath(".//*[@id='sticky-navigation']/div/div[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[2]/div[1]/div/div[2]/div[2]/a")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div/section[1]/div[2]/div[7]/a")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/form/div[3]/div[1]/div[6]/div[3]/div/div[2]/input")).click();
}
	public void BuyTicketsthroughDropdowns(WebDriver driver) throws InterruptedException, AWTException{
		Login_page test1 = new Login_page();
		test1.login2(driver);
		driver.findElement(By.xpath(".//*[@id='sticky-navigation']/div/div[3]/ul/li[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='play-game-container']/section[2]/div[2]/div/a")).click();
		WebElement wannabeSelect = driver.findElement(By.id("ticketQuantity"));
		Select dropdown = new Select(wannabeSelect);
		dropdown.selectByVisibleText("10");
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/form/div[3]/div[1]/div[6]/div[3]/div/div[2]/input")).click();
}
}
