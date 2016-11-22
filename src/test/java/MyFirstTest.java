import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by User on 2016-11-21.
 */
public class MyFirstTest {

    @Test
    public void startWebDriver(){
        System.setProperty("webdriver.gecko.driver","geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://seleniumsimplified.com/");
        Assert.assertTrue("title should start with Selenium Simplified",
                driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();
        driver.quit();
    }
}
