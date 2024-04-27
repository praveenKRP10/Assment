package com.Assessment;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class RecordCreationTest {

	private AndroidDriver<MobileElement> androidDriver;


	@BeforeTest
	public void setUp() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "Nothing A063");

		desiredCapabilities.setCapability("newCommandTimeout", 600);
		desiredCapabilities.setCapability("autoGrantPermissions", true);
		desiredCapabilities.setCapability("app", "C:\\Users\\DELL\\Downloads\\app-dev-release 23.apk");

		URL remoteUrl = new URL("http://localhost:4723/wd/hub");

		androidDriver = new AndroidDriver<>(remoteUrl, desiredCapabilities);
	}

	@Test
	public void createRecords() throws InterruptedException {

		WebElement allowLocation = androidDriver.findElement(
				MobileBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
		allowLocation.click(); // Example action, you can perform any action you need

		List<MobileElement> climateButtons = androidDriver.findElementsByXPath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup");

		climateButtons.get(0).click();
		climateButtons.get(0).click();

		WebElement domeParameter = androidDriver
				.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"Dome Parameters\"]"));
		domeParameter.click();

		for (int i = 0; i < 50; i++) {

			WebElement formSelect = androidDriver.findElement(MobileBy.xpath("//android.widget.ImageView"));
			formSelect.click();
			Thread.sleep(1000);

			WebElement zoneSelect = androidDriver
					.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"NANTA-A | Zone : 1\"]"));
			zoneSelect.click();
			Thread.sleep(1000);

			WebElement addButton = androidDriver.findElement(MobileBy.xpath(
					"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]"));
			addButton.click();

			Thread.sleep(2000);

			WebElement polyHouseSeelector = androidDriver.findElement(MobileBy.xpath(
					"//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView"));
			polyHouseSeelector.click();
			Thread.sleep(1000);
			WebElement polyHouseSeelectorA = androidDriver
					.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"A\"]"));
			polyHouseSeelectorA.click();
			Thread.sleep(1000);

			WebElement dome = androidDriver.findElement(MobileBy.xpath(
					"//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView"));
			dome.click();
			Thread.sleep(1000);
			WebElement domeEntry = androidDriver.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"3\"]"));
			domeEntry.click();

			Thread.sleep(1000);

			WebElement section = androidDriver.findElement(MobileBy.xpath(
					"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ImageView"));
			section.click();
			Thread.sleep(1000);

			WebElement sectiov = androidDriver.findElement(MobileBy.xpath(
					"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup"));
			sectiov.click();
			Thread.sleep(1000);

			WebElement submitButton = androidDriver
					.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"SUBMIT\"]"));
			submitButton.click();

			Thread.sleep(2000);
		}
	}

	@AfterTest
	public void teardown() {
		androidDriver.quit();
	}
}
