package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicitwaitinselenium {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
	   // WebDriverWait wait=new WebDriverWait(driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)));
		
		String url="https://www.booking.com";
		
		driver.get(url);
		
		WebElement popUp =driver.findElement(By.xpath("//button[starts-with(@aria-label,'Dismiss')]"));
		
		popUp.click();
		
		//WebElement registerbutton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Register")));
		
	//	js.executeScript(null, args)
		
		driver.close();	
		
	}

}
