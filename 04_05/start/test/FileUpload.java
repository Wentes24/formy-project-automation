import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/Mike/Documents/Selenium/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");
        //select using cssSelector
        WebElement buttonChoose = driver.findElement(By.cssSelector(".btn.btn-secondary.btn-choose"));
        buttonChoose.click();
        Thread.sleep(1500);


        WebElement choosefile = driver.findElement(By.id("file-upload-field"));
        choosefile.sendKeys("activity_3045790281.tcx");

        Thread.sleep(1500);

        driver.quit();
    }
}
