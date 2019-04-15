import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverDemo {
    public static void main(String[] args) {

        //System.setProperty("webdriver.gecko.driver", "C:/Tools/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:/Tools/chromedriver.exe");
        //System.setProperty("webdriver.edge.driver", "C:/Tools/MicrosoftWebDriver.exe");

        //WebDriver driver = new FirefoxDriver();
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new EdgeDriver();
        //Can't test safari on windows

        driver.get("https://www.google.com");

        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("pluralsight");
        searchField.sendKeys(Keys.RETURN);
    }
}