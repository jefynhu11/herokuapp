package supports;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import webDrivers.DriveFactory;
import webDrivers.DriverManager;
import webDrivers.Drivers;

public class BaseTest extends DriveFactory {
    @BeforeClass
    public static void setUp() {
        driver = getBrowser(Drivers.CHROME);
        DriverManager.setDriver(driver);
        DriverManager.getDriver();
//        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown() {
        DriverManager.quit();
    }
}
