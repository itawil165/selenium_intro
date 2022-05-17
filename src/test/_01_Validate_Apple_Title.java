
package test;

import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class _01_Validate_Apple_Title {
    /*
    TEST CASE
    1. Go to "https://www.apple.com/"
    2. Validate the title of the page is displayed as "Apple"
     */

    public static void main(String[] args) throws InterruptedException {
        //1. Set up driver
        WebDriver driver = Driver.getDriver();


        //2. Validation
        driver.get("https://www.apple.com/");

        String expectedTitle = "Apple"; // from requirement
        String actualTitle = driver.getTitle(); // from application under development

        if(actualTitle.equals(expectedTitle)) System.out.println("Title validation PASSED");
        else System.out.println("Title validation FAILED!!!");

        //3. Quit driver
        Driver.quitDriver();
    }
}