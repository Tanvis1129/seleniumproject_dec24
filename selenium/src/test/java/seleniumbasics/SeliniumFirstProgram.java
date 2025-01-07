package seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeliniumFirstProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		String url="https://www.booking.com/";
		
		driver.get(url);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		Thread.sleep(2000);
		
	}

}
