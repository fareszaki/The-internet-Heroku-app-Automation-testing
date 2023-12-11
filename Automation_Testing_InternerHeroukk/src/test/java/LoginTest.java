import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase {
    private HomePase h ;
    private LoginClass l ;
   private SoftAssert soft ;
   @Test
    public void verify_we_can_navigate_to_formAuthentication(){
       h=new HomePase(driver);
       h.Click_On_Form_Authentication();
       l =new LoginClass(driver) ;
       // ensure we naviget to LoginPage
       String Actual_Url =  l.Return_Current_Url();
        String Expected_url = "https://the-internet.herokuapp.com/login" ;
       soft=new SoftAssert();
       soft.assertEquals(Actual_Url , Expected_url);
       soft.assertAll();
   }
   @Test
    public void login_using_invalidCredentials(){
       h=new HomePase(driver);
       h.Click_On_Form_Authentication();
       l =new LoginClass(driver) ;
       // fill email
       l.FIll_User_Name("fares");
       // fill password
       l.Fill_password("gsafdyq");
       // click login
       l.Click_on_login();
       // Assert
       soft =new SoftAssert();
       String Actual_Url =  l.Return_Current_Url();
       String Expected_url = "https://the-internet.herokuapp.com/login" ;
       soft.assertEquals(Actual_Url , Expected_url);
       //  error msg
       WebElement e= driver.findElement(By.cssSelector("div[class=\"flash error\"]"));
       String error_msg =e.getText();
       soft.assertTrue(error_msg.contains("is invalid!"));
       // assert color
     String color =  e.getCssValue("background-color");
     soft.assertEquals(Color.fromString(color).asHex() , "#c60f13");
    soft.assertAll();
   }
    @Test
    public void login_using_validCredentials() {
        h = new HomePase(driver);
        h.Click_On_Form_Authentication();
        l = new LoginClass(driver);
        // fill email
        l.FIll_User_Name("tomsmith");
        // fill password
        l.Fill_password("SuperSecretPassword!");
        // click login
        l.Click_on_login();
        // Assert
        soft = new SoftAssert();
        String Actual_Url = l.Return_Current_Url();
        String Expected_url = "https://the-internet.herokuapp.com/secure";
        soft.assertEquals(Actual_Url, Expected_url);
        WebElement e= driver.findElement(By.cssSelector("div[id=\"flash\"][class=\"flash success\"]"));
        String msg =e.getText();
        soft.assertTrue(msg.contains(" You logged into a secure area! "));
        // assert color
        String color =  e.getCssValue("background-color");
        soft.assertEquals(Color.fromString(color).asHex() , "#5da423");
        soft.assertAll();


   }

    }
