package Practice.Appium_Framework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PageObject.MyCourse;
import PageObject.PlayCourse;
import PageObject.SignIN;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class KA_TC03 extends CapabilityHybrid{
	//SignIN SignInKAcademy;
	//MyCourse CourseSelection;
	PlayCourse PlayCourse1;
	//AndroidDriver<AndroidElement> driver ;
    
	 /*@Test
	  public void Cap() throws IOException, InterruptedException {
			driver =HybridDeiredcapabilities();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	  }
	 @ Test (dependsOnMethods = { "Cap" })
	 public void signIn() throws InterruptedException {
		SignInKAcademy= new SignIN(driver);
		Thread.sleep(6000);
		SignInKAcademy.ClickDismiss();	
		SignInKAcademy.SignIn();
		Thread.sleep(6000);	 
	 }
	 
	 @ Test
	 public void clickcourse() throws InterruptedException {
		 CourseSelection = new MyCourse(driver);
		 CourseSelection.myCourse();
		 Thread.sleep(8000);
	 }
	 */
     @Test
     public void playvideo() throws InterruptedException {
    	 Thread.sleep(8000);
		 PlayCourse1 = new PlayCourse(driver);
		 PlayCourse1.PlayVideo();
		 Thread.sleep(4000);
		 PlayCourse1.back();
		 
	 }
}
