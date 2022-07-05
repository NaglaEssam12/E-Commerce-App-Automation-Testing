package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P01_register {
    public By registerPagePOM()
    {
        return By.cssSelector("a[href=\"/register?returnUrl=%2F\"]");
    }
    public By genderPOM()
    {
        return By.id("gender-female");
    }
    public By firstNamePOM()
    {
        return By.id("FirstName");
    }
    public By lastNamePOM()
    {
        return By.id("LastName");
    }
    public By BirthDayPOM()
    {
        return By.name("DateOfBirthDay");
    }
    public By BirthMonthPOM()
    {
        return By.name("DateOfBirthMonth");
    }
    public By BirthYearPOM()
    {
        return By.name("DateOfBirthYear");
    }
    public WebElement emailPOM()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement passwordPOM()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement confirmPasswordPOM()
    {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement registerBtnPOM()
    {
        return Hooks.driver.findElement(By.id("register-button"));
    }
    public WebElement resultPOM()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }

}
