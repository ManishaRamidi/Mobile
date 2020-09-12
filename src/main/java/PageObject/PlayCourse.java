package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class PlayCourse {
	
	AndroidDriver<AndroidElement> driver;

	    public PlayCourse(AndroidDriver<AndroidElement> driver) {
		this.driver =  driver;

	}
	    
	    public void PlayVideo() throws InterruptedException {
	    	Thread.sleep(8000);
	    	driver.findElement(By.xpath("//*[@text='Numbers from 1 to 9']")).click();
	    	Thread.sleep(10000);
	    	WebElement Paly1 = driver.findElement(By.xpath("//*[@text='Counting with small numbers']"));
	    	Paly1.click();
	    	Thread.sleep(8000);
	 }
	    public void back() throws InterruptedException {
			//t = new TouchAction(driver);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(4000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(4000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(4000);
					
	}
}
