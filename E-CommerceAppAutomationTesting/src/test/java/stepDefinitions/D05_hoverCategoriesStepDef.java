package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D05_hoverCategoriesStepDef {
    String subCategoryName;
    @When("user hover category and select subcategory")
    public void user_hover_category() throws InterruptedException {

        Actions action = new Actions(Hooks.driver);
        // hover on "Computers"
        WebElement computers = Hooks.driver.findElement(Hooks.homePageClass.hoverOnComputersPOM());
        action.moveToElement(computers).perform();
        Thread.sleep(1000);

        // getText() of subCategory before click on it
        WebElement desktops = Hooks.driver.findElement(Hooks.homePageClass.selectSubcategoryPOM());
        subCategoryName = desktops.getText().toLowerCase().trim();		// this will change "Desktops " to "desktops"
        System.out.println(subCategoryName);

        // click on "Desktops"
        desktops.click();
        String page = Hooks.driver.findElement(Hooks.homePageClass.pageTitlePOM()).getText().toLowerCase();
        Assert.assertTrue(subCategoryName.equals(page));

    }

}
