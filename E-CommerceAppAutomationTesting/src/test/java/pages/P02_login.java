package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P02_login {

    public WebElement loginTapPOM()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href = \"/login?returnUrl=%2F\"]"));
    }
    public WebElement emailPOM()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"inputs\"]>input[id=\"Email\"]"));
    }
    public WebElement passwordPOM()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"inputs\"]>input[id=\"Password\"]"));
    }
    public By loginBtnPOM()
    {
        return By.cssSelector("div[class=\"buttons\"]> button[type=\"submit\"]");
    }

    public By loginPOM()
    {
        return By.cssSelector("a[href = \"/customer/info\"]");
    }
}
