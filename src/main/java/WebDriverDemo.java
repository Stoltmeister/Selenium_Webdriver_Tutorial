import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class WebDriverDemo {
    public static void main(String[] args) throws Exception {

        // Have to set system variables to avoid having to do this every 
        //System.setProperty("webdriver.gecko.driver", "C:/Tools/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:/Tools/chromedriver.exe");
        //System.setProperty("webdriver.edge.driver", "C:/Tools/MicrosoftWebDriver.exe");

        // Selenium Server requires this file to be downloaded and run this command from the commandline
        // in that file's directory like this: (java -jar "selenium-server-standalone-3.141.59.jar" -port 8090)
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:8090/wd/hub"), DesiredCapabilities.chrome());

        //WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new ChromeDriver();
        //WebDriver driver = new EdgeDriver();
        //Can't test safari on windows

        driver.get("https://www.google.com");

        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("pluralsight");
        searchField.submit();

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Images")));

        WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
        imagesLink.click();

        WebElement imageElement = driver.findElement(By.cssSelector("#rg_s > div:nth-child(11) > a.rg_l"));
        WebElement imageLink = imageElement.findElements(By.tagName("img")).get(0);
        imageLink.click();

        //driver.getPageSource().contains("Whatever string you want to search for");

    }
}
