package stepDefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.P01_register;

public class D01_registerStepDef {

    @Given("user go to register page")
    public void goRegisterPage()
    {
        System.out.println("This is a test before start coding");
        WebElement registerBtn = Hooks.driver.findElement(Hooks.registerClass.registerPagePOM());
        registerBtn.click();
    }
    @When("user select gender type")
    public void gender()
    {
        WebElement genderType = Hooks.driver.findElement(Hooks.registerClass.genderPOM());
        genderType.click();
    }
    @And("^user enter \"(.*)\" and \"(.*)\" name$")
    public void first_last_name(String first, String last)
    {
        WebElement firstName = Hooks.driver.findElement(Hooks.registerClass.firstNamePOM());
        firstName.sendKeys(first);
        WebElement lastName = Hooks.driver.findElement(Hooks.registerClass.lastNamePOM());
        lastName.sendKeys(last);
    }
    @And("user enter date of birth")
    public void date_of_birth()
    {
        WebElement birthDay = Hooks.driver.findElement(Hooks.registerClass.BirthDayPOM());
        Select select = new Select(birthDay);
        select.selectByIndex(12);     // select by index: this is day 12

        WebElement birthMonth = Hooks.driver.findElement(Hooks.registerClass.BirthMonthPOM());
        select = new Select(birthMonth);
        select.selectByValue("4");     // select by value and it should be String: this is April

        WebElement birthYear = Hooks.driver.findElement(Hooks.registerClass.BirthYearPOM());
        select = new Select(birthYear);
        select.selectByVisibleText("1999");   // select by linkText and it should be String

    }
    @And("^user enter \"(.*)\"$")
    public void enter_Email(String mail)
    {
        WebElement email = Hooks.registerClass.emailPOM();
        email.clear();
        email.sendKeys(mail);
    }
    @And("^user enter \"(.*)\" and \"(.*)\" password$")
    public void password_confirm_password(String pass, String confirmPass)
    {
        WebElement password = Hooks.registerClass.passwordPOM();
        password.sendKeys(pass);

        WebElement confirmPassword = Hooks.registerClass.confirmPasswordPOM();
        confirmPassword.sendKeys(confirmPass);
    }
    @And("user click on register button")
    public void register()
    {
        WebElement registerBtn = Hooks.registerClass.registerBtnPOM();
        registerBtn.click();
    }
    @Then("user registered successfully")
    public void registeredSuccessfully() throws InterruptedException {
        Thread.sleep(3000);

        String expectedResult = "Your registration completed";
        String actualResult = Hooks.registerClass.resultPOM().getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult,expectedResult,"success");
       /* WebElement backgroundExpected = Hooks.registerClass.resultPOM();
        String expectedColor = backgroundExpected.getCssValue("color");
        softAssert.assertTrue("#4cb17c".equals(Color.fromString(expectedColor).asHex()),"Background is Fine ");*/
        softAssert.assertAll();

    }
}
