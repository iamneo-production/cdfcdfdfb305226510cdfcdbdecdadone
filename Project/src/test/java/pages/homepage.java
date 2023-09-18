package pages;


import utils.LoggerHandler;
import com.aventstack.extentreports.ExtentReports;

import java.util.Map;
import utils.base64;
import utils.Screenshot;
import uistore.locators;
import utils.excelReadFile;
import utils.Reporter;
public class homepage  {

    private Map<String, String> testData; 

    java.util.logging.Logger log = LoggerHandler.getLogger();
    base64 screenshotHandler = new base64();
    ExtentReports reporter = Reporter.generateExtentReport();
    Screenshot screenshot = new Screenshot();
    excelReadFile file = new excelReadFile();

// Your testcase here

    
}

