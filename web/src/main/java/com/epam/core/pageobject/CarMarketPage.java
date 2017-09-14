package com.epam.core.pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CarMarketPage extends AbstractPage {




    public ElementsCollection carLinks = $$("table[class='autoba-table adverts-table'] td h2 a");

    public AutoSectionWidget autoSectionWidget = $(By.cssSelector("div[class='b-autosections']"));

    public CarMarketPage()
    {
    }


    public void clickCarLinkByText(final String text){
        carLinks.filterBy(Condition.text(text)).first().click();
    }
}
