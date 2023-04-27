package StepDefinitions;
import StepDefinitions.OrangeHRMsteps.*;

public class OrangeHRMsteps {

    WebDriver driver;
    @Given("I launch chrome browser")
   public void i_launch_chrome_Browser() {
        System.setProperty("webdriver.chrome.driver","");
        driver=new ChromeDriver();

    }
    @when("I open Orange home page")
    public void i_open_Orange_home_Page()
    {
    }
    @Then("I verify the logo present on page")
    public void i_Verify_the_logo_present_on_page()
    {
    }

    @Then("close browser")
    public void closeBrowser()
    {
    }

}
