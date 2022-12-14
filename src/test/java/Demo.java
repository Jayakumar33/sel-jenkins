
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.time.Duration;
import java.util.HashMap;

import static org.openqa.selenium.By.*;



public class Demo extends testReport{
    // Access LT
    String hub = "@hub.lambdatest.com/wd/hub";
    String username = "jayak";
    String authkey = "0GsolydgtELi8kIDWXrlbqsOqEAha18GMAJYl0yHsZTprHqFLT";
    WebDriver driver = null;
    // api from lambdatest for single report



    DesiredCapabilities caps = new DesiredCapabilities();
    // api from lambdatest for single report



    @BeforeTest
    void setData(){
        des="First test";
        author = "jayakumar";
        testcase ="web-driver";

    }

    @BeforeMethod
    public void capabilities(){
//        capability
        ChromeOptions browserOptions = new ChromeOptions();
        HashMap<String, Object> ltOptions = new HashMap<String, Object>();
        ltOptions.put("browserName", "Chrome");
        ltOptions.put("browserVersion", "105.0");
        ltOptions.put("platformName", "Windows 10");
        ltOptions.put("username", "jayak");
        ltOptions.put("accessKey", "0GsolydgtELi8kIDWXrlbqsOqEAha18GMAJYl0yHsZTprHqFLT");
        ltOptions.put("build", "Demo");
        ltOptions.put("project", "untitled");
        ltOptions.put("w3c", true);
        ltOptions.put("plugin", "java-testNG");
//        ltOptions.put("tunnel", true);
        caps.setCapability("LT:Options", ltOptions);


        try {
            driver = new RemoteWebDriver(new URL("https://" + username + ":" + authkey + hub), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }


    }

    @Test
    public void chrome() throws InterruptedException {


        driver.get("http://tutorialsninja.com/demo/");

//         Register
        driver.manage().window().maximize();
        driver.findElement(xpath("//i[@class='fa fa-user']")).click();
        driver.findElement(xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.urlToBe("http://tutorialsninja.com/demo/index.php?route=account/login"));


//        login credintals
        driver.findElement(id("input-email")).sendKeys("jaimech61@gmail.com");
        driver.findElement(xpath("//input[@id='input-password']")).sendKeys("1234567890");
        driver.findElement(xpath("//input[@value='Login']")).click();

//        making purchase
        WebElement inputKeyword = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        inputKeyword.sendKeys("macbook");
        String val = inputKeyword.getAttribute("value");
        driver.findElement(xpath("//button[@class='btn btn-default btn-lg']")).click();
        String url = driver.getCurrentUrl();


        Assert.assertEquals("http://tutorialsninja.com/demo/index.php?route=product/search&search=macbook", url,"please re-check the url");
        Assert.assertEquals("macbook", val, "input word is wrong");


//        adding macbook to cart
        driver.findElement(cssSelector("body > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(8) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1)")).click();
        String macBookUrl = driver.getCurrentUrl();
        Assert.assertEquals("http://tutorialsninja.com/demo/index.php?route=product/product&product_id=43&search=macbook", macBookUrl,"please re-check the url");
        driver.findElement(xpath("//button[@id='button-cart']")).click();


       // check out
        driver.findElement(xpath("//a[@title='Checkout']//i[@class='fa fa-share']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='button-payment-address']")).click();

        // payment method
        Thread.sleep(3000);
        driver.findElement(By.name("comment")).sendKeys("demo text for comment");
        Thread.sleep(3000);
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.id("button-payment-method")).click();




        // account creation
////        wait.until(ExpectedConditions.urlToBe("http://tutorialsninja.com/demo/index.php?route=account/register"));
//        driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Jaya");
//        driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("kumar");
//        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("jaimech61@gmail.com");
//        driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("1234567890");
//        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("1234567890");
//        driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("1234567890");
//
//        driver.findElement(By.xpath("//input[@value='0']")).click();
//        driver.findElement(By.xpath("//input[@name='agree']")).click();
//        driver.findElement(By.xpath("//input[@value='Continue']")).click();
//
//

//        // payment details
////        driver.findElement(By.xpath("//a[@class='accordion-toggle collapsed']")).click();
//        driver.findElement(By.cssSelector("input#input-payment-firstname")).sendKeys("Jaya");
//        driver.findElement(By.xpath("//input[@id='input-payment-lastname']")).sendKeys("kumar");
//        driver.findElement(By.xpath("//input[@id='input-payment-company']")).sendKeys("jaimech61");
//        driver.findElement(By.xpath("//input[@id='input-payment-company']")).sendKeys("1234567890");
//        driver.findElement(By.xpath("//input[@id='input-payment-address-1']")).sendKeys("1234567890");
//        driver.findElement(By.xpath("//input[@id='input-payment-address-2']")).sendKeys("1234567890");
//        driver.findElement(By.xpath("//input[@id='input-payment-city']")).sendKeys("coimbatore");
//        driver.findElement(By.xpath("//input[@id='input-payment-postcode']")).sendKeys("61021");
//
////        selecting country
//        List <WebElement> countries = driver.findElements(By.cssSelector("select#input-payment-country"));
//        for ( WebElement country: countries) {
//            if(country.getText().trim().equals("India")) {
//                country.click();
//                break;
//            }
//
//        }
//
//        driver.findElement(xpath("")).click();


    }

    @AfterMethod
    public void exit(){
        stepsReport("pass","the test has been passed ");
        driver.get("https://api.lambdatest.com/automation/api/v1/sessions/7VNBQ-539RU-BEMHT-GX7IZ/video");
        driver.close();
    }

}
