import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.w3c.dom.html.HTMLImageElement;

import java.util.concurrent.TimeUnit;

public class Test {


    @org.testng.annotations.Test
    public void test(){
        System.setProperty ( "webdriver.chrome.driver",System.getProperty ( "user.dir" ) +"\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );

        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 10, TimeUnit.SECONDS );

        driver.get ( "https://uk.wikipedia.org/" );
        String title = "Ласкаво просимо до Вікіпедії";
        Assert.assertEquals (driver.getTitle (),title  );

        String article = "Добра стаття";
        driver.findElement ( By.xpath ( "//*[@id=\"ca-talk\"]/a/span" )).click ();

    }
}
