package Pages;


import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PlayGame {
	public void PlayOneTicket(WebDriver driver){
		Login_page test1 = new Login_page();
		test1.login2(driver);
		driver.findElement(By.xpath(".//*[@id='sticky-navigation']/div/div[3]/ul/li[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='ticketsList']/table/tbody/tr[1]/td[1]")).click();
		//String ticketavailability = driver.findElement(By.xpath(".//*[@id='play-game-container']/section[2]")).getText();
		WebElement element = driver.findElement(By.xpath(".//*[@id='play-game-image']"));
		Actions clicker = new Actions(driver);
		clicker.moveToElement(element).moveByOffset(150, 150).click().perform();
		driver.findElement(By.id("play-ticket")).click();
        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='wlvModal-ok-button']")));
		driver.findElement(By.xpath(".//*[@id='wlvModal-ok-button']")).click();
		
	}
	public void CheckProgressbar(WebDriver driver){
		Login_page test1 = new Login_page();
		test1.login2(driver);
		driver.findElement(By.xpath(".//*[@id='sticky-navigation']/div/div[3]/ul/li[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='ticketsList']/table/tbody/tr[1]/td[2]")).click();
		String firstrate = driver.findElement(By.xpath(".//*[@id='wlv-progress-container']/div/div[3]")).getText();
		WebElement element = driver.findElement(By.xpath(".//*[@id='play-game-image']"));
		Actions clicker = new Actions(driver);
		clicker.moveToElement(element).moveByOffset(150, 150).click().perform();
		driver.findElement(By.id("play-ticket")).click();
        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='wlvModal-ok-button']")));
		driver.findElement(By.xpath(".//*[@id='wlvModal-ok-button']")).click();
		String afterrate = driver.findElement(By.xpath(".//*[@id='wlv-progress-container']/div/div[3]")).getText();
			if(firstrate.equals(afterrate)){
				System.out.println("Testfailed");
			}else{
				System.out.println("TestPass");
			}
			System.out.println(firstrate);
			System.out.println(afterrate);
	}
	public void PlaySeveralTickets(WebDriver driver){
		Login_page test1 = new Login_page();
		test1.login2(driver);
		driver.findElement(By.xpath(".//*[@id='sticky-navigation']/div/div[3]/ul/li[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='ticketsList']/table/tbody/tr[1]/td[1]")).click();
		//String ticketavailability = driver.findElement(By.xpath(".//*[@id='play-game-container']/section[2]")).getText();
		WebElement ticketslist = driver.findElement(By.xpath(".//*[@id='play-game-container']/section[2]"));
		int ticketslistsize = ticketslist.findElements(By.className("coordinate")).size();
		System.out.println(ticketslistsize);
		for(int i = 0; i<ticketslistsize; i++ ){
			ticketslist.findElements(By.className("coordinate")).get(i).click();
			WebElement element = driver.findElement(By.xpath(".//*[@id='play-game-image']"));
			Actions clicker = new Actions(driver);
			Random ran = new Random();
			int x = ran.nextInt(120) + 5;
			int y = ran.nextInt(50) + 1;
			clicker.moveToElement(element).moveByOffset(x, y).click().perform();
			i++;
			
		}
		driver.findElement(By.xpath(".//*[@id='play-game-container']/section[2]/div[4]/div")).click();
		
	}
}

