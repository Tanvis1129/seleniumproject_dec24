package Javascriptexec;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertsinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		//Initialize js exceutor
		
		JavascriptExecutor executor =(JavascriptExecutor) driver;
		String url="https://www.flipkart.in/";
		driver.get(url);
		
		//WebElement socialconnectText= driver.findElement(By.xpath(""));
		
		WebElement loginbuttuon=driver.findElement(By.xpath("//[@title='Login'])"));
		
		executor.executeScript("arguments[0].setAttribute('style','border: 4px solid green,');",loginbuttuon);
		
		String loginText=loginbuttuon.getText();
		
	
		
		
		
				

	}

}
