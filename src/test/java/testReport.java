import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v102.page.model.ScreencastFrame;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;


public class testReport {
    ExtentReports extent;
    ExtentTest report;

    String testcase = "";
    String author = "";
    String des= "";








    @BeforeTest
    public void startReportDemo(){
        ExtentSparkReporter spark = new ExtentSparkReporter("./extends.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
    }

    @BeforeClass
    public void createReport() {
        report = extent.createTest(testcase);
        report.assignAuthor(author);
        report.assignCategory(des);
        report.pass("First test");
    }

    public void stepsReport(String type, String details){
        switch (type.toLowerCase()){
            case "pass":
                report.pass("details");
                break;

            case "fail":
                report.fail("details");
                break;

                case "info":
                report.info("details");
                break;

            case "warning":
                report.warning("details");
                break;

            default:
                System.err.println("error");
                break;


        }

    }


    @AfterClass
    protected void endReport(){


        extent.flush();
    }



//        public void main(String[] args) {
//            ExtentTest report = extent.createTest("TC001");
//            report.pass("First test");
//
//
//    }
}
