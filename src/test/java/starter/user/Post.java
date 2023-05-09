package starter.user;


import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Post {

    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpoints")
    public String setPostApiEndpoint() {
        return url + "auth/login";

    }

    @Step("I send POST HTTP request valid")
    public void sendPostHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "hilazii@mail.com");
        requestBody.put("password", "12345678");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }

    @Step("I send POST HTTP request with invalid email and valid password")
    public void sendPostHTTPRequest1() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "asd@mail.com");
        requestBody.put("password", "12345678");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }

    @Step("I send POST HTTP request with valid email and invalid password")
    public void sendPostHTTPRequest2() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "hilazi@mail.com");
        requestBody.put("password", "87654321");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }

    @Step("I send POST HTTP request with invalid email and invalid password")
    public void sendPostHTTPRequest3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "asd@mail.com");
        requestBody.put("password", "87654321");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }


    @Step("I receive valid HTTP response code 200")
    public void receiveValidHTTPResponse() {restAssuredThat(response -> response.statusCode(200));}

    @Step("I receive valid account for new user")
    public void ValidDataNew() {

    }

    @Step("I receive valid HTTP response code 400")
    public void receiveValidHTTPResponse2() {

        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I receive invalid account for new user")
    public void ValidDataNew2() {

    }



}
