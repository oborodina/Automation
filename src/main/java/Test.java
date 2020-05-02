import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test {
    public static void main(String[] args) {
        /*WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://rozetka.com.ua/");

        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://rozetka.com.ua/");;*/

        WebDriverManager.edgedriver().setup();
        WebDriver driver2 = new EdgeDriver();
        driver2.get("https://rozetka.com.ua/");

        /*WebDriverManager.firefoxdriver().setup();
        WebDriver driver3 = new FirefoxDriver();
        driver3.get("https://rozetka.com.ua/");*/
    }
}
