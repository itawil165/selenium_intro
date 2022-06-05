package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class eBayDropdownTest {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.ebay.com/");

        Select allCategoriesDropdown = new Select(driver.findElement(By.id("gh-cat")));
        allCategoriesDropdown.selectByVisibleText("Art");

        WebElement searchButton = driver.findElement(By.id("gh-btn"));
        searchButton.click();

        WebElement heading1 = driver.findElement(By.cssSelector(".title-banner__title"));
        String expectedHeading1 = "Welcome to eBay Art";
        String actualHeading1 = heading1.getText();
        if (actualHeading1.equals(expectedHeading1) && heading1.isDisplayed()) System.out.println("Heading1 validation PASSED");
        else System.out.println("Heading1 validation FAILED");

        WebElement heading2 = driver.findElement(By.cssSelector(".title-banner__subtitle"));
        String expectedHeading2 = "Find Prints, Paintings, Posters, and More.";
        String actualHeading2 = heading2.getText();
        if (actualHeading2.equals(expectedHeading2) && heading2.isDisplayed()) System.out.println("Heading2 validation PASSED");
        else System.out.println("Heading2 validation FAILED");

        Driver.quitDriver();
    }
}
