package appiumdemo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class HandleTextBoxCheckboxRadioBtn {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub

				//Gather Desired capabilities
				
				DesiredCapabilities capabilities = new DesiredCapabilities();
				
				   capabilities.setCapability("deviceName","AndroidEmulator13");
			        capabilities.setCapability("platformname", "Android");     
			        capabilities.setCapability("automationName","uiautomator2");
			        //capabilities.setCapability("platformversion", "14");
			        
			        capabilities.setCapability("appPackage","io.appium.android.apis");
			        capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
			        //io.appium.android.apis/io.appium.android.apis.ApiDemos
			        

			        URL url = URI.create("http://127.0.0.1:4723/").toURL();
			        
			        AndroidDriver driver = new AndroidDriver(url, capabilities);
			        Thread.sleep(5000);
			        System.out.println("Application Started");
			        
			        
			        //click on view button
			       driver.findElements(By.id("android:id/text1")).get(11).click();
			       
			       //click on controls
			       driver.findElements(By.id("android:id/text1")).get(4).click();
			      
			       //click on light theme
			       driver.findElements(By.id("android:id/text1")).get(0).click();
			      
			       //enter text in textbox
			       //io.appium.android.apis:id/edit
			       driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("prachi gupta");

			       //checkbox
			       //io.appium.android.apis:id/check1
			       driver.findElement(By.id("io.appium.android.apis:id/check1")).click();

			       
			       //radio button
			       driver.findElement(By.id("io.appium.android.apis:id/radio2")).click();

			       
			       Thread.sleep(5000);
			        driver.quit();//CLOSE SESSION
			        System.out.println("run successfully");
	}

}
