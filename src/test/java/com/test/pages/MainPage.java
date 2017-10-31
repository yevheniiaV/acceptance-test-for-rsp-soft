package com.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import static org.junit.Assert.assertEquals;

@DefaultUrl("http://www.rsp-soft.com/")
public class MainPage extends PageObject {

    @FindBy(linkText="Brief")
    private WebElementFacade brief;

    @FindBy(name="go")
    private WebElementFacade lookupButton;


    public void go_to_Brief_Page() {
        BriefPage briefPage = this.switchToPage(BriefPage.class);
        assertEquals("http://www.rsp-soft.com/brief/", getDriver().getCurrentUrl());
    }

}