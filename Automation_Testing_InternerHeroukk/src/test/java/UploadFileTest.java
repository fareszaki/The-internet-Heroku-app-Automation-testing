import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UploadFileTest extends TestBase {
    private HomePase h ;
    private  UploadFilesClass upload ;
    SoftAssert soft ;
    @Test
    public void Verify_We_can_Naviate_to_Uploadfile(){
        h=new HomePase(driver) ;
        h.Click_On_Upload_File();
        String Url =  h.Return_Current_Url();
        soft=new SoftAssert();
        soft.assertEquals(Url , "https://the-internet.herokuapp.com/upload");
  soft.assertAll();

    }
    @Test
    public void  test_that_we_can_upload_file(){
        h=new HomePase(driver) ;
        h.Click_On_Upload_File();
        upload =new UploadFilesClass(driver);
        upload.upload_file("C:\\Users\\HP\\Documents\\new 1.xml");
        upload.clicking_upload();
    }



}
