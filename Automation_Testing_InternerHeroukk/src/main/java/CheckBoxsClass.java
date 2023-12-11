import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxsClass extends pageBase{
    public CheckBoxsClass(WebDriver driver) {
        super(driver);
    }
    private By  choose_One = By.cssSelector("input[type=\"checkbox\"]") ;
    WebElement e ;
    public void Click_on_CheckBox_One(){
        e =driver.findElement(choose_One) ;
        Clicking(e);
    }
    private By  choose_Two = By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)");
    WebElement e1 ;
    public void Click_on_CheckBox_Two(){
        e1 =driver.findElement(choose_Two) ;
        Clicking(e1);
    }

}
