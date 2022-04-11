package nopcommercebrowsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NopCommerceFireFoxBrowserTesting {
    public static void main(String[] args) {

        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        //1. setting up the firefox browser
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //2.Open URL
        driver.get(baseUrl);

        // we give implicit time to driver
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3. Print the title of the  page
        String title = driver.getTitle();
        System.out.println("Title is : " + title );
        System.out.println();

        //4.Print the current url
        System.out.println("Current URl is : " + driver.getCurrentUrl());
        System.out.println();
        //5. print the page source

        System.out.println("Page Source is : " + driver.getPageSource());

        //6. Enter the email to email field
        WebElement  emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("nopcomfirefox@gmail.com");
        //7.Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("nopcom2");


        //8.Close the browser
       // driver.close();
    }
}
