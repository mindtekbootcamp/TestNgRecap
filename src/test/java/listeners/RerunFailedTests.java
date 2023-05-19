package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RerunFailedTests implements IRetryAnalyzer {

    int retryCount=0;
    int maxRetryCount=3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if(retryCount<maxRetryCount){
            retryCount++;
            return true;
        }
        return false;
    }

}
