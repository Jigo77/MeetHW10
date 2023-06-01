package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {


   String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void test1() throws InterruptedException {
        //Classname
        WebElement loginLink = driver.findElement(By.className("ico-login"));
        loginLink.click();

        WebElement welcomeMessage=driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));

        String actualMessage = welcomeMessage.getText();
        String expectedMessage = "Welcome, Please Sign In!";
        Assert.assertEquals("Verifying WelcomeMessage", expectedMessage,actualMessage);

        WebElement emailfeild = driver.findElement(By.id("Email"));
        emailfeild.sendKeys("mp2022@gmail.com");

        WebElement passwordfeild = driver.findElement(By.name("Password"));
        passwordfeild.sendKeys("mp2022");

        WebElement loginbutton = driver.findElement(By.xpath("//div/button[@class='button-1 login-button']"));
        loginbutton.click();

    }

    @After
    public void tearDown() {

        closeBrowser();
    }

}
