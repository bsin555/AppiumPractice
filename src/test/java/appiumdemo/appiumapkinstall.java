package appiumdemo;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class appiumapkinstall {
	static AndroidDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			openCalculator();
			
		}
		catch(Exception exp){
			System.out.println(exp.getMessage());
		}
	}
	
	public static void openCalculator() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "V2065");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		
		cap.setCapability("appPackage", "com.vivo.calculator");
		cap.setCapability("appActivity", "com.vivo.calculator.Calculator");
		
		URL url = URI.create("http://127.0.0.1:4723").toURL();
		
		
		driver = new AndroidDriver(url, cap);
		
		System.out.println("Application Started...");
		Thread.sleep(5000);		
		
		WebElement num8 = driver.findElement(By.id("com.vivo.calculator:id/digit8"));
		num8.click();
				
		WebElement plus = driver.findElement(By.id("com.vivo.calculator:id/plus"));
		plus.click();
		
		WebElement num2 = driver.findElement(By.id("com.vivo.calculator:id/digit2"));
		num2.click();
		
		WebElement equal = driver.findElement(By.id("com.vivo.calculator:id/equal"));
		equal.click();
		
		WebElement result = driver.findElement(By.id("com.vivo.calculator:id/input_edit"));
		String resultString = result.getText();
		
		System.out.println(resultString);
			
		}
		
	}


