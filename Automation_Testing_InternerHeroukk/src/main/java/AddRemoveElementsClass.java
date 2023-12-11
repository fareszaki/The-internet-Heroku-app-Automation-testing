import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddRemoveElementsClass extends pageBase{
    public AddRemoveElementsClass(WebDriver driver){
        super(driver) ;
    }


   private  By Click_On_Add_Element =By.cssSelector("button[onclick=\"addElement()\"]");
    private WebElement e ;
    public void Click_On_Add_Element(){
        e= driver.findElement(Click_On_Add_Element);
        Clicking(e);
    }
    private  By Click_On_Remove_Element =By.cssSelector("button[class=\"added-manually\"][onclick=\"deleteElement()\"]");
    private WebElement e1 ;
    public void Click_On_Remove_Element() {
        e1 = driver.findElement(Click_On_Remove_Element);
        Clicking(e1);

    }


    public Boolean Is_Displayed(WebElement e  , By ele) {
        e= driver.findElement(ele);
        Boolean x =   e.isDisplayed();
        return x ;
    }


}

