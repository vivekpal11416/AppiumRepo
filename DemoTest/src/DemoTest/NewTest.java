package DemoTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;

public class NewTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		/*File f = new File("src");
		//File fs = new File(f,"gaana.apk");
		DesiredCapabilities cap=new DesiredCapabilities();	

		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "c8d0ec83");
		cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\vivek\\eclipse-workspace\\Appium Demo\\src\\gaana.apk");
		cap.setCapability("autoGrantPermissions", true);
		cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
	//	cap.setCapability(AndroidMobileCapabilityType..AUTO_GRANT_PERMISSIONS,true);
		
		AndroidDriver<AndroidElement> driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Thread.sleep(20000);
		//WebDriverWait wait=new WebDriverWait(driver,60);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElementById("com.gaana:id/txt_skip")));
		List<AndroidElement> a=driver.findElementsById("com.gaana:id/language_bg_img");
		//a.get(0).click();
		a.get(1).click();
		driver.findElementById("com.gaana:id/btn_all_done").click();
		
		
		
		List<AndroidElement> b=driver.findElementsById("com.gaana:id/itemImg");
		b.get(0).click();
		b.get(1).click();
		driver.findElementById("com.gaana:id/btn_all_done").click(); 
		driver.findElementById("com.gaana:id/img_cancel_skip").click(); 
		
		TouchAction action = new TouchAction(driver);
		 action.tap(PointOption.point(100, 200)).perform();
		 
		/* Using PointOption.point(x, y), which is a static instance of PointOption with those coordinate values
		 TouchAction touchAction = new TouchAction(driver);
		 touchAction.tap(PointOption.point(1280, 1013)).perform()
		// Using PointOption().withCoordinates(x, y), which returns a reference to the PointOption instance after setting those coordinate values
		 TouchAction touchAction = new TouchAction(driver);
		 touchAction.tap(new PointOption().withCoordinates(1280, 1013)).perform()*/
		
		
		// Create object of  DesiredCapabilities class and specify android platform

        DesiredCapabilities capabilities=DesiredCapabilities.android();

       // set the capability to execute test in chrome browser
       // capabilities.setCapability("app", "Chrome");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);

       // set the capability to execute our test in Android Platform

           capabilities.setCapability(MobileCapabilityType.PLATFORM,Platform.ANDROID);
           // we need to define platform name
          // capabilities.setCapability("app", "Chrome");

          capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
          // Set the device name as well (you can give any name)

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"TestVD");
        // set the android version as well

           capabilities.setCapability(MobileCapabilityType.VERSION,"6.0");
           // Create object of URL class and specify the appium server address
           URL url= new URL("http://127.0.0.1:4723/wd/hub");
           // Create object of  AndroidDriver class and pass the url and capability that we created

        WebDriver driver = new AndroidDriver(url, capabilities);
        // Open url

          driver.get("http://www.facebook.com");
          // print the title

          System.out.println("Title "+driver.getTitle());
          // enter username

        driver.findElement(By.name("email")).sendKeys("aayushi@gmail.com");
        // enter password

              driver.findElement(By.name("pass")).sendKeys("aayushi_selenium");
              // click on submit button
              driver.findElement(By.id("u_0_5")).click();

              Thread.sleep(5000);

        // close the browser

        driver.quit();

       
		

	}

}
