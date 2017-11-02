package com.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import static org.junit.Assert.assertEquals;

@DefaultUrl("http://www.rsp-soft.com/")
public class MainPage extends PageObject {

    @FindBy(linkText="Brief")
    private WebElementFacade brief_button;

    @FindBy(name="go")
    private WebElementFacade lookup_button;

    // TYPE OF PRODUCT

    public void go_to_brief_page() {
        BriefPage briefPage = this.switchToPage(BriefPage.class);
        briefPage.open();
        assertEquals("http://www.rsp-soft.com/brief/", getDriver().getCurrentUrl());
    }

}