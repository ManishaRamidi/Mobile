package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


public class SignIN {
	AndroidDriver<AndroidElement> driver;
	public static String StoredName;
	
	 public SignIN(AndroidDriver<AndroidElement> driver) {
		 this.driver = driver;
	 }

	public void ClickDismiss() throws InterruptedException {
		System.out.println("Opened");
		Thread.sleep(10000);
		//driver.findElement(By.xpath(CommonClass.getPropValue("dismiss1"))).click();
		driver.findElement(By.xpath("//*[@text='Dismiss']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='Dismiss']")).click();
		
	}
	public void SignIn() throws InterruptedException {
		driver.findElement(By.xpath("//*[@text='Sign in']")).click();
		//driver.findElement(By.xpath("//*[@text=' Continue with Google']")).click();
		Thread.sleep(6000);
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Continue with Google\")")).click();
		WebElement UserName = driver.findElement(By.id("com.google.android.gms:id/account_name"));
		StoredName =UserName.getText();
		System.out.println(StoredName);
		UserName.click();
		Thread.sleep(6000);
		
	}
	public void verifyName() throws InterruptedException {
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Settings\"]")).click();
		String Split = "@";
		String[] JustName;
		JustName = StoredName.split(Split);
		System.out.println(JustName[0]);
		String Expected = JustName[0];
	    Thread.sleep(6000);
	    String Actual = driver.findElements(By.className("android.widget.TextView")).get(1).getText();
	    System.out.println(Actual);
	    Assert.assertEquals(Expected, Actual);
	   
	}
	public void BackToHome() throws InterruptedException {
		driver.findElements(By.className("android.widget.ImageView")).get(0).click();    
		Thread.sleep(1000);
	}
	

}
