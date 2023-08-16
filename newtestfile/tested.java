package Rahulshettyacedemy.SeleniumFrameworkdesign;

import java.io.File;
import java.nio.file.Files;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import org.apache.commons.io.FileUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class tested {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://www.capgemini.com/in-en/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.id("truste-consent-button")).click();
		
		driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]/i[1]")).click();

		Thread.sleep(3000);

		Set<String> window=driver.getWindowHandles();
		Iterator<String> iterator= window.iterator();
		String main = iterator.next();
		
		String child = iterator.next();
		
		driver.switchTo().window(child);
		
		
		driver.get(main);
		
		
		
		
		
		Thread.sleep(3000);
		
		driver.close();
		

	}
}
