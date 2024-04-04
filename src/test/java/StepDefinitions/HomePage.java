package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePage {

    public static WebDriver driver;

    @Given("User navigate to url page")
    public void user_navigate_to_url_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\Driverapp\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.demoblaze.com/");
        System.out.println("Navigate to browser");

    }
    @Then("User should see the web")
    public void user_should_see_the_web() {
        System.out.println("Web should be opened to demoblaze website");
    }
}
