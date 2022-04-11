package nopcommercebrowsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class NopCommerceEdgeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";

        //1.Set up the  Edgebrowser
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        //2. launch the URL
        driver.get(baseUrl);
        //maximizes the window
        driver.manage().window().maximize();


        //3.Print the title of the page
        System.out.println("Title of the page is :" + driver.getTitle());
        System.out.println();
         //4. Print the Current URL
        System.out.println("Current URL is : " + driver.getCurrentUrl());
        System.out.println();
        //5.Print the Page Source
        String ps = driver.getPageSource();
        System.out.println("Page Source Is : " + ps);
        //6. Enter the email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("nopcomedge@gmail.com");
        //7. Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("nopcom3");
        //8.Close the browser
        //driver.close();
    }
}
