public class PostMethodTest {

        RestAssured.baseURI ="https://reqres.in/api/users";
        RequestSpecification request = RestAssured.given();

        JSONObject requestParams = new JSONObject();
        requestParams.post("name", "darth vader");
        requestParams.post("job", "villain");



        request.body(requestParams.toJSONString());
        Response response = request.post("/users");

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, "201");
        String successCode = response.jsonPath().get("SuccessCode");
        Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");
        }

}
