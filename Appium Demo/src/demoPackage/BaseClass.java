package demoPackage;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;


public class BaseClass {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
	//File f = new File("src");
	//File fs = new File(f,"gaana.apk");
	DesiredCapabilities cap=new DesiredCapabilities();	

	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "TestVD");
	cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\vivek\\eclipse-workspace\\Appium Demo\\src\\gaana.apk");
	cap.setCapability("autoGrantPermissions", true);
	cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
	
	AndroidDriver<AndroidElement> driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	//Thread.sleep(5000);
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElementById("com.gaana:id/txt_skip")));
	driver.findElementById("com.gaana:id/txt_skip").click();
	 
	
	}

}