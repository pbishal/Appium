package DriverSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class FirstDriverSession {
  @Test
  public void driverSessionTest() throws MalformedURLException 
  {
	//To make connection with server we are passing properties to the server
	  DesiredCapabilities cap = new DesiredCapabilities();
	  cap.setCapability("platformName", "Android");
	  cap.setCapability("appium:automationName", "uiAutomator2");
	  cap.setCapability("appium:deviceName", "pixel_7");
	  cap.setCapability("appium:udid", "emulator-5554");
	  
	  //appliocation path to the server using capability
	  String path = System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  cap.setCapability("appium:app", path);
	  
	  //Server adderss
	  URL url = new URL("http://0.0.0.0:4723");
	  
	  //Server connectivity - create a driver session
	  
	  AppiumDriver driver = new AndroidDriver(url, cap);
	  System.out.println("Session ID is : " + driver.getSessionId());
  }
}
