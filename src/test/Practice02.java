package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;


public class Practice02 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.techglobalschool.com/");

        WebElement firstNameInput = driver.findElement(By.xpath("//*[@id=\"input_comp-khwayxk9\"]"));
        WebElement lastNameInput = driver.findElement(By.xpath("//*[@id=\"input_comp-khwaz4h2\"]"));
        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"input_comp-khwb0zsz\"]"));

        String firstName = "John";
        String lastName = "Doe";
        String email = "jonhdoe@gmail.com";

        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        emailInput.sendKeys(email);

        System.out.println(firstNameInput.getAttribute("value").equals(firstName));
        System.out.println(lastNameInput.getAttribute("value").equals(lastName));
        System.out.println(emailInput.getAttribute("value").equals(email));

        System.out.println(firstNameInput.getAttribute("maxLength"));
        System.out.println(lastNameInput.getAttribute("maxLength"));
        System.out.println(emailInput.getAttribute("maxLength"));

        Thread.sleep(2000);
        firstNameInput.clear();
        Thread.sleep(2000);
        firstNameInput.sendKeys("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001111111111");
        System.out.println(firstNameInput.getAttribute("value"));
        System.out.println(firstNameInput.getAttribute("value").length());


        Driver.quitDriver();
    }
}
