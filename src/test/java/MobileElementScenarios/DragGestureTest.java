package MobileElementScenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class DragGestureTest {
  @Test
  public void testDragGesture() 
  {
	//create a driver session
	  AppiumDriver driver=Utility.createDriverSession();
	  
	  
	 //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	 //dran n drop
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  
	 //first dot
	  WebElement ele = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_3"));
	  
	 // Drag Gesture
	  driver.executeScript("mobile: dragGesture", ImmutableMap.of(
			  "elementId",((RemoteWebElement)ele).getId(),
			  "endX", 639,
			  "endY", 981
			  ));
	  WebElement resultMsg = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text"));
	  System.out.println("After drag Guesture result Message is"+resultMsg);
  }
}
