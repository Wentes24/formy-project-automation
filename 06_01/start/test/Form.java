import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/Mike/Documents/Selenium/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Mike");

        WebElement lastname = driver.findElement(By.id("last-name"));
        lastname.sendKeys("Wente");

        WebElement jobtitle = driver.findElement(By.id("job-title"));
        jobtitle.sendKeys("Sr QA Analyst");

        WebElement radioGradSchool = driver.findElement(By.id("radio-button-3"));
        radioGradSchool.click();

        WebElement checkboxSex = driver.findElement(By.id("checkbox-1"));
        checkboxSex.click();

        WebElement dropdownYearsExperience = driver.findElement(By.id("select-menu"));
        dropdownYearsExperience.sendKeys("10+");

        WebElement datepicker = driver.findElement(By.id("datepicker"));
        datepicker.sendKeys("10/04/2018");
        datepicker.sendKeys(Keys.RETURN);

        Thread.sleep(2000);

        WebElement buttonSubmit = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
        buttonSubmit.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement success = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert.alert-success")));


        //Below code believe to be correct but not working as of 10/2/18
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(2000);

        driver.quit();
    }
}
