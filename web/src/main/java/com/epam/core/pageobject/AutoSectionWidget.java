package com.epam.core.pageobject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AutoSectionWidget extends ElementsContainer {

    public AutoSectionWidget() {
    }

    private SelenideElement autoSectionWidget = $("ul[class='b-autosections-list']");
    public ElementsCollection chapterLinks = autoSectionWidget.findAll("li a");

}
