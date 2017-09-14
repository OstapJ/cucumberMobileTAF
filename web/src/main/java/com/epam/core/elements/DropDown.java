package com.epam.core.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DropDown {
    private SelenideElement root;

    public DropDown(final String root) {
        this.root = $(root);
    }

    public SelenideElement toSelenideElement() {
        return root;
    }
}
