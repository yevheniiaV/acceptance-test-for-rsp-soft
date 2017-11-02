package com.test.steps.serenity;

import com.test.pages.BriefPage;
import com.test.pages.MainPage;
import net.thucydides.core.annotations.Step;

public class EndUserSteps {

    MainPage mainPage;
    BriefPage briefPage;

    @Step
    public void is_the_home_page() {
        mainPage.open();
    }

    @Step
    public void go_to_brief_page() {
       mainPage.go_to_brief_page();
    }

    @Step
    public void select_type_of_product(String product_name){
        briefPage.select_type_of_product(product_name);
    };

    @Step
    public void go_to_the_second_page_of_brief(){
        briefPage.go_to_second_step();
    }
    @Step
    public void click_send_button(){
        briefPage.click_send_button();
    }

    @Step
    public void fill_phone_input(String phone_number){
        fill_phone_input(phone_number);
    }
}
