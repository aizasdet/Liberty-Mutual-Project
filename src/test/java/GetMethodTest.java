@Test @GetMapping
public void test_NumberOfTotalPagesShouldBe2() {

        given().
        when().
        get("https://reqres.in/api/users.json").
        then().
        assertThat().
        body("total_pages",hasSize(2));
        }



@Test @GetMapping
public void test_LastName_ShouldBeMorris() {

        String originalText = "test";
        String expectedLastName = "Morris";

        given().
        param("text",originalText).
        when().
        get("https://reqres.in/api/users.json").
        then().
        assertThat().
        body("last_name",equalTo(expectedLastName));
        }
