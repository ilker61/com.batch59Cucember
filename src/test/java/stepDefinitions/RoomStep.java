package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.messages.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;

public class RoomStep {

    Response response;

    String token="eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZWFtNjUiLCJhdXRoIjoiUk9MRV9BRE1JTiIsImV4cCI6MTY1OTg4ODM5OH0.cXHxOOfmRKAIZkssC22peFnhgSKhBDkKRAqPh57X0IBS9uiudDnVdZ5M-Obfocd9UqYG9H2T-AFbD63hHbmdmg";

    RoomStep [] rooms;


    @Given("Kullanici roomlar icin get request yapar")
    public void kullanici_roomlar_icin_get_request_yapar() {



        response= given().header("Authorization",
                "Bearer " + token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get(ConfigReader.getProperty("room_endpoint"));


        response.then().assertThat().statusCode(200);
        response.prettyPrint();

    }
    @Given("Kullanici gelen room datayi deserialise eder")
    public void kullanici_gelen_room_datayi_deserialise_eder() throws JsonProcessingException {

        ObjectMapper obj=new ObjectMapper();
        rooms=obj.readValue(response.asString(), RoomStep[].class);
        System.out.println(rooms.length);

    }
    @Then("Kullanici room datasini validate eder")
    public void kullanici_room_datasini_validate_eder() {

    }

}
