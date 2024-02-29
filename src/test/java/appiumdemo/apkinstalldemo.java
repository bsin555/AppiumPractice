package appiumdemo;
import java.net.MalformedURLException;

import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;



public class apkinstalldemo {
	static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
				DesiredCapabilities dc = new DesiredCapabilities();

				dc.setCapability("deviceName", "AndroidEmulator13");
				dc.setCapability("automationName", "uiautomator2");
				dc.setCapability("platformName", "Android");
				//dc.setCapability("platformVersion", "14");	
				dc.setCapability("app", "C:\\Users\\bsing\\Desktop\\mobileap\\sampleapks\\proverbial.apk");
				
				URL url = URI.create("http://127.0.0.1:4723/").toURL();
				
				
				driver = new AndroidDriver(url, dc);
				
				System.out.println("Application Started...");
				Thread.sleep(5000);		
	}

}
