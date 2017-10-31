package com.test.steps;

import com.test.steps.serenity.EndUserSteps;
import net.serenitybdd.jbehave.SerenityStories;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class DefinitionSteps extends SerenityStories {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the RSP home page")
    public void givenTheUserIsOnTheRSPHomePage() {
        endUser.is_the_home_page();
    }

    @When("the user go to brief page")
    public void whenTheUserGoToBriefPage() {
        endUser.go_To_Brief_Page();
    }

    @Then("they should see the definition '$definition'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        endUser.starts_search();
    }

}
