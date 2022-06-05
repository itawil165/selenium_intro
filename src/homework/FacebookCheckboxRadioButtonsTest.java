package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class FacebookCheckboxRadioButtonsTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.facebook.com/");

        WebElement createNewAccountButton = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        System.out.println(createNewAccountButton.isDisplayed() && createNewAccountButton.isEnabled());
        createNewAccountButton.click();

        WebElement firstName = driver.findElement(By.cssSelector("input[name='firstname']"));
        System.out.println(firstName.isDisplayed());
        firstName.sendKeys("John");

        WebElement lastName = driver.findElement(By.cssSelector("input[name='lastname']"));
        System.out.println(lastName.isDisplayed());
        lastName.sendKeys("Doe");

        WebElement email = driver.findElement(By.cssSelector("input[name='reg_email__']"));
        System.out.println(email.isDisplayed());
        email.sendKeys("jonhdoe55555@gmail.com");

        Thread.sleep(250);

        WebElement emailConfirmation = driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']"));
        System.out.println(emailConfirmation.isDisplayed());
        emailConfirmation.sendKeys("jonhdoe55555@gmail.com");

        WebElement password = driver.findElement(By.id("password_step_input"));
        System.out.println(password.isDisplayed());
        password.sendKeys("abcd1234");

        Thread.sleep(250);

        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByVisibleText("Apr");

        Select day = new Select(driver.findElement(By.id("day")));
        day.selectByVisibleText("1");

        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByVisibleText("1990");

        WebElement gender = driver.findElement(By.xpath("//span[2]/input[@name='sex']"));
        System.out.println(gender.isDisplayed());
        gender.click();

        WebElement signUpButton = driver.findElement(By.cssSelector("button[name='websubmit']"));
        System.out.println(signUpButton.isDisplayed() && signUpButton.isEnabled());
        signUpButton.click();

        Thread.sleep(5000);

        WebElement errorMessage = driver.findElement(By.id("reg_error_inner"));
        String expectedMessage = "Please choose a more secure password. It should be longer than 6 characters, unique to you, and difficult for others to guess.";
        String actualMessage = errorMessage.getText();
        if (actualMessage.equals(expectedMessage) && errorMessage.isDisplayed()) System.out.println("Error message PASSED");
        else System.out.println("Error message FAILED");


        Driver.quitDriver();


    }
}
