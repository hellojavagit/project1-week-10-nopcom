package nopcommercebrowsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopCommerceChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl ="https://demo.nopcommerce.com/login?returnUrl=%2F";

        //setting up the chrome browser
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // 2. Launch the URL in browser
        driver.get(baseUrl);
        //maximize the window
        driver.manage().window().maximize();

        // 3.To Print  the title of the page
        String title = driver.getTitle();
        System.out.println("Title of the page is : " + title);

        //4.Prints the current URL in Console
        System.out.println("Current URL is = " + driver.getCurrentUrl());
        System.out.println();

        //5.Prints the page source
        String p = driver.getPageSource ();
        System.out.println("Page Source is: "   +p);

        //6.Enter the email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("nopcomchrome@gmail.com");
        //7.Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("nopcom1");

        //8.Close the browser
       driver.close();

    }

}