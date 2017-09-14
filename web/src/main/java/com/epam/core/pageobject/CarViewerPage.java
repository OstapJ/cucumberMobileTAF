package com.epam.core.pageobject;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class CarViewerPage extends AbstractPage {

    public ElementsCollection costLabels = $$("div[class='autoba-hd-details']").get(0).findAll("[class='other-costs']>span");

}
