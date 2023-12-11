import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AddOrRemoveElementsTest extends TestBase{
    private HomePase p1 ;
    private AddRemoveElementsClass add ;
     private  SoftAssert soft ;
     @Test(priority =  0)
     public void Vrify_That_We_Can_Navigate_to_AddorRemoveElementsModule(){
         p1 = new HomePase(driver);
         p1.Click_on_AddOrRemoveElements() ;
         add= new AddRemoveElementsClass(driver) ;
         soft =new SoftAssert() ;
         String Expected_Url = "https://the-internet.herokuapp.com/add_remove_elements/" ;
         String Current_Url =add.Return_Current_Url();
         System.out.println(Current_Url);
         soft.assertEquals(Current_Url , Expected_Url);
     }

    @Test(priority = 1)
    public void Add_Or_Remove_Elements(){
        p1 = new HomePase(driver);
        p1.Click_on_AddOrRemoveElements() ;
        add= new AddRemoveElementsClass(driver) ;
        soft =new SoftAssert() ;
        String Expected_Url = "https://the-internet.herokuapp.com/add_remove_elements/" ;
        String Current_Url =add.Return_Current_Url();
        System.out.println(Current_Url);
        soft.assertEquals(Current_Url , Expected_Url);
        add.Click_On_Add_Element();
        By Click_On_Remove_Element =By.cssSelector("button[class=\"added-manually\"][onclick=\"deleteElement()\"]");
        WebElement e1 = driver.findElement(Click_On_Remove_Element) ;
        Boolean X=  add.Is_Displayed(e1, Click_On_Remove_Element) ;
        soft.assertTrue(X);
        add.Click_On_Remove_Element();
        soft.assertFalse(X);
        soft.assertAll();
     }
}
