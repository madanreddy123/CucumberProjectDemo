package com.sogeti.automation.framework.basetest;

import com.sogeti.automation.framework.constants.AppConstants;
import com.sogeti.automation.framework.driver.GlobalDriver;
import com.sogeti.automation.test.pageFactory.PageObjectManager;
import org.openqa.selenium.WebDriver;

public class TestContext {
    private PageObjectManager pageObjectManager;
    private WebDriver driver;
    private GlobalDriver globalDriver;
    TestClass testClass;

    public TestContext() throws Exception {
        this.testClass = new TestClass();
        globalDriver = new GlobalDriver();
        driver = globalDriver.init();
//       driver.get(AppConstants.Web.UI_BASE_URL);

        pageObjectManager = new PageObjectManager(driver);
    }


    public WebDriver getDriver() {


        return driver;
    }


    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }
}
