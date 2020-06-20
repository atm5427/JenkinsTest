package com.atm.test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
/*

    private ExtentHtmlReporter reporter = new ExtentHtmlReporter("Testreport/test.html");
    private ExtentReports extent = new ExtentReports();
    ExtentTest logger;
    @BeforeMethod
    public void befoe()
    {
        logger=extent.createTest(this.toString());
    }
*/

    @Test
    public void listTestMethod() {

        List<String> ls = new ArrayList<String>();


        Assert.assertTrue(true);
    }
    /*@AfterMethod
    public void captStatus(ITestResult testResult)
    {

        if(testResult.getStatus()==ITestResult.SUCCESS)
        {
            logger.log(Status.PASS,"Test Passed");
        }else if(testResult.getStatus()==ITestResult.FAILURE)
        {
            logger.log(Status.FAIL,testResult.getThrowable().getMessage());
        }else
        {
            logger.log(Status.SKIP,testResult.getThrowable().getMessage());
        }
        extent.flush();
    }*/
}
