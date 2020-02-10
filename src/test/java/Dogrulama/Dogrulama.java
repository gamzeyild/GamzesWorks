package Dogrulama;

import java.io.File;
import java.util.List;
import java.util.Random;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.junit.After;
import org.junit.Before;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang.StringUtils;

public abstract class Dogrulama {

    protected WebDriver driver;
    @Before
    public void setUp() throws Exception{
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        driver =new ChromeDriver(capabilities);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(40,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    }
    @Test
    public static void main(String[]   args) {

        UrunIslem islem = new UrunIslem();
        islem.UrunAramaKontrolu();

    }


@After
public void tearDown() throws Exception{

        driver.quit();
}


}




