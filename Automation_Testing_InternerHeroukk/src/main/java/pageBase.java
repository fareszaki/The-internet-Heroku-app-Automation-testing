import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageBase {
    protected WebDriver driver ;
    public pageBase(WebDriver driver){
        this.driver =driver ;
    }
    public void Clicking(WebElement element){
        element.click();
    }
    public void Fill_Field(WebElement e , String text ){
         e.sendKeys(text);
    }
    public String Return_Current_Url(){
        String Current_Url =   driver.getCurrentUrl() ;
        return  Current_Url ;
    }

}
