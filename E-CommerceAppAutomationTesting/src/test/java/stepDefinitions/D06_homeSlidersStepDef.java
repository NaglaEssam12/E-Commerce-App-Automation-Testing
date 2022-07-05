package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class D06_homeSlidersStepDef {
    @When("user click on first slider")
    public void clickTheFirstSlider()
    {
        WebElement sliderElement = Hooks.homePageClass.sliders("1");
        sliderElement.click();
    }

    @Then("relative product for first slider is displayed")
    public void first_product_details_opened()
    {
        // To create explicit wait condition, you need to create new object from WebDriverWait class then call your expected conditions as shown below
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        boolean check =  wait.until(ExpectedConditions.urlContains("https://demo.nopcommerce.com/nokia-lumia-1020"));
        Assert.assertTrue(check);
    }
    @When("user click on second slider")
    public void clickTheSecondSlider()
    {
        WebElement sliderElement = Hooks.homePageClass.sliders("2");
        sliderElement.click();
    }
    @Then("relative product for second slider is displayed")
    public void second_product_details_opened()
    {
        // To create explicit wait condition, you need to create new object from WebDriverWait class then call your expected conditions as shown below
        WebDriverWait wait = new WebDriverWait(Hooks.driver,Duration.ofSeconds(10));
        boolean check =  wait.until(ExpectedConditions.urlContains("https://demo.nopcommerce.com/iphone-6"));
        Assert.assertTrue(check);
    }
}
