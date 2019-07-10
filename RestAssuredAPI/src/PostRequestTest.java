import files.payload;
import files.resources;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostRequestTest {

    Properties prop = new Properties();

    @BeforeTest
    public void getData() throws IOException {
        File fl = new File("src/files/env.properties");
        FileInputStream file = new FileInputStream(fl.getAbsolutePath());
        prop.load(file);
    }

    @Test
    public void PostRequesti()
    {
        RestAssured.baseURI = prop.getProperty("HOST");
            given().
                queryParam("key",prop.getProperty("KEY")).
            body(payload.getPostData()).
            when().
            post(resources.getPostAddData()).
            then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
            body("status",equalTo("OK"));
    }
}
