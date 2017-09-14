package com.epam.core.pageobject;

import com.codeborne.selenide.SelenideElement;
import com.epam.core.elements.DropDown;
import com.epam.core.elements.SelenideAdapter;

import static com.codeborne.selenide.Selenide.$;

public class MainPage extends AbstractPage {

    public SelenideElement markDropDown = $("#car-1>select");
    public DropDown markSelenideAdapter = new DropDown("#car-1>select");

    public SelenideElement modelDropDown = $("#car-2>select");
    public SelenideElement searchButton = $("[class='btn-green-2 btn']");


    public MainPage() {
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void selectMark(final String mark){
        markSelenideAdapter.selectOption(mark);
    }

    public void selectModelDropDown(final String model){
        modelDropDown.selectOption(model);
    }

    @Override public String toString()
    {
        return "MainPage{}";
    }
}
