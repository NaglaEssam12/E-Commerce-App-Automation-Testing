package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P03_homePage {

    public By customerCurrencyPOM()
    {
        return By.id("customerCurrency");
    }
    public By selectCurrency()
    {
        return By.cssSelector("span[class=\"price actual-price\"]");
    }
    public By searchPOM()
    {
        return By.id("small-searchterms");
    }
    public By selectSearchItemsPOM()
    {
        return By.cssSelector("div[class=\"item-box\"]");
    }
    public By selectSkuPOM()
    {
        return By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]");
    }
    public  By skuPOM()
    {
        return By.id("sku-4");
    }
    public By hoverOnComputersPOM()
    {
        return By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]");
    }
    public By selectSubcategoryPOM()
    {
        return By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/desktops\"]");
    }
    public By pageTitlePOM()
    {
        return By.cssSelector("div[class=\"page-title\"]");
    }
    public WebElement sliders(String num)
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"nivo-imageLink\"]:nth-child("+num+")"));
    }
    public By facebookPOM()
    {
        return By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]");
    }
    public By twitterPOM()
    {
        return By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]");
    }
    public By rssPOM()
    {
        return By.cssSelector("a[href=\"/news/rss/1\"]");
    }
    public By youtubePOM()
    {
        return By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]");
    }
}
