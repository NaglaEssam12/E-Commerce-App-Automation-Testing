package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    String productSku;
    @Given("^user search for any product like \"(.*)\" and click Button$")
    public void clickSearchField(String productName)
    {
        WebElement searchElement = Hooks.driver.findElement(Hooks.homePageClass.searchPOM());
        searchElement.sendKeys(productName);
        searchElement.sendKeys(Keys.ENTER);
    }
    @And("results are shown to the user")
    public void verifySearchResult()
    {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
        int size = Hooks.driver.findElements(Hooks.homePageClass.selectSearchItemsPOM()).size();
        softAssert.assertTrue(size > 0);
        softAssert.assertAll();
       // System.out.println(size);
    }
    @Given("^user search with \"(.*)\"$")
    public void searchWithSku(String sku) throws InterruptedException {
        WebElement searchElement = Hooks.driver.findElement(Hooks.homePageClass.searchPOM());
        searchElement.sendKeys(sku);
        searchElement.sendKeys(Keys.ENTER);
        productSku = sku;
    }
    @Then("sku is displayed on the page")
    public void displaySku() throws InterruptedException {
        //I want to ask here, Why size is 2 but in Inspect is 4
       int size =  Hooks.driver.findElements(Hooks.homePageClass.selectSkuPOM()).size();
        System.out.println("Size " + size);
        Thread.sleep(20000);
        Hooks.driver.findElements(Hooks.homePageClass.selectSkuPOM()).get(0).click();

        String Sku = Hooks.driver.findElement(Hooks.homePageClass.skuPOM()).getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(Sku.equals(productSku));
        softAssert.assertAll();



    }

}
