package Rahulshettyacedemy.SeleniumFrameworkdesign;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Standalone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/client");
		
	driver.findElement(By.id("userEmail")).sendKeys("harshalkhadgi@gmail.com");
	driver.findElement(By.id("userPassword")).sendKeys("P@SSword@1");
	driver.findElement(By.id("login")).click();
	driver.findElement(By.cssSelector("body > app-root:nth-child(1) > app-dashboard:nth-child(2) > section:nth-child(5) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > button:nth-child(4)")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector(".btn.btn-custom[routerlink='/dashboard/cart']")).click();
	Thread.sleep(2000);
	
	
	driver.findElement(By.cssSelector(".totalRow button")).click();
	
	
	driver.findElement(By.cssSelector("input[placeholder='Select Country']")).sendKeys("india");
	
	Thread.sleep(3000);
	driver.quit();
	
		
		
		
		
		
		
		
		
	}

}
