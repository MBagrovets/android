package com.itacademy;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.net.URL;

import static io.appium.java_client.clipboard.ClipboardContentType.URL;

public class android {
    @Test
    public void androidTest(){
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("")
                .setApp("/home/myapp.apk");
        AndroidDriver driver = new AndroidDriver(
                // The default URL in Appium 1 is http://127.0.0.1:4723/wd/hub
                new URL("http://127.0.0.1:4723"), options
        );
        try {
            WebElement el = driver.findElement(AppiumBy.xpath ("//Button"));
            el.click();
            driver.getPageSource();
        } finally {
            driver.quit();
        }
    }
}
