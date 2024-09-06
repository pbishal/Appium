package DriverSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class SessionWithUIAutomator2Option {
  @Test
  public void createDriverSession() throws MalformedURLException 
  {
	  UiAutomator2Options options = new UiAutomator2Options();
	  options.setPlatformName("Android");
	  
	  //Application Path
	  String path = System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  options.setCapability("appium:app", path);
	  
	  //server address
	  URL url = new URL("http://0.0.0.0:4723"); 
	  
	  //Create Driver session
	  AppiumDriver driver = new AndroidDriver(url, options);
	  System.out.println("Session id is: "+driver.getSessionId());
  }
}
