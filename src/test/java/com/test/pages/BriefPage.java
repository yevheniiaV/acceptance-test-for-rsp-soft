package com.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

/**
 * Created by User on 009 09.10.17.
 */

@DefaultUrl("http://www.rsp-soft.com/brief/")
public class BriefPage extends PageObject {

    @FindBy(linkText="Next")
    private WebElement btnNext;


    public void go_to_second_step() {
        btnNext.click();
    }

}
