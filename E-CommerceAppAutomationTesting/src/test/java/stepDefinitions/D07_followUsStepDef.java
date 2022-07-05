package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class D07_followUsStepDef {
    @When("user clicks on Facebook Icon")
    public void clickFacebook()
    {
        //Hooks.driver.get("https://demo.nopcommerce.com/");
        WebElement facebookEle = Hooks.driver.findElement(Hooks.homePageClass.facebookPOM());
        facebookEle.click();
    }
    @Then("Facebook page is opened")
    public void facebookWindowHandler() throws InterruptedException {


        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));

        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");

        //Hooks.driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        Thread.sleep(50000);
        // that's because we need to only close tab 1
        Hooks.driver.close();

        Hooks.driver.switchTo().window(Tabs.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());

        // that's because we need to close the whole browser after finishing all the steps as we used to do before
        Thread.sleep(2000);
        Hooks.driver.quit();
    }
    @When("user clicks on Twitter Icon")
    public void clickTwitter()
    {
        //Hooks.driver.get("https://demo.nopcommerce.com/");
        WebElement twitterEle = Hooks.driver.findElement(Hooks.homePageClass.twitterPOM());
        twitterEle.click();

    }
    @Then("Twitter page is opened")
    public void twitterWindowHandler() throws InterruptedException {

        //Thread.sleep(2000);
        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));

        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://twitter.com/nopCommerce");

        Thread.sleep(50000);
        // that's because we need to only close tab 1
        Hooks.driver.close();

        Hooks.driver.switchTo().window(Tabs.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());

        // that's because we need to close the whole browser after finishing all the steps as we used to do before
        Thread.sleep(2000);
        Hooks.driver.quit();
    }
    @When("user clicks on rss Icon")
    public void clickRss()
    {
       // Hooks.driver.get("https://demo.nopcommerce.com/");
        WebElement rssEle = Hooks.driver.findElement(Hooks.homePageClass.rssPOM());
        rssEle.click();

    }
    @Then("rss page is opened")
    public void rssWindowHandler() throws InterruptedException {

       // Thread.sleep(2000);
        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));

        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open");

        Thread.sleep(50000);
        // that's because we need to only close tab 1
        Hooks.driver.close();

        Hooks.driver.switchTo().window(Tabs.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());

        // that's because we need to close the whole browser after finishing all the steps as we used to do before
        Thread.sleep(2000);
        Hooks.driver.quit();
    }
    @When("user clicks on Youtube Icon")
    public void clickYoutube()
    {
        //Hooks.driver.get("https://demo.nopcommerce.com/");
        WebElement youtubeEle = Hooks.driver.findElement(Hooks.homePageClass.youtubePOM());
        youtubeEle.click();

    }
    @Then("Youtube page is opened")
    public void youtubeWindowHandler() throws InterruptedException {

       // Thread.sleep(2000);
        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));

        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");
        Thread.sleep(50000);
        // that's because we need to only close tab 1
        Hooks.driver.close();

        Hooks.driver.switchTo().window(Tabs.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());

        Thread.sleep(2000);
        // that's because we need to close the whole browser after finishing all the steps as we used to do before
        Hooks.driver.quit();
    }

}
