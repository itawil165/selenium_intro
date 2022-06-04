package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class FacebookTest {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.facebook.com/");

        // Validate title
        String expectedTitle = "Facebook - log in or sign up";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) System.out.println("PASSED");
        else System.out.println("FAILED");

        // Validate URL
        String expectedURL = "https://www.facebook.com/";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.equals(expectedURL)) System.out.println("PASSED");
        else System.out.println("FAILED");

        // Validate Facebook logo
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img"));
        if (logo.isDisplayed()) System.out.println("PASSED");
        else System.out.println("FAILED");

        // Validate Heading 2
        WebElement heading2 = driver.findElement(By.cssSelector("._8eso"));
        if (heading2.isDisplayed()) System.out.println("PASSED");
        else System.out.println("FAILED");

        // Validate email or phone number input box
        WebElement emailInputBox = driver.findElement(By.xpath("//*[@id='email']"));
        if (emailInputBox.isDisplayed()) System.out.println("PASSED");
        else System.out.println("FAILED");

        // Validate password input box
        WebElement passwordInputBox = driver.findElement(By.cssSelector("input[id=pass]"));
        if (passwordInputBox.isDisplayed()) System.out.println("PASSED");
        else System.out.println("FAILED");

        // Validate login button
        WebElement loginButton = driver.findElement(By.cssSelector("button[data-testid='royal_login_button']"));
        if (loginButton.isDisplayed() && loginButton.isEnabled()) System.out.println("PASSED");
        else System.out.println("FAILED");

        // Validate forgot password link
        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot password?"));
        if (forgotPasswordLink.isDisplayed() && forgotPasswordLink.isEnabled()) System.out.println("PASSED");
        else System.out.println("FAILED");

        // Validate create new account button
        WebElement createNewAccountButton =  driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        if (createNewAccountButton.isDisplayed() && createNewAccountButton.isEnabled()) System.out.println("PASSED");
        else System.out.println("FAILED");



        Driver.quitDriver();
    }
}
