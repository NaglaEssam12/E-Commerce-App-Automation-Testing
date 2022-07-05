package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {

    @Given("user go to login page")
    public void loginPage()
    {
        WebElement loginTapElement = Hooks.loginClass.loginTapPOM();
        loginTapElement.click();
    }
    @When("^user enter \"(.*)\" and \"(.*)\" in login page$")
    public void enterEmail_Password(String email, String password)
    {
        WebElement emailElement = Hooks.loginClass.emailPOM();
        emailElement.sendKeys(email);

        WebElement passwordElement = Hooks.loginClass.passwordPOM();
        passwordElement.sendKeys(password);
    }
    @And("user click on login button")
    public void clickLoginBtn() throws InterruptedException {
        WebElement loginBtn = Hooks.driver.findElement(Hooks.loginClass.loginBtnPOM());
        Thread.sleep(20000);
        loginBtn.click();
    }
    @Then("user could login successfully")
    public void login()
    {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("https://demo.nopcommerce.com/",Hooks.driver.getCurrentUrl(),"Success Login");
        softAssert.assertTrue(Hooks.driver.findElement(Hooks.loginClass.loginPOM()).isDisplayed());
        softAssert.assertAll();
    }


}
