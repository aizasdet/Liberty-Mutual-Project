import org.junit.Test;

import static org.mockito.BDDMockito.given;

public class GetMethodTest {


    @Test
    public void test_NumberOfTotalPagesShouldBe2() {

        given().
                when().
                get("https://reqres.in/api/users.json").
                then().
                assertThat().
                body("total_pages",
                        (2));
    }



    @Test
    public void test_LastName_ShouldBeMorris() {

        String originalText = "test";
        String expectedLastName = "Morris";

        given().
                param("text",originalText).
                when().
                get("https://reqres.in/api/users.json").
                then().
                assertThat().
                body("last_name",equals(expectedLastName));
    }
    //structured , runner class, make them call
}
