import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginClass extends pageBase{
    public LoginClass(WebDriver driver ){
        super(driver) ;
    }
      private By fill_UserName = By.cssSelector("input[id=\"username\"]") ;
      private WebElement e ;
      public void FIll_User_Name(String email){
        e = driver.findElement(fill_UserName);
        Fill_Field(e , email);
      }
    private By fill_password =By.cssSelector("input[id=\"password\"]");
     private WebElement e1 ;
     public void Fill_password(String pass){
         e1 =driver.findElement(fill_password) ;
         Fill_Field(e1 , pass);
     }
     private By click_on_login = By.cssSelector("i[class=\"fa fa-2x fa-sign-in\"]");
     private WebElement x ;
     public void Click_on_login(){
         x= driver.findElement(click_on_login);
         Clicking(x);
     }

}
