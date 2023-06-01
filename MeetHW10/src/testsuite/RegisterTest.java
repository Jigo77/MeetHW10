package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void test1() throws InterruptedException {
        //Classname
        WebElement regLink = driver.findElement(By.className("ico-register"));
        regLink.click();

        WebElement regMessage=driver.findElement(By.xpath("//div/h1"));

        String actualMessage = regMessage.getText();
        String expectedMessage = "Register";
        Assert.assertEquals("Verifying RegisterMessage", expectedMessage,actualMessage);

        WebElement fname = driver.findElement(By.id("FirstName"));
        fname.sendKeys("meet");

        WebElement lname = driver.findElement(By.id("LastName"));
        lname.sendKeys("patidar");

        WebElement days = driver.findElement(By.name("DateOfBirthDay"));
        Select day = new Select(days);
        day.selectByVisibleText("15");

        WebElement months = driver.findElement(By.name("DateOfBirthMonth"));
        Select month = new Select(months);
        month.selectByVisibleText("January");

        WebElement years = driver.findElement(By.name("DateOfBirthYear"));
        Select year = new Select(years);
        year.selectByVisibleText("1998");

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("meet@gamil.com");

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("mp2023");

        WebElement password1 = driver.findElement(By.id("ConfirmPassword"));
        password1.sendKeys("mp2023");

        WebElement regbutton = driver.findElement(By.id("register-button"));
        regbutton.click();


    }

    @After
    public void tearDown() {

     //   closeBrowser();
    }

}
