package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Practice01 {
    public static void main(String[] args) {
        /*
        Go to https://www.techglobalschool.com/
        Scroll down to the bottom of the page

        Validate the Subscribe form
        Validate "Subscribe" heading2 with its text
        Validate "Stay up to date!" paragraph with its text
        Validate "Enter your first name" input box with its placeholder
        Validate "Enter your last name" input box with its placeholder
        Validate "Add your email" input box with its placeholder
        Validate "SUBSCRIBE" button with its text
        */

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.techglobalschool.com/");

        WebElement subscribeForm = driver.findElement(By.xpath("//*[@id=\"comp-keehv7pb\"]"));
        WebElement subscribeHeading = driver.findElement(By.xpath("//*[@id=\"comp-keehv7pd1\"]/h2/span/span"));
        WebElement subtextHeading = driver.findElement(By.xpath("//*[@id=\"comp-keei0711\"]/p/span/span"));
        WebElement firstNameInput = driver.findElement(By.xpath("//*[@id=\"input_comp-khwayxk9\"]"));
        WebElement lastNameInput = driver.findElement(By.xpath("//*[@id=\"input_comp-khwaz4h2\"]"));
        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"input_comp-khwb0zsz\"]"));
        WebElement subscribeButton = driver.findElement(By.xpath("//*[@id=\"comp-khwayqh22\"]/button"));


        System.out.println(subscribeForm.isDisplayed() && subscribeForm.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(subscribeHeading.isDisplayed() && subscribeHeading.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(subtextHeading.isDisplayed() && subtextHeading.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(firstNameInput.isDisplayed() && firstNameInput.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(lastNameInput.isDisplayed() && lastNameInput.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(emailInput.isDisplayed() && emailInput.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(subscribeButton.isDisplayed() && subscribeButton.isEnabled() ? "PASSED" : "FAILED");


        Driver.quitDriver();
    }
}
