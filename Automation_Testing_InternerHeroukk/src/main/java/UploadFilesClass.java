import org.openqa.selenium.*;

public class UploadFilesClass extends  pageBase{

    public UploadFilesClass(WebDriver driver) {
        super(driver);
    }

 public void upload_file(String path) {

     WebElement fileInput = driver.findElement(By.cssSelector("input[type='file']"));

     // Create JavascriptExecutor instance
     JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

// Make the element visible using JavaScript
     jsExecutor.executeScript("arguments[0].style.display = 'block';", fileInput);

// Now you can interact with the visible file input element
     fileInput.sendKeys(path);

 }
    private By Click_upload1 =By.cssSelector("input[id=\"file-submit\"]");
    WebElement x ;
    public void  clicking_upload(){
        x= driver.findElement(Click_upload1);
        Clicking(x);
    }

}
