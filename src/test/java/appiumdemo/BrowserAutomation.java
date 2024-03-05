package appiumdemo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class BrowserAutomation {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		   capabilities.setCapability("deviceName","Medium Phone API UpsideDownCakePrivacySandbox");
	        capabilities.setCapability("platformname", "Android");     
	        capabilities.setCapability("automationName","uiautomator2");
	        capabilities.setCapability("platformversion", "12");
	        capabilities.setCapability("browserName", "Chrome");
	        capabilities.setCapability("chromedriverExecutable","C:\\Users\\bsing\\git\\AppiumPractice\\driver\\chromedriver.exe");;
	      //  capabilities.setCapability("appPackage","com.oneplus.calculator");
	       // capabilities.setCapability("appActivity", "com.oneplus.calculator.Calculator");
	        
	        

	        URL url = URI.create("http://127.0.0.1:4723/").toURL();
	        
	        AndroidDriver driver = new AndroidDriver(url, capabilities);
	        System.out.println("test1");
	        driver.get("https://www.google.com/");
	        
	        //find search box web element
	        WebElement searchBox = driver.findElement(By.name("q"));
	        System.out.println("test2");
	        searchBox.sendKeys("Taj mahal");
	        searchBox.sendKeys(Keys.RETURN);
	        
	        Thread.sleep(3000);
	        
	        System.out.println("test3");
	        driver.quit();

	}

}
