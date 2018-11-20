import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BestSeleniumWebDriverResources {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\sahaja\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ultimateqa.com/automation/");
        WebElement element = driver.findElement(By.xpath("//a[@href='https://www.ultimateqa.com/best-selenium-webdriver-resources/']"));
        element.click();
        String expectedTitle = "[LATEST] Best Resources to Learn Selenium Webdriver in 2018 - Ultimate QA";
        String actualTitle;
        actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        driver.close();
    }
}