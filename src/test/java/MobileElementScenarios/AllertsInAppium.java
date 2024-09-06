package MobileElementScenarios;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AllertsInAppium {
  @Test
  public void testAllert() throws InterruptedException 
  {
	  /*
	   * Allert is interface in selenium
	   * support 4 methods
	   * accept()====>ok
	   * dismiss()====>cancel
	   * getText()====>text of alert
	   * send Keys()====>Prompt
	   */
	  
	  
	  //create a driver session
	  AppiumDriver driver=Utility.createDriverSession();
	  
	  //app
	  driver.findElement(AppiumBy.accessibilityId("App")).click();
	  
	  // alert Dialogue
	  driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
	   
	  //alert open
	  driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
	  Thread.sleep(2000);
	  
	  //alert Open
	  Alert alt1 = driver.switchTo().alert();
	  System.out.println("Alert text is: "+alt1.getText());
	  alt1.accept();


	  
	  
	  
	  
	  
  }
}
