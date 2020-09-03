import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostMethodTestCase<statusCode> {

       String baseURI =  "https://reqres.in/api/users.";
        RequestSpecification request = RestAssured.given();

       JsonObject requestParams = new JsonObject();


        requestParams.post("name", "darth vader");
        requestParams.post("job", "villain");



        request.body(requestParams.toJSONString());
        Response response = request.post("/users");

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, "201");
        String successCode = response.jsonPath().get("SuccessCode");
        Assert.assertEquals( "Correct Success code was returned",  "OPERATION_SUCCESS");
    }


    //different data  (negative scenario
                    // make it executable

