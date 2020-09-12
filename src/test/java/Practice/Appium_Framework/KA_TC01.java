package Practice.Appium_Framework;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.SignIN;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;


public class KA_TC01 extends CapabilityHybrid{
	
	SignIN SignInKAcademy;
	//AndroidDriver<AndroidElement> driver ;
	  
	  @BeforeTest()
	  public void Cap() throws IOException, InterruptedException {
			driver =HybridDeiredcapabilities();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	  @Test()
	  public void openApp() throws InterruptedException, IOException  {
		SignInKAcademy= new SignIN(driver);
		Thread.sleep(8000);
		SignInKAcademy.ClickDismiss();		
	}
	  
	  @Test(dependsOnMethods = { "openApp" })
	  public void signIn() throws InterruptedException {
		  SignInKAcademy= new SignIN(driver);
		  Thread.sleep(6000);
		  SignInKAcademy.SignIn();
		  Thread.sleep(6000);
	  }
	  @Test(dependsOnMethods = { "signIn" })
	  public void assertName() throws InterruptedException {
		  SignInKAcademy= new SignIN(driver);
		  SignInKAcademy.verifyName();
		  SignInKAcademy.BackToHome();
	  }

}
