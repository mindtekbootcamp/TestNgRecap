package utitlies;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers;

public class MatchersExample {

    public static void main(String[] args) {

        // https://restful-booker.herokuapp.com/booking/1
        Response response= RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
                .and().header("Accept", "application/json")
                .and().log().all()
                .when().get("/booking/1");
//        System.out.println(response.body().asString());
        response.then().log().all();

        // Validating body with matchers
        response.then().body("firstname", Matchers.equalToIgnoringCase("eric"))
                .and().body("totalprice",Matchers.greaterThan(100))
                .and().body("lastname",Matchers.containsString("o"))
                .and().body("firstname",Matchers.startsWith("E"))
                .and().body("firstname",Matchers.endsWithIgnoringCase("iC"))
                .and().body("firstname",Matchers.hasSize(1));

    }

}
