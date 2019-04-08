package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenPracticeStepdefs {

    WebDriver myDriver;

    @Given("^I am a google chrome user$")
    public void I_am_a_google_chrome_user(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\IdeaProjects\\MavenPractice\\src\\chromedriver.exe");
        myDriver = new ChromeDriver();
    }
    @When("^Access Santander webpage$")
    public void Access_santander_webpage(){
    myDriver.get("https://www.santander.co.uk/personal/support/ways-to-bank/online-banking");
    }
    @Then("^Santander webpage is visible$")
    public void Santander_webpage_is_visible(){

        System.out.println(myDriver.getTitle());
        //myDriver.quit();
    }

    @When("^Access MK Council Webpage$")
    public void Access_MK_Council_Webpage(){
        myDriver.get("https://www.milton-keynes.gov.uk/");
    }
    @Then("^Council Webpage is open$")
    public void Council_webpage_is_open(){
        myDriver.quit();
    }
}
