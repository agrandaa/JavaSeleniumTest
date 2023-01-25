import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FirstSeleniumWebDriverTest {

    @Test
    public void simpleSeleniumTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        String title = driver.getTitle();
        Assert.assertEquals("Web form", title);
        System.out.println("Title: " + title);

        driver.quit();
    }
}
