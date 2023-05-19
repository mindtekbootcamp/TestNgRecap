package utitlies;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import pojos.EmployeeResponse;

import java.util.List;

public class APiInterviewQuestion {

    public static void main(String[] args) {

        // https://dummy.restapiexample.com/api/v1/employees
        Response response= given().baseUri("https://dummy.restapiexample.com/api/v1")
                .and().header("Accept","application/json")
                .when().get("/employees");
        System.out.println(response.statusCode());
        System.out.println(response.body().asString());

        // DESERIALIZATION
        // Json -> EmployeeResponse java object
        EmployeeResponse responseBody = response.body().as(EmployeeResponse.class);

        System.out.println(responseBody.getStatus());

        List<String> names=response.body().jsonPath().getList("data.employee_name");

        names.forEach(System.out::println);

    }

}
