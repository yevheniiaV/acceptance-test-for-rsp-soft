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
    public void go_To_Brief_Page() {
       mainPage.go_to_Brief_Page();
    }

    @Step
    public void starts_search() {
        briefPage.go_to_second_step();
    }


}