package AppiumScenarios;

import org.testng.annotations.Test;

import generic.Utility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class ToggleNetworkSetup {
  @Test
  public void testToggleSetup() throws InterruptedException 
  {
	  /*
	   * toggleWifi()
	   * ToggleData() - Mobile Data
	   * ToggleAeroplaneMode()
	   */
	  // Create driver session
	  AppiumDriver driver=Utility.createDriverSession();
	  
	  //Wifi Toggle
	  ((AndroidDriver)driver).openNotifications();
	  // ON -> Off
	  
	  System.out.println("Initially the wifi is in on state");
	  ((AndroidDriver)driver).toggleWifi();
	  
	  System.out.println("Wifi is in off state");
	  
	  Thread.sleep(2000);
	  
	  ((AndroidDriver)driver).toggleWifi();
	  
	  System.out.println("Wifi is in On state");
	  
	  // swipe left
	  
	  // Mobile Data
	  Thread.sleep(2000);
	  System.out.println("Initially the Mobile Data is in on state");
	  ((AndroidDriver)driver).toggleData();
	  
	  System.out.println("Mobile Data is in off state");
	  
	  Thread.sleep(2000);
	  
	  ((AndroidDriver)driver).toggleData();
	  
	  System.out.println("Mobile Data is in On state");
	  
	  // Airplane Data
	  Thread.sleep(2000);
	  System.out.println("Initially the AirplaneMode is in on state");
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  
	  System.out.println("AirplaneMode is in off state");
	  
	  Thread.sleep(2000);
	  
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  
	  System.out.println("AirplaneMode Data is in On state");
		
  } 
}
