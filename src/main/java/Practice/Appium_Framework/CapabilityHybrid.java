package Practice.Appium_Framework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class CapabilityHybrid {
	protected static String AppPackage;
	protected static String AppActivity;
	protected static String DeviceName;
	protected static String ChromeDriverExecutable;
	protected static String PlatformName;
	protected static AndroidDriver<AndroidElement> driver;
	
	public static AndroidDriver<AndroidElement> HybridDeiredcapabilities() throws IOException {
		
		FileReader fr = new FileReader(System.getProperty("user.dir")+"//src//main//java//Practice//Appium_Framework//global.properties");
		Properties prop = new Properties();
		prop.load(fr);
		AppPackage = prop.getProperty("APPPACKAGE");
		AppActivity = prop.getProperty("APPACTIVITY");
		DeviceName = prop.getProperty("DEVICENAME");
		ChromeDriverExecutable = prop.getProperty("CHROMEDRIVEREXECUTABLE");
		PlatformName = prop.getProperty("PLATFORMNAME");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,DeviceName );
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,PlatformName);
		//cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
        cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,ChromeDriverExecutable);
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,AppPackage );
	    cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, AppActivity);
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
	}

}
