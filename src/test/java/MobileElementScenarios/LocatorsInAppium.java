package MobileElementScenarios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LocatorsInAppium {
  @Test
  public void testMobileElements() throws InterruptedException 
  {
	  //create a driver session
	 AppiumDriver driver = Utility.createDriverSession();
	 
//	 accessibility-id
	 WebElement ele1 = driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
	 System.out.println("Text of element:" + ele1.getText());
	 ele1.click();
	 
	 Thread.sleep(2000);
	 //comeback
	 driver.navigate().back();
//	 element 2
	 WebElement ele2 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));

	 System.out.println("Element2 text is: "+ele2.getTagName());
	 ele2.click();
	 
	 Thread.sleep(2000);
	 driver.navigate().back();
	 
//	 class name
//	 WebElement ele3 = driver.findElement(AppiumBy.className("android.widget.TextView"));
	 WebElement ele3 = driver.findElements(AppiumBy.className("android.widget.TextView")).get(3);
	 System.out.println("Element3 text is: "+ele3.getTagName());
	 ele3.click();
	 
	 Thread.sleep(2000);
	 driver.navigate().back();
	 
//	 Resource id
	 WebElement ele4 = driver.findElements(AppiumBy.id("android:id/text1")).get(3);
	 System.out.println("Element4 text is: "+ele4.getText());
	 ele4.click();
	 
	 Thread.sleep(2000);
	 driver.navigate().back();
	 
//	 content
	 WebElement ele5 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Content\")"));
	 System.out.println("Element5 text is: "+ele5.getText());
	 ele5.click();
	 
	 Thread.sleep(2000);
	 driver.navigate().back();
	 
  }
}
































