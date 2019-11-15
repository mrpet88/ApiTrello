package trelloTestApi.steps;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;

import static trelloTestApi.TrelloEndPoints.BOARD;

public class TrelloApiSteps {
    private RequestSpecBuilder builder = new RequestSpecBuilder();
    private RequestSpecification requestSpec;
    private JsonPath jp;


    public int getBoards(RequestSpecification httpLink) {
        requestSpec = SerenityRest.given().spec(httpLink);
        Response res = requestSpec.when().get();

        return res.getStatusCode();
//        jp = res.jsonPath();
    }

    public RequestSpecification buildUrl() {
        builder.setBaseUri(BOARD.getUrl() + "?");
        builder.addParam("key", "4a3c7536015c9c2819b28fe0f2aa40e3");
        builder.addParam("token", "10e309a0f94f6178225b41c3dfd0134929f8c5f3a179107db32749c201174db8");
        return builder.build();
    }
    public void validateResponseStatus(int statusCode) {
        Assert.assertEquals(200, statusCode);
    }
}
