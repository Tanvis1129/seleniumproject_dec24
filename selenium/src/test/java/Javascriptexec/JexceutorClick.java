package Javascriptexec;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JexceutorClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		//Initialize js exceutor
		
		JavascriptExecutor executor =(JavascriptExecutor) driver;
		String url="https://www.amazon.in/";
		driver.get(url);
		
		//WebElement socialconnectText= driver.findElement(By.xpath(""));
		
		WebElement cart=driver.findElement(By.id("nav-cart"));
		
		executor.executeScript("arguments[0].click();",cart);
		executor.executeScript("arguments[0].setAttribute('style.'", args);

		Thread.sleep(5000);
		driver.close();
	}

}
