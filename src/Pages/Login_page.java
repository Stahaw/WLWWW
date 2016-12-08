package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login_page {
	
	public void login2(WebDriver driver){
	        driver.get("http://staging.winlifetimevacations.com/");
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath(".//*[@id='sticky-navigation']/div/div[3]/ul/li/a")).click();
	        WebDriverWait wait = new WebDriverWait(driver, 100);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='EmailAddress']")));
	        driver.findElement(By.xpath(".//*[@id='EmailAddress']")).sendKeys("igorstahaw@gmail.com");
	        driver.findElement(By.xpath(".//*[@id='Password']")).sendKeys("123456");
	        driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/div/div/form/div[2]/div/div[3]/div/div[1]/button")).click();


		
	}

}

