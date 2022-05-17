package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class _06_Locator_Name {
    /*
    TEST CASE:
    1. Go to https://www.google.com
    2. Validate the search input element is displayed in the middle of the page
     */

    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com");

        if(driver.findElement(By.name("q")).isDisplayed()) System.out.println("Input box validation is PASSED");
        else System.out.println("Input box validation is FAILED!!!");

        Driver.quitDriver();
    }
}