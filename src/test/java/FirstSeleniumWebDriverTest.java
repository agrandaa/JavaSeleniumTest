import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class FirstSeleniumWebDriverTest {

    WebDriver driver = new ChromeDriver();

    @Test
    public void sampleTest() {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        String title = driver.getTitle();
        Assert.assertEquals("Web form", title);

        WebElement color = driver.findElement(By.xpath("//input[@name='my-colors']"));
        Assert.assertEquals("#563d7c", color.getAttribute("value"));

        WebElement textInput = driver.findElement(By.name("my-text"));
        textInput.sendKeys("text");

        WebElement submitButton = driver.findElement(By.cssSelector("button"));
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        Assert.assertEquals(message.getText(), "Received!");
    }

    @After
    public void quitDriver(){
        driver.close();
        driver.quit();
    }
}