import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver ;
    @BeforeMethod
    public void SetUp(){
        // tunnel for translate java language to language any browser Understood it
        WebDriverManager.chromedriver().setup();
        // create objet from Chromedriver
        driver= new ChromeDriver() ;
        // Configration Driver
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS) ;
        // navigate to site we test it
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }
    @Test
    public void Check_The_Annotations(){
        System.out.println("The Test is ready");
    }

    @AfterMethod
    public void Quit() throws InterruptedException {
        // wait for Five Seconds Before close the site
        Thread.sleep(5000);
        // leave the site
        driver.quit();


    }
}
