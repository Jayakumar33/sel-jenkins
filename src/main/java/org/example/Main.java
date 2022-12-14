package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Main {

    public static void main(String[] args) {
        ExtentSparkReporter spark = new ExtentSparkReporter("./extends.html");
        ExtentReports extent = new ExtentReports();

        extent.attachReporter(spark);

        ExtentTest report = extent.createTest("TC001");
        report.pass("First test");
        extent.flush();



    }
}