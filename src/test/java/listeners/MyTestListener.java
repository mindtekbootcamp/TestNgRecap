package listeners;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utitlies.Driver;
import utitlies.TestBase;

import java.io.File;
import java.io.IOException;

public class MyTestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        TakesScreenshot ts=((TakesScreenshot) Driver.driver());
        File source=ts.getScreenshotAs(OutputType.FILE);
        File destination=new File("src/test/resources/screenshots/abc.png");
        try {
            FileUtils.copyFile(source,destination);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
