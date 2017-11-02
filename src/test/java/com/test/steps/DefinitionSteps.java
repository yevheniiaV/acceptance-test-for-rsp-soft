package com.test.steps;
import com.test.steps.serenity.EndUserSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the RSP home page")
    public void givenTheUserIsOnTheRSPHomePage() {
        endUser.is_the_home_page();
    }

    @And("the user go to brief page")
    public void andTheUserGoToBriefPage() {
        endUser.go_to_brief_page();
    }

    @When("^the user must select type of '(.*?)'$")
    public void whenTheUserMustSelectTypeOfProduct(String product){
        endUser.select_type_of_product(product);
    }

    @And("the user go to the second page")
    public void andTheUserGoToTheSecondPage(){
        endUser.go_to_the_second_page_of_brief();
    }

    @And("the user should fill required fields: phone '/\\(?([0-9]{3})\\)?([ .-]?)([0-9]{3})\\2([0-9]{4})/' and email '' ")
    public void andTheUserGoToTheSecondPage(String phone_number, String email_number){
        endUser.fill_phone_input(phone_number);
    }
}
