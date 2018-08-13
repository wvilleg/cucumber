package cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
    Belly belly = new Belly();

    @Given("I have {int} cukes in my belly")
    public void i_have_cukes_in_my_belly(Integer cukes) {
        // Write code here that turns the phrase above into concrete actions
        belly.eat(cukes);
        System.out.print("I just eat" + cukes + " cukes!!");
    }

    @When("I wait {int} hour")
    public void i_wait_hour(Integer hours) {
        // Write code here that turns the phrase above into concrete actions
        belly.wait(hours);
        System.out.print("Lets wait: " + hours + " hours");
    }

    @Then("my Belly should growl")
    public void my_Belly_should_growl() {
        // Write code here that turns the phrase above into concrete actions
        if (belly.hungry() == true){
            System.out.print("My belly is growling ");
        }
    }
}
