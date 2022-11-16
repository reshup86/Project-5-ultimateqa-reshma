package ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class FireFox_Browser {
    public static void main(String[] args) {

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        //Set up edge browser
        System.setProperty("webdriver.firefox.driver", "drivers/geckodriver.exe");

        WebDriver driver = new EdgeDriver();
        //Open URL
        driver.get(baseUrl);
        driver.manage().window().maximize();

        //Implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        //Print the current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source is: " + driver.getPageSource());

        //Enter the email to email field
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("test@gmail.com");

        //Enter the password to password field
        WebElement passwordField = driver.findElement(By.id("user[password]"));
        passwordField.sendKeys("test123");

        //Close the browser
        //driver.quit();
    }
}
