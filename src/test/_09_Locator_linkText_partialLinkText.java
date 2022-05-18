package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _09_Locator_linkText_partialLinkText {
    public static void main(String[] args) {
        /*
        Go to https://www.google.com
        Validate the Gmail, Images, About and Store links are displayed and enabled
        */

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com/");

        WebElement aboutLink = driver.findElement(By.linkText("About"));
        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
        WebElement imageLink = driver.findElement(By.linkText("Images"));
        WebElement storeLink = driver.findElement(By.linkText("Store"));


        System.out.println(aboutLink.isDisplayed() && aboutLink.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(gmailLink.isDisplayed() && gmailLink.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(storeLink.isDisplayed() && storeLink.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(imageLink.isDisplayed() && imageLink.isEnabled() ? "PASSED" : "FAILED");

        Driver.quitDriver();
    }
}
