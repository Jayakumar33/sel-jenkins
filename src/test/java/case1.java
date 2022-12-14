import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class case1 {

    @Test
    public void TestCase1() throws InterruptedException {

        // Access LT
        String hub = "@hub.lambdatest.com/wd/hub";
        String username = "jayak";
        String authkey = "0GsolydgtELi8kIDWXrlbqsOqEAha18GMAJYl0yHsZTprHqFLT";
//        capability
        DesiredCapabilities caps = new DesiredCapabilities();
        ChromeOptions browserOptions = new ChromeOptions();
        HashMap<String, Object> ltOptions = new HashMap<String, Object>();
        ltOptions.put("browserName", "Chrome");
        ltOptions.put("browserVersion", "105.0");
        ltOptions.put("platformName", "Windows 10");
        ltOptions.put("username", "jayak");
        ltOptions.put("accessKey", "0GsolydgtELi8kIDWXrlbqsOqEAha18GMAJYl0yHsZTprHqFLT");
        ltOptions.put("build", "sel-3");
        ltOptions.put("project", "untitled");
        ltOptions.put("w3c", true);
        ltOptions.put("plugin", "java-testNG");
        caps.setCapability("LT:Options", ltOptions);


        WebDriver driver = null;
        try {
            driver = new RemoteWebDriver(new URL("https://" + username + ":" + authkey + hub), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver.manage().window().maximize();
        driver.get("https://www.lambdatest.com/automation-demos");
        driver.findElement(By.id("username")).sendKeys("lambda");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("lambda123");
        Thread.sleep(1000);
        driver.findElement(By.className("applynow")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("developer-name")).sendKeys("jayak@lambdatest.com");Thread.sleep(1000);
        driver.findElement(By.className("cookie__bar__close")).click();
        driver.findElement(By.id("populate")).click();Thread.sleep(1000);
        driver.switchTo().alert().accept();
        driver.findElement(By.id("month")).click();Thread.sleep(1000);
        driver.findElement(By.id("discounts")).click();Thread.sleep(1000);
        driver.findElement(By.id("tried-ecom")).click();Thread.sleep(1000);
        driver.findElement(By.id("comments")).sendKeys("IT works with selenium");Thread.sleep(1000);
        driver.findElement(By.cssSelector("#submit-button")).click();Thread.sleep(3000);

        driver.close();

    }

    @Test
    public void TestCase2() throws InterruptedException {

        // Access LT
        String hub = "@hub.lambdatest.com/wd/hub";
        String username = "jayak";
        String authkey = "0GsolydgtELi8kIDWXrlbqsOqEAha18GMAJYl0yHsZTprHqFLT";

//        capability
        DesiredCapabilities caps = new DesiredCapabilities();
        ChromeOptions browserOptions = new ChromeOptions();
        HashMap<String, Object> ltOptions = new HashMap<String, Object>();
        ltOptions.put("browserName", "Chrome");
        ltOptions.put("browserVersion", "104.0");
        ltOptions.put("platformName", "Windows 10");
        ltOptions.put("username", "jayak");
        ltOptions.put("accessKey", "0GsolydgtELi8kIDWXrlbqsOqEAha18GMAJYl0yHsZTprHqFLT");
        ltOptions.put("project", "untitled");
        ltOptions.put("build", "sel-3");
        ltOptions.put("w3c", true);
        ltOptions.put("plugin", "java-testNG");
        caps.setCapability("LT:Options", ltOptions);


        WebDriver driver = null;
        try {
            driver = new RemoteWebDriver(new URL("https://" + username + ":" + authkey + hub), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver.manage().window().maximize();
        driver.get("https://www.lambdatest.com/automation-demos");
        driver.findElement(By.id("username")).sendKeys("lambda");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("lambda123");
        Thread.sleep(1000);
        driver.findElement(By.className("applynow")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("developer-name")).sendKeys("jayak@lambdatest.com");Thread.sleep(1000);
        driver.findElement(By.className("cookie__bar__close")).click();
        driver.findElement(By.id("populate")).click();Thread.sleep(1000);
        driver.switchTo().alert().accept();
        driver.findElement(By.id("month")).click();Thread.sleep(1000);
        driver.findElement(By.id("discounts")).click();Thread.sleep(1000);
        driver.findElement(By.id("tried-ecom")).click();Thread.sleep(1000);
        driver.findElement(By.id("comments")).sendKeys("IT works with selenium");Thread.sleep(1000);
        driver.findElement(By.cssSelector("#submit-button")).click();Thread.sleep(3000);

        driver.close();

    }

    @Test
    public void TestCase3() throws InterruptedException {

        // Access LT
        String hub = "@hub.lambdatest.com/wd/hub";
        String username = "jayak";
        String authkey = "0GsolydgtELi8kIDWXrlbqsOqEAha18GMAJYl0yHsZTprHqFLT";

//        capability
        DesiredCapabilities caps = new DesiredCapabilities();
        ChromeOptions browserOptions = new ChromeOptions();
        HashMap<String, Object> ltOptions = new HashMap<String, Object>();
        ltOptions.put("browserName", "Chrome");
        ltOptions.put("browserVersion", "100.0");
        ltOptions.put("platformName", "Windows 10");
        ltOptions.put("username", "jayak");
        ltOptions.put("accessKey", "0GsolydgtELi8kIDWXrlbqsOqEAha18GMAJYl0yHsZTprHqFLT");
        ltOptions.put("project", "untitled");
        ltOptions.put("build", "sel-3");
        ltOptions.put("w3c", true);
        ltOptions.put("plugin", "java-testNG");
        caps.setCapability("LT:Options", ltOptions);


        WebDriver driver = null;
        try {
            driver = new RemoteWebDriver(new URL("https://" + username + ":" + authkey + hub), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver.manage().window().maximize();
        driver.get("https://www.lambdatest.com/automation-demos");
        driver.findElement(By.id("username")).sendKeys("lambda");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("lambda123");
        Thread.sleep(1000);
        driver.findElement(By.className("applynow")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("developer-name")).sendKeys("jayak@lambdatest.com");Thread.sleep(1000);
        driver.findElement(By.className("cookie__bar__close")).click();
        driver.findElement(By.id("populate")).click();Thread.sleep(1000);
        driver.switchTo().alert().accept();
        driver.findElement(By.id("month")).click();Thread.sleep(1000);
        driver.findElement(By.id("discounts")).click();Thread.sleep(1000);
        driver.findElement(By.id("tried-ecom")).click();Thread.sleep(1000);
        driver.findElement(By.id("comments")).sendKeys("IT works with selenium");Thread.sleep(1000);
        driver.findElement(By.cssSelector("#submit-button")).click();Thread.sleep(3000);

        driver.close();

    }

    @Test
    public void TestCase4() throws InterruptedException {

        // Access LT
        String hub = "@hub.lambdatest.com/wd/hub";
        String username = "jayak";
        String authkey = "0GsolydgtELi8kIDWXrlbqsOqEAha18GMAJYl0yHsZTprHqFLT";
//        capability
        DesiredCapabilities caps = new DesiredCapabilities();
        ChromeOptions browserOptions = new ChromeOptions();
        HashMap<String, Object> ltOptions = new HashMap<String, Object>();
        ltOptions.put("browserName", "Chrome");
        ltOptions.put("browserVersion", "102.0");
        ltOptions.put("platformName", "Windows 10");
        ltOptions.put("username", "jayak");
        ltOptions.put("accessKey", "0GsolydgtELi8kIDWXrlbqsOqEAha18GMAJYl0yHsZTprHqFLT");
        ltOptions.put("project", "untitled");
        ltOptions.put("build", "sel-3");
        ltOptions.put("w3c", true);
        ltOptions.put("plugin", "java-testNG");
        caps.setCapability("LT:Options", ltOptions);


        WebDriver driver = null;
        try {
            driver = new RemoteWebDriver(new URL("https://" + username + ":" + authkey + hub), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver.manage().window().maximize();
        driver.get("https://www.lambdatest.com/automation-demos");
        driver.findElement(By.id("username")).sendKeys("lambda");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("lambda123");
        Thread.sleep(1000);
        driver.findElement(By.className("applynow")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("developer-name")).sendKeys("jayak@lambdatest.com");Thread.sleep(1000);
        driver.findElement(By.className("cookie__bar__close")).click();
        driver.findElement(By.id("populate")).click();Thread.sleep(1000);
        driver.switchTo().alert().accept();
        driver.findElement(By.id("month")).click();Thread.sleep(1000);
        driver.findElement(By.id("discounts")).click();Thread.sleep(1000);
        driver.findElement(By.id("tried-ecom")).click();Thread.sleep(1000);
        driver.findElement(By.id("comments")).sendKeys("IT works with selenium");Thread.sleep(1000);
        driver.findElement(By.cssSelector("#submit-button")).click();Thread.sleep(3000);

        driver.close();

    }

    @Test
    public void TestCase5() throws InterruptedException {

        // Access LT
        String hub = "@hub.lambdatest.com/wd/hub";
        String username = "jayak";
        String authkey = "0GsolydgtELi8kIDWXrlbqsOqEAha18GMAJYl0yHsZTprHqFLT";
//        capability
        DesiredCapabilities caps = new DesiredCapabilities();
        ChromeOptions browserOptions = new ChromeOptions();
        HashMap<String, Object> ltOptions = new HashMap<String, Object>();
        ltOptions.put("browserName", "Chrome");
        ltOptions.put("browserVersion", "100.0");
        ltOptions.put("platformName", "Windows 10");
        ltOptions.put("username", "jayak");
        ltOptions.put("accessKey", "0GsolydgtELi8kIDWXrlbqsOqEAha18GMAJYl0yHsZTprHqFLT");
        ltOptions.put("project", "untitled");
        ltOptions.put("build", "sel-3");
        ltOptions.put("w3c", true);
        ltOptions.put("plugin", "java-testNG");
        caps.setCapability("LT:Options", ltOptions);


        WebDriver driver = null;
        try {
            driver = new RemoteWebDriver(new URL("https://" + username + ":" + authkey + hub), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver.manage().window().maximize();
        driver.get("https://www.lambdatest.com/automation-demos");
        driver.findElement(By.id("username")).sendKeys("lambda");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("lambda123");
        Thread.sleep(1000);
        driver.findElement(By.className("applynow")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("developer-name")).sendKeys("jayak@lambdatest.com");Thread.sleep(1000);
        driver.findElement(By.className("cookie__bar__close")).click();
        driver.findElement(By.id("populate")).click();Thread.sleep(1000);
        driver.switchTo().alert().accept();
        driver.findElement(By.id("month")).click();Thread.sleep(1000);
        driver.findElement(By.id("discounts")).click();Thread.sleep(1000);
        driver.findElement(By.id("tried-ecom")).click();Thread.sleep(1000);
        driver.findElement(By.id("comments")).sendKeys("IT works with selenium");Thread.sleep(1000);
        driver.findElement(By.cssSelector("#submit-button")).click();Thread.sleep(3000);

        driver.close();

    }


}
