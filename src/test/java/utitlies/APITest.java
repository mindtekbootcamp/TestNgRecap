package utitlies;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class APITest {

    public static void main(String[] args) throws FileNotFoundException {

        // GET CALL
        Response response =RestAssured.given().baseUri("http://3.135.206.245/en-us/api/v2")
                .and().header("Accept","application/json")
                .and().header("Authorization","Token 3507173df53d2e6d26b596e3de412fdc45c331e7")
                .when().get("/companies/4/");

        System.out.println(response.body().asString());
        System.out.println(response.statusCode());

        // POST CALL
        FileInputStream input=new FileInputStream("/Users/mindtek/IdeaProjects/TestNgRecap/src/test/resources/data/api_data/CreateCompany.json");

        Response postResponse =RestAssured.given().baseUri("http://3.135.206.245/en-us/api/v2")
                .and().header("Accept","application/json")
                .and().header("Content-type","application/json")
                .and().header("Authorization","Token 3507173df53d2e6d26b596e3de412fdc45c331e7")
                .and().body(input) // String, Java Object (POJO), Map, List of Maps, FileInputStream
                .when().post("/companies/");

        System.out.println(postResponse.body().asString());
        System.out.println(postResponse.statusCode());
        String companyId=postResponse.body().jsonPath().getString("id");

        // PUT/PATCH CALL
        FileInputStream putInput=new FileInputStream("/Users/mindtek/IdeaProjects/TestNgRecap/src/test/resources/data/api_data/UpdateCompany.json");

        Response patchResponse =RestAssured.given().baseUri("http://3.135.206.245/en-us/api/v2")
                .and().header("Accept","application/json")
                .and().header("Content-type","application/json")
                .and().header("Authorization","Token 3507173df53d2e6d26b596e3de412fdc45c331e7")
                .and().body(putInput) // String, Java Object (POJO), Map, List of Maps, FileInputStream
                .when().patch("/companies/"+companyId+"/");

        System.out.println(patchResponse.body().asString());
        System.out.println(patchResponse.statusCode());

        // DELETE CALL
        Response deleteResponse =RestAssured.given().baseUri("http://3.135.206.245/en-us/api/v2")
                .and().header("Authorization","Token 3507173df53d2e6d26b596e3de412fdc45c331e7")
                .when().delete("/companies/"+companyId+"/");

        System.out.println(deleteResponse.body().asString());
        System.out.println(deleteResponse.statusCode());

    }

}
