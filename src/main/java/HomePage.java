import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "D:\\sahaja\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ultimateqa.com/automation/");
        String expectedTitle = "Automation Practice - Ultimate QA";
        String actualTitle = "";
        actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        WebElement element=driver.findElement(By.xpath("//a[@href='../complicated-page']"));
        //element.click();


        //WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
        //button.click();
        //driver.close();
        //driver.quit();
    }
}
