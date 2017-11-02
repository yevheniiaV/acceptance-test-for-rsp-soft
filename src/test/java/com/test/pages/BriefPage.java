package com.test.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://www.rsp-soft.com/brief/")
public class BriefPage extends PageObject implements BasePage {

    //FIRST PAGE
    @FindBy(xpath="//input[@id='gform_next_button_4_9']")
    private WebElement next_button;

    // SECOND PAGE
    @FindBy (xpath = "//input[@id='gform_next_button_4_9']")
    private WebElement send_button;

    @FindBy (xpath = "//input[@id='input_4_10']")
    private WebElement phone_input;

    @FindBy (xpath = "//input[@id='input_4_8']")
    private WebElement email_input;

    // Override methods of implemented interface
    @Override
    public void fillTextField(WebElement element, String text) {
        element.sendKeys(text);
    }


    public void go_to_second_step() {
        next_button.click();
    }

    public void select_type_of_product(String product_name){
        WebElement product = find(By.buttonText(product_name));
        product.click();
    }

    public void fill_phone_field(String phone_number){
        fillTextField(phone_input, phone_number);
    }

    public void fill_email_field(String email_number){
        fillTextField(email_input, email_number);
    }

    public void click_send_button(){
        send_button.click();
    }


}
