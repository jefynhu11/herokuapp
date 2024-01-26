package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import supports.BaseTest;
import tasks.TasksElements;
import webDrivers.DriverManager;

public class TestCaseElements extends BaseTest {

    private final WebDriver driver = DriverManager.getDriver();
    private final TasksElements tasksElements = new TasksElements(driver);

    @Test
    public void elementTest() {
        DriverManager.getDriver().get("https://the-internet.herokuapp.com/add_remove_elements/");
        tasksElements.clickButton();
    }

}
