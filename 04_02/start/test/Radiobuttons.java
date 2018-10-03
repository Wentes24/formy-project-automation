import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/Mike/Documents/Selenium/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radiobutton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radiobutton2.click();
        Thread.sleep(1000);

        WebElement radiobutton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radiobutton3.click();
        Thread.sleep(1000);

        WebElement radiobutton1 = driver.findElement(By.id("radio-button-1"));
        radiobutton1.click();
        Thread.sleep(1000);

        WebElement urlFormy = driver.findElement(By.id("logo"));
        urlFormy.click();
        Thread.sleep(1000);

        WebElement urlCheckbox = driver.findElement(By.xpath("/html/body/div/div/li[3]/a"));
        urlCheckbox.click();

        Thread.sleep(1000);
        WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
        checkbox1.click();

        Thread.sleep(1000);
        WebElement checkbox2 = driver.findElement(By.id("checkbox-2"));
        checkbox2.click();

        Thread.sleep(1000);
        WebElement checkbox3 = driver.findElement(By.id("checkbox-3"));
        checkbox3.click();

        driver.quit();
    }
}
