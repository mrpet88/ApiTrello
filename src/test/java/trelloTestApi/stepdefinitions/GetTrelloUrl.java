package trelloTestApi.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;
import net.thucydides.core.annotations.Steps;
import trelloTestApi.steps.TrelloApiSteps;

public class GetTrelloUrl {
    RequestSpecification httpLink;
    int statusCode;

    @Steps
    TrelloApiSteps trelloApiSteps;

    @Given("the application is running")
    public void theApplicationIsRunning() {
        httpLink = trelloApiSteps.buildUrl();
    }

    @When("the user submits get boards request")
    public void theUserSubmitsGetBoardsRequest() {
       statusCode = trelloApiSteps.getBoards(httpLink);
    }

    @Then("the boards are visible")
    public void theBoardsAreVisible() {
        trelloApiSteps.validateResponseStatus(statusCode);
    }
}
