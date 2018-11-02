import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoTutorialPage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cmangalapalli\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ultimateqa.com/automation/");
        WebElement element = driver.findElement(By.xpath("//a[@href='https://www.ultimateqa.com/video-tutorials/']"));
        element.click();
        String expectedTitle = "Ultimate QA";
        String actualTitle = "";
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