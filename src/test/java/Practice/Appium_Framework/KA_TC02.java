package Practice.Appium_Framework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PageObject.MyCourse;
import PageObject.SignIN;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class KA_TC02 extends CapabilityHybrid{

		//SignIN SignInKAcademy;
		MyCourse CourseSelection;
		//AndroidDriver<AndroidElement> driver ;
      
	 /*@Test
	  public void Cap() throws IOException, InterruptedException {
			driver =HybridDeiredcapabilities();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 	
	  } 
	 @ Test ()
	 public void signIn() throws InterruptedException {
		SignInKAcademy= new SignIN(driver);
		Thread.sleep(8000);
		SignInKAcademy.ClickDismiss();
		Thread.sleep(6000);
		SignInKAcademy.SignIn();
		Thread.sleep(6000);	 
	 }*/
	 
	 @ Test
	 public void SelectCourse() throws InterruptedException {
		 CourseSelection = new MyCourse(driver);
		 Thread.sleep(8000);	
		 CourseSelection.clickEditBtn();
		 CourseSelection.SelectCourse();
		 CourseSelection.back();
		 CourseSelection.back();
		 CourseSelection.myCourse();	
		
	 }
}
