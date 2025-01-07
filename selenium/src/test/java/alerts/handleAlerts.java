package alerts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url="https://www.guru99.com/";
		
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		driver.get(url);
		
		WebElement customerInputFiled =driver.findElement(By.name("cusid"));
		
		
		
		
		
		

	}

}
