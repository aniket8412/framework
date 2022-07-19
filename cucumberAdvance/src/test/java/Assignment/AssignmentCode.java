package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentCode {

    WebDriver driver = null;

    @Before
    public void setup() {
        System.out.println("Inside: Setup");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().window().maximize();

    }

    @Given("User is on google page")
    public void user_is_on_google_page() {
        System.out.println("Inside: User is on google page ");

        driver.navigate().to("https://www.google.co.in");
        driver.close();

    }

    @When("User enters ([^\"]*)$")
    public void user_enters_values(String searchonj) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside: user enters" + searchonj);
        if (searchonj.equals("capgemini")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
            driver.manage().window().maximize();
            driver.navigate().to("https://www.google.co.in");
            driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(searchonj);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
            driver.close();

        } else {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
            driver.manage().window().maximize();
            driver.navigate().to("https://www.google.co.in");
            driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(searchonj);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
            driver.close();
        }

    }
}