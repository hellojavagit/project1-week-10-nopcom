package nopcommercebrowsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;
//program  to launch nopcommerce website in one of the chosen browsers
public class NopCommerceMultiBrowserTesting {

    static WebDriver driver;
    static String browser;
    static String baseUrl;

    public static void main(String[] args) {

        System.out.println("Enter your Browser");
        Scanner sc = new Scanner(System.in);
        browser = sc.nextLine();
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {

            System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            System.out.println("Please choose one of the following browsers: Chrome,Edge,Firefox ");
        }
        baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("multibrowsernopcom@gmail.com");

        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("nopcom3");

        //closing the driver
        driver.close();

    }


}
