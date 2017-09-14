package com.epam.core.step;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.epam.core.pageobject.CarMarketPage;
import com.epam.core.pageobject.CarViewerPage;
import com.epam.core.pageobject.MainPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Selenide.page;

/**
 * Created by Ievgen_Ostapenko on 3/17/2017.
 */
public class VideoStep extends AbstractStepDefinition {

    MainPage mainPage;
    CarMarketPage carMarketPage = new CarMarketPage();
    CarViewerPage carViewerPage = new CarViewerPage();

    private static final Logger LOGGER = LoggerFactory.getLogger(VideoStep.class);

    @Before(order = 1)
    public void init() {
        System.setProperty("webdriver.chrome.driver", "D:\\projects\\GitHubCloned\\Mobile\\src\\driver\\chromedriverV2_29.exe");
        Configuration.browser = "chrome";

    }

    @Given("^I navigate to Main page$")
    public void navigateToHome() {
        Selenide.open("https://www.onliner.by/");
    }

    @When("^I search Video with the following values:$")
    public void searchCar() {
        mainPage = page(MainPage.class);
        mainPage.selectMark("BMW");
        mainPage.selectModelDropDown("   120");
        mainPage.clickSearchButton();
//        LOGGER.info("RP_MESSAGE#FILE#{}#{}", Screenshots.takeScreenShotAsFile().getAbsolutePath(),
//                "Proof the screenshot could be saved in RP");
    }

    @Then("^I should see the video with the following values:$")
    public void selectCar() {
        carMarketPage.clickCarLinkByText("BMW 120");
    }


    @Then("^I should see the car price with the following values:$")
    public void verifyCarPrice() {
        carViewerPage.costLabels.shouldHave(CollectionCondition.texts("8250 $", "7670 €"));
    }
}
