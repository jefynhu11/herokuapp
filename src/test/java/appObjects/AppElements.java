package appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import supports.BaseTest;

public class AppElements {

    private final WebDriver driver;

    public AppElements (WebDriver driver) {
        this.driver = driver;
    }

    public WebElement addElementButton() {
        return driver.findElement(By.cssSelector(".example button"));
    }
}
