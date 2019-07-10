import files.payload;
import files.resources;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class E2ETesting {

    Properties prop = new Properties();

    @BeforeTest
    public void getData() throws IOException {
        File fl = new File("src/files/env.properties");
        FileInputStream file = new FileInputStream(fl.getAbsolutePath());
        prop.load(file);
    }

    @Test
    public void addDeletePlace() {
        //Task-1: add place_id//
        RestAssured.baseURI = prop.getProperty("HOST");
        Response res = given().
        queryParam("key",prop.getProperty("KEY")).
        body(payload.getPostData()).
        when().
        post(resources.getPostAddData()).
        then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
        body("status",equalTo("OK")).
        extract().response();

        String responseString = res.asString(); //convert raw data to String
        System.out.println("The response is :" + responseString);

        //Task-2: grab the placeID from response
        JsonPath js = new JsonPath(responseString); ////convert String to JSON
        String placeID = js.get("place_id");
        System.out.println("The place Id is :" + placeID);

        //Task-3: Delete the placeID from response
        given().
            queryParam("key", prop.getProperty("KEY")).
            body("{"+
                "\"place_id\": \""+placeID+"\""+
                "}").
            when().
            post(resources.getPostDeleteData()).
            then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().body("status", equalTo("OK")).and().
            body("place_id",equalTo(null));
    }
}
