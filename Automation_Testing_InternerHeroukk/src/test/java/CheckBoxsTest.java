import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckBoxsTest extends TestBase{
    private HomePase p ;
    private CheckBoxsClass c1 ;
    private SoftAssert soft ;
    @Test
    public void verify_That_we_Can_Navigate_To_Check_Boxs_Module(){
        p =new HomePase(driver) ;
        p.Click_On_CheckBoxsModule();
        //Assert That we success Navigate to CheckBoxs
        soft=new SoftAssert() ;
        String Actual_Url = p.Return_Current_Url() ;
       String Exoected_Url = "https://the-internet.herokuapp.com/checkboxes" ;
       soft.assertEquals(Actual_Url , Exoected_Url);
       soft.assertAll();
    }
    @Test
    public void verify_that_we_can_choose_one_checksBoxs(){
        p=new HomePase(driver);
        p.Click_On_CheckBoxsModule();
        c1 =new CheckBoxsClass(driver) ;
        soft = new SoftAssert();
        c1.Click_on_CheckBox_Two();
        c1.Click_on_CheckBox_One();
        WebElement e = driver.findElement(By.cssSelector("input[type=\"checkbox\"]")) ;
        soft.assertTrue(e.isSelected());
        // then make checkbox one is unselected
        c1.Click_on_CheckBox_One();
        // then check if it unselected
        //soft.assertFalse(e.isDisplayed());
        // choose the elemetn two
        c1.Click_on_CheckBox_Two();
        // verify if it selected
        WebElement e1 = driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)")) ;
        soft.assertTrue(e1.isSelected());
        soft.assertAll();


    }
}
