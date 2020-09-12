package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class MyCourse {

	AndroidDriver<AndroidElement> driver;
	TouchAction t ;

	public MyCourse(AndroidDriver<AndroidElement> driver) {

		this.driver =  driver;

	}
	public void clickEditBtn() throws InterruptedException {
		Thread.sleep(8000);
		WebElement edit = driver.findElementByAndroidUIAutomator("text(\"Edit\")");
		edit.click();
		Thread.sleep(8000);

	}
	
	public void SelectCourse() throws InterruptedException {
		Thread.sleep(10000);
		WebElement doneBtn = driver.findElement(By.className("android.widget.Button"));
		doneBtn.click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Graduate studies\"));");
		WebElement gradeName = driver.findElement(By.xpath("//*[@text='Graduate studies']"));
		t = new TouchAction(driver);
		t.tap(tapOptions().withElement(element(gradeName))).perform();
		Thread.sleep(2000);	
	}
	
	public void back() throws InterruptedException {
		//t = new TouchAction(driver);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);
		//driver.pressKey(new KeyEvent(AndroidKey.BACK));
		//Thread.sleep(1000);	
	}
	public void myCourse() throws InterruptedException {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Class 1 math (India)\"));");
		WebElement math = driver.findElement(By.xpath("//*[@text='Class 1 math (India)']"));
		math.click();
		Thread.sleep(3000);
	}

	
}