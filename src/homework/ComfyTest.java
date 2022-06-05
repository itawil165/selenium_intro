package homework;

import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class ComfyTest {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        String expectedTitle = "COMFY ELITE - Pillow, Neck Pillow, Travel, Pillow";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)) System.out.println("Title validation PASSED");
        else System.out.println("Title validation FAILED");

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://comfyelite.com/";

        if(actualURL.equals(expectedURL)) System.out.println("URL validation PASSED");
        else System.out.println("URL validation FAILED");

        Driver.quitDriver();
    }
}
