import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePase extends pageBase{
    public HomePase(WebDriver driver) {
        super(driver);
    }
    private By click_on_Add_Remove_Elements = By.cssSelector("a[href=\"/add_remove_elements/\"]");
    private WebElement element ;
    public AddRemoveElementsClass Click_on_AddOrRemoveElements(){
        element =driver.findElement(click_on_Add_Remove_Elements);
        Clicking(element);
        return  new AddRemoveElementsClass(driver);
    }
    private By Click_On_CheckBoxs = By.cssSelector("a[href=\"/checkboxes\"]");

     private WebElement element1;
     public void Click_On_CheckBoxsModule(){
         element1= driver.findElement(Click_On_CheckBoxs);
         Clicking(element1);
     }
     private By click_on_form_auhentication =By.cssSelector("a[href=\"/login\"]") ;
     private WebElement element2 ;
     public void Click_On_Form_Authentication(){
         element2 =driver.findElement(click_on_form_auhentication) ;
         Clicking(element2);
     }
     public void Click_On_Upload_File(){
         WebElement e = driver.findElement(By.cssSelector("a[href=\"/upload\"]"));
         Clicking(e);
     }


}
