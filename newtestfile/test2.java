package Rahulshettyacedemy.SeleniumFrameworkdesign;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.net.HttpURLConnection;

public class test2 {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	/**
	 * @param args
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
	
		
		
		

			String browser = "firefox";

			WebDriver driver = null;

			if (browser.equalsIgnoreCase("chrome"))   {


			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			}

			else if(browser.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

			}
			else if(browser.equalsIgnoreCase("ie")) {

			WebDriverManager. iedriver().setup();
			driver= new InternetExplorerDriver();
			}
	

	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}


