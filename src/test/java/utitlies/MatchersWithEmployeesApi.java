package utitlies;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers;

public class MatchersWithEmployeesApi {


    public static void main(String[] args) {

        Response response= RestAssured.given().baseUri("https://dummy.restapiexample.com/api/v1")
                .and().header("Accept","application/json")
                .when().get("/employees");
        response.then().log().all();

        response.then().body("data.employee_name", Matchers.hasSize(20));
//                .and().body("data.employee_name",Matchers.)

    }

}
