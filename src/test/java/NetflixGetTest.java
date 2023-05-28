import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixGetTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "PATH_TO_CHROMEDRIVER");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com/in/");
        
        driver.quit();



    }
}
