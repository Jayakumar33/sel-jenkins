import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;


public class uploadAndDownloadFile {


    // ACCESS KEY AND USERNAME
    String hub = "@hub.lambdatest.com/wd/hub";
    String username = "LT_USERNAME";
    String authkey = "LT_ACCESSKEY";
    RemoteWebDriver driver = null;
    DesiredCapabilities caps = new DesiredCapabilities();


    @BeforeClass
    public void setUp() throws Exception {
        //CAPABILITIES

        EdgeOptions browserOptions = new EdgeOptions();
        HashMap<String, Object> ltOptions = new HashMap<String, Object>();
        ltOptions.put("browserName", "MicrosoftEdge");
        ltOptions.put("browserVersion", "105.0");
        ltOptions.put("platformName", "Windows 10");
        ltOptions.put("username", "jayak");
        ltOptions.put("accessKey", "0GsolydgtELi8kIDWXrlbqsOqEAha18GMAJYl0yHsZTprHqFLT");
        ltOptions.put("build", "Demo");
        ltOptions.put("project", "untitled");
        ltOptions.put("w3c", true);
        ltOptions.put("plugin", "java-testNG");
        caps.setCapability("LT:Options", ltOptions);



        try {
            driver = new RemoteWebDriver(new URL("https://" + username + ":" + authkey + hub), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }


    }

    @Test
    public void lamdaTest() throws Exception {

        // DOWNLOADING FILE FROM THE WEBSITE

        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);
        WebElement file = driver.findElement(By.xpath("//a[normalize-space()='File Download']"));
        file.click();

        // CHECKING THE CLICKED URL IS CORRECT OR NOT USING IMPLICIT WAIT
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.urlToBe("https://the-internet.herokuapp.com/download"));


        //file.sendKeys("C:\\Users\\jayak\\Pictures\\Screenshots\\Screenshot_20221130_194022.png");
        // This will download the file.
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='LambdaTest.txt']")).click();

        Thread.sleep(10000);


        // UPLOADING THE FILE TO THE WEBSITE
        driver.navigate().back();
        WebElement uploadFileWebPage = driver.findElement(By.cssSelector("a[href='/upload']"));
        uploadFileWebPage.click();

        // CHECKING THE CLICKED URL IS CORRECT OR NOT USING IMPLICIT WAIT
        wait.until(ExpectedConditions.urlToBe("https://the-internet.herokuapp.com/upload"));

        Thread.sleep(5000);
        driver.setFileDetector(new LocalFileDetector());
        WebElement chooseFile = driver.findElement(By.cssSelector("#file-upload"));
        chooseFile.sendKeys("C:\\Users\\jayak\\Downloads\\LambdaTest.txt");
        Thread.sleep(5000);


        driver.findElement(By.xpath("//input[@id='file-submit']")).click();
        Thread.sleep(5000);


    }


    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

}
