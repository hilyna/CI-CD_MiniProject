package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Post;


public class UserSteps {

    @Steps
    Post post;


    @Given("I set POST api endpoint")
    public void setPostApiEndpoint() {
        post.setPostApiEndpoint();

    }

    @When("I send POST HTTP request valid")
    public void sendPostHTTPRequest() {
        post.sendPostHTTPRequest();
    }

    @When("I send POST HTTP request with invalid email and valid password")
    public void sendPostHTTPRequest1() {
        post.sendPostHTTPRequest1();
    }
    @When("I send POST HTTP request with valid email and invalid password")
    public void sendPostHTTPRequest2() {
        post.sendPostHTTPRequest2();
    }
    @When("I send POST HTTP request with invalid email and invalid password")
    public void sendPostHTTPRequest3() {
        post.sendPostHTTPRequest3();
    }

    @Then("I receive valid HTTP response code 200")
    public void receiveValidHTTPResponse() {
        post.receiveValidHTTPResponse();
    }

    @Then("I receive valid HTTP response code 400")
    public void receiveValidHTTPResponse2() {
        post.receiveValidHTTPResponse2();
    }

    @And("I receive data token login")
    public void ValidDataNew() {
        post.ValidDataNew();

    }

    @And("I receive message error")
    public void ValidDataNew2() {
        post.ValidDataNew2();

    }
}
