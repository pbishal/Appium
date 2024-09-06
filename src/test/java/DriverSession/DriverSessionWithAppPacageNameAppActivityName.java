package DriverSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverSessionWithAppPacageNameAppActivityName {
  @Test
  public void createDriverSession() throws MalformedURLException 
  {
	  
	  UiAutomator2Options options = new UiAutomator2Options();
	  options.setPlatformName("Android");
	  
	  options.setCapability("appium:appPackage", "com.google.android.deskclock");
	  options.setCapability("appium:appActivity", "com.android.deskclock.DeskClock");
//	  options.setCapability("appium:appPacage", options);
	  
	  //Server Address
	  URL url = new URL("http://0.0.0.0:4723"); 
	  
	  //Create Driver Session
	  AppiumDriver driver = new AndroidDriver(url, options);
	  System.out.println("Session Id is ;"+ driver.getSessionId());
  }
}
