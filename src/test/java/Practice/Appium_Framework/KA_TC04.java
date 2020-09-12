package Practice.Appium_Framework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PageObject.SignIN;
import PageObject.SignOut;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class KA_TC04 extends CapabilityHybrid{
	
	//SignIN SignInKAcademy;
	SignOut SignOutApp;
	//AndroidDriver<AndroidElement> driver ;
    /*
	 @Test
	  public void Cap() throws IOException, InterruptedException {
			driver =HybridDeiredcapabilities();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	  }
	 @ Test (dependsOnMethods = { "Cap" })
	 public void signIn() throws InterruptedException {
		SignInKAcademy= new SignIN(driver);
		Thread.sleep(8000);
		SignInKAcademy.ClickDismiss();	
		Thread.sleep(8000);
		SignInKAcademy.SignIn();
		Thread.sleep(6000);	 
	 }
	 */
	 @ Test
	 public void signOut() throws InterruptedException {
		 SignOutApp= new SignOut(driver);
		 Thread.sleep(3000);
		 SignOutApp.signout();
		 
	 }
}
