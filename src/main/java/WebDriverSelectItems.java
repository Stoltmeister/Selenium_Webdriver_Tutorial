import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverSelectItems {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\WebDriverDemo\\src\\main\\webapp\\SelectItemTest.html");

        WebElement selectElement = driver.findElement(By.id("select1"));
        Select select = new Select(selectElement); //the support.ui.select package needed
        select.selectByVisibleText("Maybe");

    }
}
