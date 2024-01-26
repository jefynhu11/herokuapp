package tasks;

import appObjects.AppElements;
import org.openqa.selenium.WebDriver;

public class TasksElements {

    private final WebDriver driver;
    private final AppElements appElements;

    public TasksElements(WebDriver driver) {
        this.driver = driver;
        appElements = new AppElements(driver);
    }

    public void clickButton() {
        appElements.addElementButton().click();
    }

}
