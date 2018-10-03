import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/Mike/Documents/Selenium/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");
        Thread.sleep(2000);
        WebElement name = driver.findElement(By.id("name"));

        //The below option was how to scroll in video from Linked in...Actions had to be loaded
 //       Actions actions = new Actions(driver);
 //       actions.moveToElement(name);

        //Below was a different option I found on the web
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", name);
        Thread.sleep(1000);
        name.sendKeys("Mike Wente");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2018");

        driver.quit();
    }
}
