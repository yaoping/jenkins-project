import io.qameta.allure.Description;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class RequestTest {
    @Test
    @Description("Description: the redemption successfully")
    public void shouldRedemptionSuccessfullyWithCorrectInput() {
        given()
                .get("http://39.106.119.132:8080/kaptcha")
                .then()
                .log().status()
                .statusCode(200);
    }
}
