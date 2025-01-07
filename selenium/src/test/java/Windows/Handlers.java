package Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlers {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		String url="https://demoqa.com/browser-windows";
		
		driver.get(url);
		
		Thread.sleep(3000);
		
		WebElement newtab = driver.findElement(By.id("tabButton"));
		
		js.executeScript("arguments[0].setAttribute('style','border:4px solid green:');",newtab);
		Thread.sleep(1000);
		
		js.executeScript("arguments[0].scrollIntoViewIfNeeded(true);", newtab);
		
		Thread.sleep(3000);
		
		newtab.click();
		
		
		String parentHandle=driver.getWindowHandle();
		String childHandle=driver.getWindowHandle();
		System.out.println("Parent handle: "+parentHandle);
		
		driver.close();
		
		
	}

}
