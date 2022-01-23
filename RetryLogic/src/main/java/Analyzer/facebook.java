package Analyzer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("mahi.oist");
		driver.findElement(By.name("pass")).sendKeys("Bindu02#");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());


	    }
	}


