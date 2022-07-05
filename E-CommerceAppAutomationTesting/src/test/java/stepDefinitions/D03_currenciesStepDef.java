package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {
    @When("user select random currency")
    public void selectRandomCurrency()
    {
        WebElement selectCurrencyElement = Hooks.driver.findElement(Hooks.homePageClass.customerCurrencyPOM());
        Select select = new Select(selectCurrencyElement);
        select.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
    }
    @And("currency is changed in Home Page correctly")
    public void verifyCurrency()
    {
        int size = Hooks.driver.findElements(Hooks.homePageClass.selectCurrency()).size();
        for(int i = 0; i < size; i++)
        {
            Assert.assertTrue(Hooks.driver.findElements(Hooks.homePageClass.selectCurrency()).get(i).getText().contains("€"),"Changed Successfully");
        }
    }
}
