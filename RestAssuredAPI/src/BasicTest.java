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
import static io.restassured.RestAssured.proxy;
import static org.hamcrest.Matchers.equalTo;

public class BasicTest {

    Properties prop = new Properties();

    @BeforeTest
    public void getData() throws IOException {
        File fl = new File("src/files/env.properties");
        FileInputStream file = new FileInputStream(fl.getAbsolutePath());
        prop.load(file);
    }

    @Test
    public void GetRequest() {
        //BaseUrl or host
        RestAssured.baseURI = prop.getProperty("HOST2");

        given().
            param("location",prop.getProperty("LOCATION")).
            param("radius", prop.getProperty("RADIUS")).
            param("key", prop.getProperty("KEY2")).
            when().
            get(resources.getGetData()).
            then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
            body("results[0].name", equalTo("Sydney"));
    }
}
