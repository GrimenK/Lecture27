import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import webdriver.BusinessObjectManager;
import webdriver.Driver;
import webdriver.PageObjectManager;


public class BaseTest {
    protected String url;
    protected BusinessObjectManager businessObjectManager;
    public static Logger LOG = LogManager.getLogger(BaseTest.class);

    @BeforeClass
    public void SetUp(){
        LOG.info("setup");
        businessObjectManager = BusinessObjectManager.getInstance();
        url = Params.URL;
//        Driver.createDriver();
        get(url);
    }

    @AfterClass
    public void TearDown(){
//        Driver.getWebDriver().close();
//        Driver.getWebDriver().quit();
    }

    public void get(String url){
        LOG.info("Go to url: " + url);
//        Driver.getWebDriver().get(url);
    }

}
