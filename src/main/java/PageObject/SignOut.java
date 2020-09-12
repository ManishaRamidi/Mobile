package PageObject;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class SignOut {
	
	AndroidDriver<AndroidElement> driver;
	public SignOut(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;

	}
	public void signout() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(MobileBy.AccessibilityId("Settings")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='Sign out']")).click();
		Thread.sleep(4000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(4000);
	}

}
